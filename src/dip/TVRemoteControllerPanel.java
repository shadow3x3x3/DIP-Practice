package dip;

import javax.swing.*;

/**
 * Created by ShengWei on 2016/10/27.
 */
public class TVRemoteControllerPanel extends JFrame{
    private TVRemoteControllerPanel(String title) {
        super(title);
        RemoteController remoteController = new RemoteController();
        this.add(remoteController);
        this.setSize(800, 600);

        this.setVisible(true);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        remoteController.connect(new TV());

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        TVRemoteControllerPanel remoteController = new TVRemoteControllerPanel("DEMO");
    }
}
