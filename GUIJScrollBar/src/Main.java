import javax.swing.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Main {
    public static void main(String[] args) {
        JFrame f =new JFrame("ScrollBar Example");
        JLabel l=new JLabel();
        l.setBounds(100,50,200,30);
        JScrollBar s=new JScrollBar(JScrollBar.VERTICAL,10,10,0,100);
        //new JScrollBar(JScrollBar.VERTICAL,0,10,0,100);
        // ilk 10 degeri ekran acildigindaki scrollbarin konumunu ayarliyor
        //ikinci 10 payinda genislik ayarliyor bastan ve sondan
        // min ve max degerini belirliyor

        // constructora verdigimiz degerle yatay mi dikey mi oldugunu ayarliyoruz
        s.setBounds(100,100,20,100);
        s.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                l.setText("ScrollBar Values "+ s.getValue());
            }
        });
        f.add(l);
        f.add(s);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}