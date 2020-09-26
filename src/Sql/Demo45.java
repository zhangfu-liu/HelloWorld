package Sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * @Author AT-zfc
 * @Since 2020-05-25 22:41
 */
public class Demo45 {
    public static void main(String[] args)  {
        Connection con= null;
        Statement ste= null;

        try {

            con=JDBCUtils.getConnection ();
            String sql ="delete from teacher";
            ste=con.createStatement ();
            int conut = ste.executeUpdate (sql);
            if(conut >0){
                System.out.println ("更新成功");
            }else {
                System.out.println ("更新失败");
            }
            System.out.println (conut);
        } catch (Exception  e) {
            e.printStackTrace ();
        }finally {
           JDBCUtils.close ( ste,con);
        }







    }

}
