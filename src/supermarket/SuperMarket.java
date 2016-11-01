package supermarket;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.*;

public class SuperMarket {
    int countItem;
    SuperMarket(){
        
    }
    
    public static void main(String args[]){
        try
    {
      // create a java mysql database connection
      String myDriver = "org.gjt.mm.mysql.Driver";
      String myUrl = "jdbc:mysql://localhost:3306/supermarket";
      Class.forName(myDriver);
      Connection connectDB = (Connection) DriverManager.getConnection(myUrl, "root", "root");
      Statement stmt;
      stmt = (Statement) connectDB.createStatement();
      
      
      connectDB.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }

      
    }
    
}
