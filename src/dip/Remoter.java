package dip;

/**
 * Created by ShengWei on 2016/10/27.
 */
public interface Remoter {
    void on(RemoteController remoteController);
    void off(RemoteController remoteController);
    void up(RemoteController remoteController);
    void down(RemoteController remoteController);
}
