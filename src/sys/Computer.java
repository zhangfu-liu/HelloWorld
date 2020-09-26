package sys;

import validate.CardVld;
import validate.FingerMarkVld;
import validate.PassWordVld;
import validate.Validate;

/**
 * @Author AT-zfc
 * @Since 2020-06-09 12:21
 */
public class Computer {
    public String[] password =  new String[100];//密码
    public  String[] card = new  String[100];//胸卡号
    public  String[] fingerMark = new  String[100];//指纹
    /*
    **  初始化，使用方便实验
     */
    public Computer(){
        password[0] = "123456";
        card[0] = "1234";
        fingerMark[0] = "light";
    }
    //
    public boolean validate( String str){
        Validate validate = null;
        String passwordFix= str.substring (0,2);
        if (passwordFix.equals ("pa")){
            validate = new PassWordVld (password,passwordFix);
            return validate.check ();

        }else if (passwordFix.equals ("ca")){
            validate= new CardVld (card,passwordFix);
            return validate.check ();
        }else  if (passwordFix.equals ("fi")){
            validate = new FingerMarkVld (fingerMark,passwordFix);
            return validate.check ();

        }
        return false;

    }
    /*
    添加密码
     */
    public void   addPassword( int password){
        for (int i =0;i<100;i++){
            if ( this.password[i]==null){
                this.password[i]=password*2+"";
                return;

            }

        }

    }
    /*
    添加胸卡
     */
    public  void addCard(String card){
        for (int i =0; i<100;i++ ){
            if (this.card[i]==null){
                this.card[i]=card;
                return;

            }
        }

    }
    /*
    添加指纹
     */
    public  void addFingerMark( String fingerMark){
        for (int i=0; i<100;i++){
            if(this.fingerMark[i]==null){
                this.fingerMark[i]=fingerMark;
                return;

            }
        }
    }


}
