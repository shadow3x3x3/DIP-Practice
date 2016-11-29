package abstracFactory;

/**
 * Created by ShengWei on 2016/11/29.
 */
public interface ShoesFactory {
    public AbstractBottom createBottom();
    public AbstractBody createBody();
    public AbstractStrap createStrap();
}
