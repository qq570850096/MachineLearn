import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetConn
{
    public Connection conn=null;

    public Connection getConnection(){

            try{
                Class.forName("com.mysql.jdbc.Driver");
            }catch(Exception e){
                System.out.println("jdbc加载失败");
            }
                System.out.println("jdbc加载成功");
            String url="jdbc:mysql://192.168.1.198:3306/java_learn";
            //MySQL配置时的用户名
            String user = "root";
            //MySQL配置时的密码
            String password = "3Tjp9934";
            conn=DriverManager.getConnection(url,user,password);
            if(conn!=null){
                System.out.println("connectsuccess!");
            }
    }
}