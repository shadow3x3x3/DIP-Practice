package decorator;

import java.text.DecimalFormat;

/**
 * Created by ShengWei on 2016/11/29.
 */
public class CommaFilter extends NumberFilter {
    CommaFilter(Writer writer) {
        super(writer);
    }

    public String write(String string) {
        string = super.write(string);

        String numbers = "";
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isDigit(c)) {
                numbers += c;
            }
        }

        DecimalFormat decimalFormat = new DecimalFormat(",###");
        String numbersResult = decimalFormat.format(Integer.parseInt(numbers));

        System.out.println(string.replaceAll("[0-9]","") + numbersResult);
        return string;
    }
}
