package sys;

import java.util.Scanner;

/**
 * @Author AT-zfc
 * @Since 2020-06-08 11:09
 */
public class InputEquip {
    public  InputEquip(){

    }


    public static String input =null;
    public void inputB(){
        Scanner scanner = new Scanner (System.in);
        System.out.println ("身份验证");
         String passA=scanner.nextLine ();
         scanner.close ();
    }  public  String getInput() {
        return input;
    }

    public void setInput(String input) {
        InputEquip.input = input;
    }

}

