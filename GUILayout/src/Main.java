import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame f =new JFrame("Layout Example");
        JButton b1=new JButton("b1");
        JButton b2=new JButton("b2");
        JButton b3=new JButton("b3");
        JButton b4=new JButton("b4");
        JButton b5=new JButton("b5");

        JPanel p=new JPanel();
        /*
        p.setLayout(new BorderLayout());
        p.add(b1,BorderLayout.NORTH);
        p.add(b2,BorderLayout.SOUTH);
        p.add(b3,BorderLayout.WEST);
        p.add(b4,BorderLayout.EAST);
        p.add(b5,BorderLayout.CENTER);

        p.setLayout(new GridLayout(3,2)); // 3 satirli 2 sutunlu
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        */

        p.setLayout(new FlowLayout(FlowLayout.RIGHT));
        //nesneleri soldan saga siralar
        //yaslanacagi yeride belirtiyor
        //new FlowLayout(FlowLayout.RIGHT) saga yaslanmasini sagliyor
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);


        f.add(p);
        //f.pack();//icindeki veri ne kadarsa o buyuklukte ise ona gore frame olusturuyor
        f.setSize(400,400);
        f.setVisible(true);
    }
}