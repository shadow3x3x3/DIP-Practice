package decorator;

/**
 * Created by ShengWei on 2016/11/29.
 */
public class BufferredWriter implements Writer {
    @Override
    public String write(String string) {
        // Bufferred Writer default write
        return string;
    }
}
