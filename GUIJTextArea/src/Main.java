import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args)
    {
        JFrame f=new JFrame("TextArea Example");
        JLabel l1 ,l2;
        JTextArea area;
        JButton bt;
        l1=new JLabel();
        l1.setBounds(50,25,100,30);
        l2=new JLabel();
        l2.setBounds(160,25,100,30);
        area=new JTextArea();
        area.setBounds(20,75,300,200);
        bt=new JButton("Calculate");
        bt.setBounds(100,300,120,30);
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text =area.getText();
                String words[]=text.split("\\s");
                //birseyleri bolmek ve ayirmak icin kullaniliyor bu method
                l1.setText("Word: "+words.length);
                l2.setText("Character: "+text.length());

            }
        });

        f.add(l1);
        f.add(l2);
        f.add(area);
        f.add(bt);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}