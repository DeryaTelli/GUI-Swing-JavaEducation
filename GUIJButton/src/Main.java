import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args ){
        //button.setBounds(x,y,width,height);
        JFrame frame =new JFrame("Button Example");
        JButton button=new JButton("Send");
        // textini su sekilde de yazabiliriz
        //button.setText("Send");
        button.setBounds(100,100,100,30);
        //butona tiklandiginda islemi gerceklestirmek icn sunu kullaniyoruz
        button.addActionListener(new ActionListener() {
            //ActionListener bir interface
            @Override
            public void actionPerformed(ActionEvent e) {
             //butona tiklandiginda yapilicak islemi buraya yaziyoruz
                System.out.println("Click button");
            }
        });

        frame.add(button);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);


    }
}