package decorator;

import java.text.DecimalFormat;

/**
 * Created by ShengWei on 2016/11/29.
 */
public class CountFilter extends NumberFilter {
    CountFilter(Writer writer) {
        super(writer);
    }

    public String write(String string) {
        string = super.write(string);
        DecimalFormat decimalFormat = new DecimalFormat(",###");
        String result = decimalFormat.format(string);

        System.out.println(result);
        return result;
    }
}
