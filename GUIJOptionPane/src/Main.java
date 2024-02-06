import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame f=new JFrame("OptionPane Example");
        //nesne olusturmadan kullanabiliriz
       // JOptionPane.showMessageDialog(f,"Hello, How are you today? ");
       // JOptionPane.showMessageDialog(f,"You subscribed","Subscribe",JOptionPane.WARNING_MESSAGE);
        String str =JOptionPane.showInputDialog(f,"Name");
        System.out.println(str);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}