import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Example2 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JLabel l1 = new JLabel("Choose!");
        l1.setBounds(100,180,300,30);
        JCheckBox ch = new JCheckBox("C++");
        ch.setBounds(100, 100, 250, 30);
        JCheckBox ch1 = new JCheckBox("Java");
        ch1.setBounds(100, 150, 100, 30);
        ch.addItemListener(new ItemListener() {
            // itemin yaptigi davranislari izler bu method
            @Override
            public void itemStateChanged(ItemEvent e) {
                //l1.setText(ch.getText());
                l1.setText("C++ selecting box "+(e.getStateChange()==1?"selected":"not selected"));
            }
        });
        ch1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
               // l1.setText(ch1.getText());
                l1.setText("Java selecting box "+(e.getStateChange()==1?"selected":"not selected"));
            //e.getStateChange degisim durumunu gostertiyor  
            }
        });

        f.add(l1);
        f.add(ch);
        f.add(ch1);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
