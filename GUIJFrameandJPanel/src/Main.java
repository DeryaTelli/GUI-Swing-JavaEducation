import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       //Graphical User Interface(GUI)
       //Swing:Sun Microsystems tarafindan piyasaya surulen resmi JAVA GUI aracidir
        JFrame frame = new JFrame();
        frame.setSize(200,200);//frame boyutunu ayarlama
        JPanel panel=new JPanel(); 
        JButton btn =new JButton("Buton");
        panel.add(btn);


        // sonda yazilir bu islemler
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);//frame gorunebilmesini buradan ayarliyorum



    }

}