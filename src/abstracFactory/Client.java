package abstracFactory;

/**
 * Created by ShengWei on 2016/11/29.
 */
public class Client {
    void makeShoes(ShoesFactory shoesFactory) {
        AbstractBottom abstractBottom = shoesFactory.createBottom();
        AbstractBody abstractBody = shoesFactory.createBody();
        AbstractStrap abstractStrap = shoesFactory.createStrap();
    }
}
