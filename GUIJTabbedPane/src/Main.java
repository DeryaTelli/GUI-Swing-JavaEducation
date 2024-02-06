import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame f=new JFrame("TabbedPane Example");

        JLabel l=new JLabel("First area");
        JPanel p=new JPanel();
        p.add(l);

        JLabel l1=new JLabel("Second Area");
        JPanel p1=new JPanel();
        p1.add(l1);

        JLabel l2=new JLabel("Third Area");
        JPanel p2=new JPanel();
        p2.add(l2);

        JTabbedPane tp =new JTabbedPane();
        tp.setBounds(100,100,100,100);
        tp.add("first",p);
        tp.add("second",p1);
        tp.add("third",p2);

        f.add(tp);
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
    }
}