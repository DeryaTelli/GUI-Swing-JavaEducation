import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame f=new JFrame("Menu Example");
        JMenuBar mb=new JMenuBar();// menunun framedeki yerini bunla ayarladik
        mb.setBackground(Color.pink);
        JMenu menu=new JMenu("Main menu");// menubar yerine menuyu ekledik
        JMenu subM=new JMenu("Sub menu");
        JMenuItem mt=new JMenuItem("Menu 1");
        JMenuItem mt1=new JMenuItem("Menu 2");
        JMenuItem mt2=new JMenuItem("Menu 3");
        JMenuItem mt3=new JMenuItem("Menu 4");

        mt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f,"Menu was clicked");
            }
        });

        JMenuItem a1=new JMenuItem("Sub Menu 1");
        JMenuItem a2=new JMenuItem("Sub Menu 2");
        subM.add(a1);
        subM.add(a2);
        menu.add(subM);//menu icinde menu olusturduk
        menu.add(mt);
        menu.add(mt1);
        menu.add(mt2);
        menu.add(mt3);
        mb.add(menu);
        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}