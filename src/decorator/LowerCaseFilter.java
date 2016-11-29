package decorator;

/**
 * Created by ShengWei on 2016/11/29.
 */
public class LowerCaseFilter extends AlphabetFilter {
    LowerCaseFilter(Writer writer) {
        super(writer);
    }

    public String write(String string) {
        string = super.write(string);
        String result = string.toLowerCase();
        System.out.println(string.toLowerCase());

        return result;
    }
}
