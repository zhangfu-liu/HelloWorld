package test;

import sys.ControlSys;
import user.Employee;

/**
 * @Author AT-zfc
 * @Since 2020-06-09 12:22
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee ("张无忌");
        ControlSys controlSys = new ControlSys ();
        System.out.println ("门禁系统--雇员测试");
        System.out.println ("-------------------------------------");
        while (true){
            employee.input (controlSys);
            controlSys.word ();
        }
    }

}
