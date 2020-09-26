package Swing;

import javax.swing.*;
import java.awt.*;

/**
 * @Author AT-zfc
 * @Since 2020-03-26 12:46
 */
public class FlowLayoutPosition extends JFrame {
    public FlowLayoutPosition(){
       /* setTitle("本窗体使用流布局管理器");//标题
        Container container=getContentPane();//写一个容器
        setLayout(new FlowLayout(2,10,10));//设置窗体使用流布局管理器
        for (int i =0;i<10;i++) {//设置十个按钮
            container.add(new Button("button"+i));

        }
        setSize(300,200);//设置窗体的大小
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[]args){
        new FlowLayoutPosition();
    */
       setTitle("本窗体是一个流布局管理器窗体");
       Container container = getContentPane();
       setLayout(new FlowLayout(1,20,20));
       for (int i=0; i<10;i++){
           container.add(new Button("woshi"+i));
       }
       setSize(200,200);
       setVisible(true);
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        new FlowLayoutPosition();

    }


}
