package sys;

import java.awt.*;

/**
 * @Author AT-zfc
 * @Since 2020-06-09 12:22
 */
/*创建门禁系统
1.创建 电子门 输入设备，计算机 门铃和信号
2.初始化门禁系统
3.检查设备 关闭门，开起门需要检查信号，并设置门的关门时间，
*/

public class ControlSys {
    private Door door;//创建电子门
    private InputEquip inputEquip  ;//创建输入设备
    private int openDoor;//打开门信号,
     private   Computer computer ;//创建计算机
    private int roo;//创建门铃 1为响应 ，0为静音

    /*
    对门禁系统进行初始化

     */
    public ControlSys(){
       this. door= new Door ();
      this.inputEquip=new InputEquip ();
       this.computer= new Computer ();
        this.roo= 0;
        this.openDoor =0;
        System.out.println ("门禁系统使用方法为\n"+
                "1.模拟输入密码以pa开头，后跟密码\n"+
                "2.模拟刷卡以ca开头，后跟卡号\n"+
                "3.模拟指纹以fi开头，后跟输入字符\n"+
                "4.模拟管理员按下开门按钮输入键y");
        System.out.println ("------------------------");
        System.out.println ("门禁系统已经启动");

    }
    /*
     * 开始检查输入设备,输入缓存
     * */
    public  void word(){
        //检查缓存设备的输入缓存
       if (inputEquip.getInput ()!=null){
           if (inputEquip.getInput ().equals ("exit")){
               System.out.println ("电子门关闭");
               System.exit (0);
           }
           if(computer.validate (inputEquip.getInput ())){
               door.open ();//打开门
               System.out.println ("身份验证成功");
               inputEquip.setInput (null);

           }
            else {
                System.out.println ("身份验证失败");
            }
            //检查开门信号
            if(this.getOpenDoor ()==1){
                door.open ();
                System.out.println ("管理员打开了门");
                this.setOpenDoor (0);
            }
            //设置开门之后，停留时间
           if (door.getOPEN ().equals (Door.OPEN)){
               try {
                   Thread.sleep (6000);
               } catch (InterruptedException e) {
                   e.printStackTrace ();
               }
           }
           door.close ();
           System.out.println ("门已关闭");


        }


    }
    //设置门铃返回值
    public void ring(){
        this.roo=1;
    }
    public Door getDoor() {
        return door;
    }

    public ControlSys setDoor(Door door) {
        this.door = door;
        return this;
    }

    public InputEquip getInputEquip() {
        return inputEquip;
    }

    public ControlSys setInputEquip(InputEquip inputEquip) {
        this.inputEquip = inputEquip;
        return this;
    }

    public Computer getComputer() {
        return computer;
    }

    public ControlSys setComputer(Computer computer) {
        this.computer = computer;
        return this;
    }


    public int getRoo() {
        return roo;
    }

    public ControlSys setRoo(int roo) {
        this.roo = roo;
        return this;
    }

    public int getOpenDoor() {
        return openDoor;
    }

    public ControlSys setOpenDoor(int openDoor) {
        this.openDoor = openDoor;
        return this;
    }



}
