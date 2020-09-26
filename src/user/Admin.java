package user;

import sys.ControlSys;

import java.util.Scanner;

/**
 * @Author AT-zfc
 * @Since 2020-06-09 12:24
 */
public class Admin extends Employee {
    //初始化
    public  Admin(){
        super();

    }
    public Admin(String name){
        super(name);

    }/*
    管理员工作方法：通过检测开启门
    */
   public void  work(ControlSys controlSys){
       Scanner scanner = new Scanner (System.in);
       System.out.println ("请管理员"+this.getName ()+"按下按钮");
       String stn = scanner.nextLine ();
       if (stn.equals ("y")){
           controlSys.setOpenDoor (1);
           System.out.println ("管理员"+this.getName ()+"开启了门");

       }else if (stn.equals ("exit")){
           controlSys.getInputEquip ().setInput ("exit");
       }
       else {
           System.out.println ("错误");


       }

    }
    /*
    管理员工作方法：检测访客

     */
    public  void work( ControlSys controlSys, Guest guest){
        if ( controlSys.getRoo ()==1){
            System.out.println ("访客"+this.getName ()+"按下了门铃");

        }else {
            System.out.println ("开门失败");
        }
    }
    /*
    管理员工作方法：录入新的信息
     */
   public void work(ControlSys controlSys,String valtype,String valsteam){
       if (valtype.equals ("pa")){
           controlSys.getComputer ().addPassword (Integer.parseInt (valsteam));
           System.out.println ("正在录入"+this.getName ()+"的密码");
       }else if (valtype.equals ("ca")){
           controlSys.getComputer ().addCard (valsteam);
           System.out.println ("正在录入"+this.getName ()+"的胸卡");
       }else if (valtype.equals ("fi")){
           controlSys.getComputer ().addFingerMark (valsteam);

       }else {
           System.out.println ("录入错误");
       }

   }

}
