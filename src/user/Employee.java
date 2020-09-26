package user;

import sys.ControlSys;

/**
 * @Author AT-zfc
 * @Since 2020-06-09 12:23
 */
//雇员
public class Employee extends Guest{

    public Employee(){
        super();

    }
    public Employee(String name){
        super(name);

    }
    /*
    雇员向门禁系统里面输入信息
     */
    public  void  input(ControlSys controlSys){
        controlSys.getInputEquip ().inputB ();

    }

}
