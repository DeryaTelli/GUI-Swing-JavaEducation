import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
         JFrame f =new JFrame("CheckBox Example");
         JCheckBox ch=new JCheckBox("Yes");
         ch.setBounds(100,100,250,30);
         JCheckBox ch1=new JCheckBox("No");
         ch1.setBounds(100,150,100,30);
         JButton bt=new JButton("Control");
         bt.setBounds(100,200,100,30);
         bt.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 if(ch.isSelected()){
                     System.out.println(ch.getText()+ "was selected");
                 }else if(ch1.isSelected()){
                     System.out.println(ch1.getText()+ "No was selected");
                 }else{
                     System.out.println("Anything was selected");
                 }
             }
         });
         f.add(bt);
         f.add(ch);
         f.add(ch1);
         f.setSize(400,400);
         f.setLayout(null);
         f.setVisible(true);

    }
}