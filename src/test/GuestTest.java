package test;

import com.sun.javafx.sg.prism.web.NGWebView;
import sys.ControlSys;
import user.Admin;
import user.Guest;

/**
 * @Author AT-zfc
 * @Since 2020-06-09 12:23
 */
public class GuestTest {
    public static void main(String[] args) {
        Guest guest = new Guest ("罗志祥");//访客
        Admin admin  = new Admin ("张六");//管理员
        ControlSys controlSys = new ControlSys ();
        System.out.println ("门禁系统测试-----访客");
        System.out.println ("----------------------------------");
        while (true){
            guest.passroo (controlSys);
            admin.work (controlSys);
            controlSys.word ();
        }
    }

}
