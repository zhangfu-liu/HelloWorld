package Sql;

import java.sql.*;

/**
 * @Author AT-zfc
 * @Since 2020-05-28 10:46
 */
public class TeacherSql {
    public static void main(String[] args) {
        Connection con = null;
        Statement te = null;
        ResultSet rs = null;
        try {
            Class.forName ("com.microsoft.sqlserver.jdbc.SQLServerDriver");//1.注册驱动
          //2.获得连接对象
            String url = "jdbc:sqlserver://localhost:1433;Database=mange";
            String use ="sa";
            String password ="123456";
            con=DriverManager.getConnection ( url,use,password);
            //3.写sql语句

            String sql = "insert into teacher(num,name,sex,age,salary) values('1001','李华','女','38','4000')";
            String sql1 ="insert into teacher(num,name,sex,age,salary) values('1002','王刚','男','35','3750')";
            String sql2 ="insert into teacher(num,name,sex,age,salary) values('1003','张文','男','35','4800')";
            String sql3 ="insert into teacher(num,name,sex,age,salary) values('1004','刘茹心','女','35','3500')";
            String sql4=" update teacher set age=age+1 where  sex='男'";

            //4.获取对象
             te=con.createStatement ();
             te.executeUpdate (sql);
             te.executeUpdate (sql1);
             te.executeUpdate (sql2);
             te.executeUpdate (sql3);
             te.executeUpdate (sql4);

             int a= te.executeUpdate (sql4);

            System.out.println (a);
        } catch (Exception e) {
            e.printStackTrace ();
        }
        String sql5 =" select  * from teacher where sex='女'";
        try {
            rs =te.executeQuery (sql5);
            while (rs.next ()){
                int num = rs.getInt (1);
                String name = rs.getString ("name");
                String sex = rs. getString ("sex");
                int age =rs.getInt (4);
                int salary = rs.getInt (5);
                System.out.println (num+"---"+name+sex+"---"+age+"---"+salary);

            }
        } catch (SQLException e) {
            e.printStackTrace ();
        }
        finally {
            if (con!=null){
                try {
                    con.close ();
                } catch (SQLException e) {
                    e.printStackTrace ();
                }
            }

            if (rs!=null){
                try {
                    rs.close ();
                } catch (SQLException e) {
                    e.printStackTrace ();
                }
            }
        }
    }

}
