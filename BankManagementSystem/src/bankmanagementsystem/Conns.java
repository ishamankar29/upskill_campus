
package bankmanagementsystem;
import java.sql.*;


public class Conns {
    Connection c;
    Statement s;
    public Conns(){
        try{
            //register driver
            //Class.forName(com.mysql.cj.jdbc.Driver);
            c = DriverManager.getConnection("jdbc:mysql:///bankms","root","Isha@mysql");
            s= c.createStatement();
            
        }catch(Exception e){
            System.err.println(e);
        }
    }

  
}
