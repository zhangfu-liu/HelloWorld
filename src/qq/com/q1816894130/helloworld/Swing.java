package qq.com.q1816894130.helloworld;

import javax.swing.*;
import java.awt.*;
import java.security.PublicKey;

/**
 * @Author AT-zfc
 * @Since 2020-03-17 14:01
 */

    public class Swing extends JFrame{
       public void cjframe (String title){
           JFrame jf = new JFrame("我今天第一次创建窗体");
           Container container = jf.getContentPane();
           JLabel jl =new JLabel("我是一个标签");
           container.add(jl);
           container.setBackground(Color.CYAN);
           jf.setVisible(true);
           jf.setSize(200,150);
           jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
           jl.setHorizontalAlignment(SwingConstants.CENTER);

       }
       public static void main(String args[]){
           new Swing().cjframe("");
       }
    }









