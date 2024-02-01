import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame =new JFrame("JTextField Example");
        JLabel l1= new JLabel("Number 1");
        l1.setBounds(100,50,100,30);
        JLabel l2= new JLabel("Number 2");
        l2.setBounds(100,100,100,30);
        JLabel l3= new JLabel("Result");
        l3.setBounds(100,150,100,30);
        JTextField t1=new JTextField();
        t1.setBounds(200,50,100,30);
        JTextField t2=new JTextField();
        t2.setBounds(200,100,100,30);
        JTextField t3=new JTextField();
        t3.setBounds(200,150,100,30);
        t3.setEditable(false);// duzenlenme ozeligini kapatiyorum degeri kendi vericek programin cunku 
        JButton bt=new JButton("Collection");
        bt.setBounds(250,200,100,30);
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());// string degiskenini int olarak degistiriyr
                int b = Integer.parseInt(t2.getText());
                int collection=a+b;
                t3.setText(String.valueOf(collection));
            }
        });

        frame.add(bt);
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(t1);
        frame.add(t2);
        frame.add(t3);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}