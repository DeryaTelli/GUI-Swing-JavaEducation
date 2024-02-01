import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("JLabel Example");
        JLabel l1=new JLabel("Writing part");
        l1.setBounds(100,50,150,30);

        JButton bt=new JButton("Change");
        bt.setBounds(250,50,100,30);
        bt.addActionListener(new ActionListener() {
            int c=1; // counter 
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("Button was clicked "+c++);

            }
        });
        frame.add(bt);
        frame.add(l1);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}