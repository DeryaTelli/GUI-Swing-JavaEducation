import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test extends JFrame {

    private JPanel panel1;
    private JTextField textField1;
    private JButton button1;
    private JLabel Label1;

    public test(){
       add(panel1);
       setSize(400,400);
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       // formda carpiya basildiginda calismasini durdurucak
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Label1.setText(textField1.getText());
            }
        });
    }


}
