import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame f =new JFrame("List Example");
        DefaultListModel<String> l1=new DefaultListModel<>();
        l1.addElement("C++");
        l1.addElement("C#");
        l1.addElement("Java");
        l1.addElement("Flutter");
        JList<String> list =new JList<>(l1);
        list.setBounds(100,100,80,80);
        DefaultListModel<String> l2=new DefaultListModel<>();
        l2.addElement("Swing");
        l2.addElement("Laravel");
        l2.addElement("VueJs");
        l2.addElement("Bootstrap");
        JList<String> list1 =new JList<>(l2);
        list1.setBounds(100,200,80,80);
        list.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);//secim modelimi tekli yapacaktir bu komut coklu secime izin vermieyecektir
        JButton b=new JButton("Send");
        b.setBounds(200,150,100,30);
        b.addActionListener(new ActionListener() {
            String txt="";
            @Override
            public void actionPerformed(ActionEvent e) {
                if(list.getSelectedIndex()!=-1){ // -1 esit degilse secim yapilmis demektir
                    txt="Selected programing language: "+list.getSelectedValue();
                }
                if(list1.getSelectedIndex()!=-1){
                    txt+=" Selected Framework: ";
                    for(Object item: list1.getSelectedValuesList()){
                        txt+= item+" ";
                    }
                }
                System.out.println(txt);
                }
        });
        f.add(list);
        f.add(list1);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}