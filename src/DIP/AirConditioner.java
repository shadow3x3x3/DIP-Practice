package DIP;

/**
 * Created by ShengWei on 2016/10/27.
 */
public class AirConditioner implements Remoter {
    private boolean power;
    private int temperature;

    public AirConditioner() {
        power = false;
    }

    @Override
    public void on(RemoteController remoteController) {
        if (!power) {
            power = true;
            temperature = 25;
            remoteController.setStatus("The air conditioner is ON");
        }
    }

    @Override
    public void off(RemoteController remoteController) {
        if (power) {
            power = false;
            remoteController.setStatus("The air conditioner is OFF");
        }
    }

    @Override
    public void up(RemoteController remoteController) {
        if (power) {
            if (temperature < 30) {
                temperature ++;
            }
            remoteController.setStatus("The temperature is " +
                    temperature + " now");
        }
    }

    @Override
    public void down(RemoteController remoteController) {
        if (power) {
            if (temperature > 20) {
                temperature --;
            }
            remoteController.setStatus("The temperature is " +
                    temperature + " now");
        }
    }

    public String toString() {
        return "Air conditioner Connect";
    }
}
