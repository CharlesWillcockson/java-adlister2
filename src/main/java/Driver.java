import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/adlister_db";
        String user = "root";
        String password = "codeup";
        try{
           //Get a connection to database
            Connection myConn = DriverManager.getConnection(url, user, password);

           //Create a statement
           Statement stmt = myConn.createStatement();

           //Execute SQL query
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");
           //Process the result set
            while (rs.next()) {
                System.out.println(rs.getString("title"));
                System.out.println(rs.getString("description"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
