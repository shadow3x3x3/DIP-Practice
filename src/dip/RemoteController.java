package dip;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Created by ShengWei on 2016/10/27.
 */
public class RemoteController extends JPanel implements ActionListener {
    private Remoter remoter;

    private JLabel status;
    private JButton turnOnBtn;
    private JButton turnOffBtn;
    private JButton setUpBtn;
    private JButton setDownBtn;

    public RemoteController() {
        status = new JLabel("Panel is created");
        status.setFont(status.getFont().deriveFont(65F));
        turnOnBtn  = new JButton("Turn ON");
        turnOffBtn = new JButton("Turn OFF");
        setUpBtn   = new JButton("Set UP");
        setDownBtn = new JButton("Set Down");
        addActionListeners();
        this.setLayout(new FlowLayout());
        addComponents();
    }

    public void connect(Remoter remoter) {
        this.remoter = remoter;
        setStatus(remoter.toString());
    }

    public void setStatus(String status) {
        this.status.setText(status);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Turn ON":
                remoter.on(this);
                break;
            case "Turn OFF":
                remoter.off(this);
                break;
            case "Set UP":
                remoter.up(this);
                break;
            case "Set Down":
                remoter.down(this);
                break;
        }
    }

    private void addActionListeners() {
        turnOnBtn.addActionListener(this);
        turnOffBtn.addActionListener(this);
        setUpBtn.addActionListener(this);
        setDownBtn.addActionListener(this);
    }

    private void addComponents() {
        this.add(turnOnBtn);
        this.add(turnOffBtn);
        this.add(setUpBtn);
        this.add(setDownBtn);
        this.add(status);
    }
}
