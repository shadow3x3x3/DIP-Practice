package decorator;

/**
 * Created by ShengWei on 2016/11/29.
 */
public abstract class FilterWriter implements Writer {
    private Writer writer;

    FilterWriter(Writer writer) {
        this.writer = writer;
    }

    @Override
    public String write(String string) {
        return writer.write(string);
    }
}
