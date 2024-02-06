import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame f= new JFrame("RadioButton Example");

        JRadioButton r1=new JRadioButton("Female");
        // parantez icindeki yerin ikinci indexine true veya false yaparak secilip secilmemesini ayarlayabiliriz
        r1.setBounds(100,50,100,30);
        r1.setActionCommand("F"); // aksiyonda verecek degeri belirledik

        JRadioButton r2=new JRadioButton("Male");
        r2.setBounds(100,100,100,30);
        r2.setActionCommand("M");
        //radio buttonlardan sadece birinin secilmesini istiyorsam bunun icin grup kullanmam gerekiyor

        JRadioButton r3=new JRadioButton("Uncertain");
        r3.setActionCommand("U");
        r3.setBounds(100,150,100,30);

        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        JButton bt=new JButton("Send");
        bt.setBounds(100,200,100,30);
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               System.out.println(bg.getSelection().getActionCommand());
               // gruptan secilen elemanin action al demek
            }
        });


        f.add(r1);
        f.add(r2);
        f.add(r3);
        f.add(bt);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
}