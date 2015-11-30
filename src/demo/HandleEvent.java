package demo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by luts on 2015/11/30.
 */
public class HandleEvent extends JFrame{
    public HandleEvent(){
        //创建两个按钮
        JButton jbtOK = new JButton("OK");
        JButton jbtCancel = new JButton("Cancel");

        JPanel panel = new JPanel();
        panel.add(jbtOK);
        panel.add(jbtCancel);

        add(panel);

        OKListenerClass listener1 = new OKListenerClass();
        CancelListenrClass listener2 = new CancelListenrClass();
        jbtOK.addActionListener(listener1);
        jbtCancel.addActionListener(listener2);

    }

    public static void main(String [] args){
        JFrame frame = new HandleEvent();
        frame.setTitle("Handle Event");
        frame.setSize(200, 150);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class OKListenerClass implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.out.println("OK button clicked");
    }
}

class CancelListenrClass implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.out.println("Cancel button clicked");
    }
}
