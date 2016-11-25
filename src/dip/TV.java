package dip;

/**
 * Created by ShengWei on 2016/10/27.
 */
public class TV implements Remoter {
    private boolean power;
    private int channelNum;

    @Override
    public void on(RemoteController remoteController) {
        if (!power) {
            power = true;
            channelNum = 7;
            remoteController.setStatus("The dip.TV is ON");
        }
    }

    @Override
    public void off(RemoteController remoteController) {
        if (power) {
            power = false;
            remoteController.setStatus("The dip.TV is OFF");
        }
    }

    @Override
    public void up(RemoteController remoteController) {
        if (power) {
            if (channelNum == 15) {
                channelNum = 1;
            } else {
                channelNum ++;
            }
            remoteController.setStatus("The dip.TV is " +
                    channelNum + "channel now");
        }
    }

    @Override
    public void down(RemoteController remoteController) {

        if (power) {
            if (channelNum == 1) {
                channelNum = 15;
            } else {
                channelNum--;
            }
            remoteController.setStatus("The dip.TV is " +
                    channelNum + "channel now");
        }
    }

    public String toString() {
        return "dip.TV Connect";
    }
}
