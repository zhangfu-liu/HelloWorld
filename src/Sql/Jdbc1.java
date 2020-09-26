package Sql;

import java.sql.*;
import java.util.Scanner;

/**
 * @Author AT-zfc
 * @Since 2020-06-05 22:10
 */
public class Jdbc1 {
    public static void main(String[] args) {
        //输入密码用户
        Scanner sc = new Scanner ( System.in) ;
        System.out.println ("请输入你的用户名");
        String username = sc.next ();
        System.out.println ("请输入你的密码");
        String password = sc.next ();
        //创建对象
        boolean  flag=new Jdbc1 ().login (username,password);
        if (flag){
            System.out.println ("登陆成功");
        }else {
            System.out.println ("密码或者用户名出现错误");
        }



    }








    public boolean login(String username,String password){
        if (username!=null || password!=null){
            return false ;
        }
        Connection cn =null;
         PreparedStatement pr =null;
        ResultSet re =null;

        try {
            cn  =JDBCUtils.getConnection ();
            String sql="select * form se1 where username = ? and password = ? ";
            cn.prepareStatement (sql);
            pr.setString (0,username);
            pr.setString (0,password);

            re = pr.executeQuery ();
            return re.next ();

        } catch (SQLException e) {
            e.printStackTrace ();
        }
        finally {
            JDBCUtils.close (re,pr, cn);
        }


        return false;


    }


}
