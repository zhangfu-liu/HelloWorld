package Swing;

import javafx.geometry.VPos;
import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

/**
 * @Author AT-zfc
 * @Since 2020-03-27 13:09
 */
public class JButtonTest extends JFrame{
    public JButtonTest(){
        /*URL url = MyImageIcon.class.getResource("/imageButton.jpg");
        Icon icon = new ImageIcon(url);
        setLayout(new GridLayout(3,2,5,5));//创建一个网格布局管理器
        Container c = getContentPane();//创建一个容器
        for (int i=0 ;i <5;i++){//添加按钮
            JButton j =new JButton("button"+i);
            c.add(j);
            if (i%2==0){//如果为双数时则按钮不可用
                j.setEnabled(false);
            }

        }
        JButton jb =  new JButton();//实例化一个文字与图片的按钮
        jb.setMaximumSize(new Dimension(90,30));//设置按钮与图片相同大小
        jb.setIcon(icon);//为按钮设置图标
        jb.setToolTipText("图片按钮");//设置按钮提示为文字
        jb.setHideActionText(true);
        jb.setBorderPainted(false);//设置按钮便捷不显示
        jb.addActionListener(new ActionListener() {//为此事件添加监听事件
            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null,"弹出对话框");

            }
        });
        c.add(jb);//添加按钮到容器去
    }
    public static void main(String[]args){
        new JButtonTest();
*/
        URL url = MyImageIcon.class.getResource("2.jpg") ;
        Container c = getContentPane();//创建一个容器
        Icon icon= new ImageIcon(url) ;//添加icon
        setLayout(new GridLayout(3,5,5,5));
        for (int i=0;i<5;i++){
            JButton j =new JButton();
            c.add(j);
            if (i%2==0){
                j.setEnabled(false);
            }
            JButton jb =  new JButton();
            jb.setMaximumSize(new Dimension(90,30));
            jb.setToolTipText("图片按钮");
            jb.setBorderPainted(false);
            jb.setHideActionText(true);
            jb.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null,"弹出对话框");
                }
            });

        }


    }
    public static void main(String[]args){
        new JButtonTest();

    }

}
