package Swing;

import javax.swing.*;
import java.awt.*;

/**
 * @Author AT-zfc
 * @Since 2020-03-24 16:00
 */
public class Absoluteposition extends JFrame {
    public Absoluteposition(){
        setTitle("本窗体使用绝对布局");
        setBounds(0,0,200,150);
        setLayout(null);
        Container c = getContentPane();
        JButton b1=new JButton("按钮1");
        JButton b2=new JButton("按钮2");
        b1.setBounds(10,20,80,30);
        b2.setBounds(30,200,80,30);
        c.add(b1);
        c.add(b2);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    public static void main(String args[]){
        new Absoluteposition();
    }

}
