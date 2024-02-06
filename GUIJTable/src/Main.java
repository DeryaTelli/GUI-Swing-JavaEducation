import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        JFrame f =new JFrame("Table example ");
        String[][]d={{"1","Mat","85"},{"1","Eng","85"},{"1","Tur","55"}};
        String[] title={"ID","LESSON","POINT"};
        JTable t=new JTable(d,title);
        t.setBounds(30,50,150,300);
        // title goztermek icin scroll pane kaydirma cubuklari olsuturmaliyiz
        JScrollPane s =new JScrollPane(t);// layoutlarin uzerine calistigi icin layout null verirsek calismaz
        f.add(s);
        f.setSize(400,400);
        f.setVisible(true);
    }
}