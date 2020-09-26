package Sql;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/**
 * @Author AT-zfc
 * @Since 2020-05-28 16:10
 */
    public class JDBCUtils {
    private  static  String url;
    private static  String use;
    private static  String password;
    private  static  String driver;


    /*
    文件读取只需一次就拿到代码块
    **/
    static {
        //创建properti集合
        Properties pro = new Properties ();

        //获取src路径下的方式 classloader
        ClassLoader classLoader=JDBCUtils.class.getClassLoader ();
          URL res=  classLoader.getResource ("jdbc.properties");
          String path = res.getPath ();
          System.out.println (path);
          //加载数据

        try {
            pro.load (new FileReader (path));
            url = pro.getProperty ("url");
            use = pro.getProperty ("use");
            password = pro.getProperty ("password");
            driver = pro .getProperty ("driver");
            //注册驱动
            Class.forName (driver);

        } catch (Exception e) {
            e.printStackTrace ();
        }
        //获取数据赋值


    }

    public static Connection getConnection() throws SQLException {


            return DriverManager.getConnection (url, use, password);


    }
    //创建关闭方法
    public static void  close(Statement st,Connection cn){
        if (st !=null ){
            try {
                st.close ();
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }
        if (cn !=null){
            try {
                cn.close ();
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }



    }//关闭方法的重载，
    public  static void close(ResultSet re, Statement st, Connection cn){
        if (re !=null){
            try {
                re.close ();
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }
        if (st !=null ){
            try {
                st.close ();
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }
        if (cn !=null){
            try {
                cn.close ();
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }


    }

}
