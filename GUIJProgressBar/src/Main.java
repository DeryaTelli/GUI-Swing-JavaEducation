import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        JFrame f =new JFrame("ProgressBar Example");
        JProgressBar p=new JProgressBar(0,2000);// yuzdelik dilime bolup oyle ilerliyecek
        p.setBounds(40,40,160,30);
        p.setValue(0);
        p.setStringPainted(true);

        f.add(p);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

        int i=0;
        while (i<=2000){
            p.setValue(i);
            i+=20;
            try { // yavaslatmak icin kullandim 
                Thread.sleep(150);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}