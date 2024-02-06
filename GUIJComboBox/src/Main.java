import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args)
    {
        JFrame f =new JFrame("ComboBox Example");
        //combobox icine liste vermeliyiz
        String arr[] ={"C","C#","C++","Java","Python"};
        JComboBox c=new JComboBox(arr);
        c.setBounds(100,50,100,20);
        JButton bt=new JButton("Selected ");
        bt.setBounds(100,100,100,30);
        f.add(bt);
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Selected programing language: "+c.getSelectedItem());
                // ikinci yontem c.getItemAt(c.getSelectedIndex) secilen indexdeki degeri al demek
            }
        });
        f.add(c);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}