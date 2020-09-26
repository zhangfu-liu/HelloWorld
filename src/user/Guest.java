package user;

import sys.ControlSys;

import java.util.Scanner;

/**
 * @Author AT-zfc
 * @Since 2020-06-09 12:24
 */
public class Guest {

    public String Name;//创建雇员的姓名
    //初始化
    public Guest(){

    }
    public Guest(String name){
        this.Name=name;

    }
    public void passroo(ControlSys controlSys){
        Scanner scanner = new Scanner (System.in);
        System.out.println ("访客"+this.getName ()+"按门铃?"+"y/n");
        String cn =scanner.nextLine ();
        if (cn.equals ("y")){
            controlSys.ring ();
            System.out.println ("门打开");
        }
        else {
            return;
        }

    }

    public String getName() {
        return Name;
    }

    public Guest setName(String name) {
        Name = name;
        return this;
    }

}
