package Swing;

import qq.com.q1816894130.helloworld.Swing;

import javax.swing.*;
import java.awt.*;
import java.net.URI;
import java.net.URL;

/**
 * @Author AT-zfc
 * @Since 2020-03-24 14:43
 */
public class MyImageIcon  extends JFrame {
    public MyImageIcon() {
        /*Container container =getContentPane();//创建一个容器
        JLabel jl = new JLabel("这是一个jframe窗体",JLabel.CENTER);//创建一个标签
        URL uri = MyImageIcon.class.getResource("imagination.jpg");//一个图像的路径
        Icon icon = new ImageIcon(uri);//实例化对象
        jl.setIcon(icon);//把标签设置成图像
        jl.setHorizontalAlignment(SwingConstants.CENTER);//标签的居中
        jl.setOpaque(true);//设置不透明性
        container.add(jl);//添加一个标签为容器
        setSize(250,100);//设置窗体大小
        setVisible(true);//设置是否可见
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置退出方式
    }
    public static void main(String[]args){//调用
        new MyImageIcon().setVisible(true);
    }*/
        Container container=getContentPane();
        JLabel jl = new JLabel("我是一个JFrame标签",JLabel.CENTER);
        URL url =MyImageIcon.class.getResource("sdasdasdasd.jpg");
        Icon icon=new ImageIcon(url);
        jl.setOpaque(true);
        jl.setIcon(icon);
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
    public static void main(String [] args){
        new MyImageIcon();

    }
}
