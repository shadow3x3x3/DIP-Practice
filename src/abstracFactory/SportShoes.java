package abstracFactory;

/**
 * Created by ShengWei on 2016/11/29.
 */
public class SportShoes implements ShoesFactory {
    @Override
    public AbstractBottom createBottom() {
        return new ShoesBottomA();
    }

    @Override
    public AbstractBody createBody() {
        return new ShoesBodyA();
    }

    @Override
    public AbstractStrap createStrap() {
        return new ShoesStrapB();
    }
}
