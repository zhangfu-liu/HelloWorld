package test;

import sys.ControlSys;

/**
 * @Author AT-zfc
 * @Since 2020-06-09 12:22
 */
public class InputEquitTest {
    public static void main(String[] args) {
        ControlSys controlSys = new ControlSys ();
        System.out.println ("门禁系统测试-电子输入设备");
        System.out.println ("--------------------------------");
        while ( true){
            controlSys.getInputEquip ().inputB ();
            controlSys.word ();

        }
    }
}
