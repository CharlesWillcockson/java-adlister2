import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/adlister_db";
        String user = "root";
        String password = "codeup";

        try{
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();
            String sql = "insert into ads" +
                    " (id, user_id, title, description) " +
                    " values ('2', '1', 'PS4 for sale', '12 buck and a pack of gum')";
            myStmt.executeUpdate(sql);
            System.out.println("insert complete");
        }
        catch (Exception e) {
            e.printStackTrace();

        }
    }
}
