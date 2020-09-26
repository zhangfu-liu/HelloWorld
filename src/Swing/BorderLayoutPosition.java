package Swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * @Author AT-zfc
 * @Since 2020-03-26 13:25
 */
public class BorderLayoutPosition extends JFrame {
    public BorderLayoutPosition(){
        String[]border={BorderLayout.WEST,BorderLayout.EAST,BorderLayout.NORTH,BorderLayout.SOUTH,BorderLayout.CENTER};
        String[]borderName={"你弟诶","s大卡","S谁打了","师大","大所"};
        setTitle("本窗体是边界布局管理器窗体");
        Container c =getContentPane();
        setLayout(new BorderLayout());
        for (int i=0;i<border.length;i++){

            c.add(border[i],new Button(borderName[i]));

        }
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
    public static void main(String[]args){
        new BorderLayoutPosition();
    }

}
