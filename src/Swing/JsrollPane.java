package Swing;

import javax.swing.*;
import java.awt.*;

/**
 * @Author AT-zfc
 * @Since 2020-03-26 14:14
 */
public class JsrollPane extends JFrame {
    public JsrollPane(){
        Container c = getContentPane();
        JTextArea ta =new JTextArea(20,50);
        JScrollPane pa =new JScrollPane(ta);
        c.add(pa);
        setTitle("使用jscrollpane创建窗体");
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    public static void main(String[]args){
        new JsrollPane();
    }


}
