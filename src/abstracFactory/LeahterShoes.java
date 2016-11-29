package abstracFactory;

/**
 * Created by ShengWei on 2016/11/29.
 */
public class LeahterShoes implements ShoesFactory {
    @Override
    public AbstractBottom createBottom() {
        return new ShoesBottomB();
    }

    @Override
    public AbstractBody createBody() {
        return new ShoesBodyB();
    }

    @Override
    public AbstractStrap createStrap() {
        return new ShoesStrapB();
    }
}
