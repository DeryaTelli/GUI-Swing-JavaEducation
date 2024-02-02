import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame f=new JFrame("PasswordField Example");
        JLabel l1=new JLabel("Passeword:");
        l1.setBounds(20,20,300,30);

        JPasswordField pass=new JPasswordField();
        pass.setBounds(20,50,100,30);
        JButton bt=new JButton("Send");
        bt.setBounds(20,100,100,30);
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pass1=new String(pass.getPassword());
                l1.setText(l1.getText()+pass1);
                //pass.getPassword()// char olarak getirecektir password field girilen degeri
            }
        });


        f.add(pass);
        f.add(l1);
        f.add(bt);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}