package Swing;

import qq.com.q1816894130.helloworld.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author AT-zfc
 * @Since 2020-03-23 13:35
 */
class MyJDialog extends JDialog{//创建一个弹出的对话框
    public MyJDialog(Jdialog frame){
        super(frame,"这是一个窗体对象",true);
        Container container = getContentPane();
        container.add(new Label("这是一个标签"));
        setBounds(100,100,150,150);
    }


    }

public class Jdialog extends JFrame {
    public static void main(String[]args){
        new Jdialog().setVisible(true);
    }
    public Jdialog(){
        Container container =getContentPane();//获取一个容器
        container.setLayout(null);//控制页面布局
        JLabel jl = new JLabel("这是一个JFrame窗体");
        jl.setHorizontalAlignment(SwingConstants.CENTER);//使用标签上的文字居中
        container.add(jl);
        JButton bl = new JButton("弹出对话框");
        bl.setBounds(10,10,100,100);
        bl.addActionListener(new ActionListener() {//鼠标响应事件

            public void actionPerformed(ActionEvent e) {
                new MyJDialog(Jdialog.this).setVisible(true);
            }
        });
        container.add(bl);
        container.add(jl);





    }

}
