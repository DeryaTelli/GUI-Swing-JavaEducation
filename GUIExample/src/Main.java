import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            //getSystemLookAndFellClassName() calistiginiz isletim sisteminin arayuz yapisini getiricektir
            //getCrossPlatformLookAndFellClassName() tum isletim sistemlerinin arayuz yapisi buda
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    test f = new test();
                    f.setVisible(true);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}