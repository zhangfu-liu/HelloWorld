package test;

import sys.ControlSys;
import user.Admin;

/**
 * @Author AT-zfc
 * @Since 2020-06-09 12:23
 */
public class AdminTest {
    public static void main(String[] args) {
        Admin admin =new Admin ("张六");//管理员
        ControlSys controlSys = new ControlSys ();//门禁系统
        System.out.println ("门禁系统管理员测试");
        System.out.println ("*****************************************");
        while (true){
            admin.work (controlSys);
            controlSys.word ();
        }
    }


}
