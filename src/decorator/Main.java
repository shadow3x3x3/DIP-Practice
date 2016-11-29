package decorator;

/**
 * Created by ShengWei on 2016/11/29.
 */
public class Main {
    private static final String TEST = "THIS is A Test 12309092";

    public static void main(String[] args) {
        Writer w = new BufferredWriter();
        Writer w2 = new LowerCaseFilter(w);
        w2.write(TEST);
        Writer w3 = new CommaFilter(w2);
        w3.write(TEST);
    }
}
