package decorator;

/**
 * Created by ShengWei on 2016/11/29.
 */
public class UpperCaseFilter extends AlphabetFilter {
    UpperCaseFilter(Writer writer) {
        super(writer);
    }

    public String write(String string) {
        string = super.write(string);
        String result = string.toUpperCase();
        System.out.println(string.toUpperCase());

        return result;
    }
}
