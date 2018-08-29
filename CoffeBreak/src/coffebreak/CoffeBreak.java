package coffebreak;
import java.sql.*;
public class CoffeBreak {
    public static void main(String[] args) {
        /*try {
        //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Class.forName("jdbc:mysql://localhost/phpmyadmin/").newInstance();
        System.out.println("Kapcsolat létrejött!");
        }
        catch (Exception ex) {
            System.out.println("Nem sikerült létrehozni a kapcsolatot! Oka:" + ex);
        }*/
        
        String url = "jdbc:mysql://localhost/coffebreak";
        
        try{
        Connection con = DriverManager.getConnection(url, "coffebreak", "12345");
        System.out.println("Kapcsolódás sikeres!");
        
        
        
        
        
        String createTableCoffees = "CREATE TABLE COFFEES " +
                                    "(COF_NAME VARCHAR(32), SUP_ID INTEGER, PRICE FLOAT, " +
                                    "SALES INTEGER, TOTAL INTEGER)";
        
        Statement stmt = con.createStatement();
        stmt.executeUpdate("CREATE TABLE COFFEES " +
                           "(COF_NAME VARCHAR(32), SUP_ID INTEGER, PRICE FLOAT, " +
                           "SALES INTEGER, TOTAL INTEGER)");
        stmt.executeUpdate(createTableCoffees);
        
        
        }
        catch(SQLException ex){
            System.out.println("Nem sikerült létrehozni a kapcsolatot! Oka:" + ex);
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());            
        }
    }
    
}
