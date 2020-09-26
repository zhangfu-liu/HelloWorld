package Swing;

import javafx.scene.control.CheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author AT-zfc
 * @Since 2020-03-29 19:03
 */
class CheckBoxTeste extends JFrame {
    public CheckBoxTeste(){
        Container c = getContentPane();
       JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 =new JPanel();
        JTextArea jt =new JTextArea(10,10);
        JCheckBox jc1 = new JCheckBox("1");
        JCheckBox jc2 = new JCheckBox("2");
        JCheckBox jc3 = new JCheckBox("3");
        c.setLayout(new BorderLayout());
        c.add( panel1,BorderLayout.EAST);

        c.add(jc1);
        c.add(jc2);
        c.add(jc3);
        setVisible(true);
        setSize(200,300);
        final  JScrollPane scrollPane=new JScrollPane(jt);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        panel2.add(jc1);
        panel2.add(jc3);
        jc1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.append("复选框1被单击选中");
            }
        });
        jc2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.append("复选框2单机被选中");
            }
        });
        jc3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.append("复选框3单机被选中");
            }
        });



    }
    public static void main(String []args){
        new CheckBoxTeste();

    }

}
