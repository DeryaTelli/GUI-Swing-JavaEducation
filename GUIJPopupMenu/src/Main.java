import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    public static void main(String[] args)
    {
        JFrame f=new JFrame("PopupMenu Example");
        JPopupMenu p=new JPopupMenu("Menu");
        JMenuItem cut=new JMenuItem("cut");
        JMenuItem copy=new JMenuItem("copy");
        JMenuItem paste=new JMenuItem("paste");
        p.add(cut);
        p.add(copy);
        p.add(paste);
        f.addMouseListener(new MouseAdapter() {
            //mouse hareketlerini dinler icindeki methodlari override ederek kullanabiliriz
            @Override
            public void mouseClicked(MouseEvent e) {
                p.show(f,e.getX(),e.getY());

            }
        });
        cut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f,"Cut button was clicked");
            }
        });
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}