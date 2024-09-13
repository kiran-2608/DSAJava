import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class bank {
    public static void main(String[] args) throws SQLException{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "kiran@123");
        System.out.println("connected to the database");
        Statement st = con.createStatement();
        int s=st.executeUpdate("delete from Account where name='kiran'");
        System.out.println(s);
        st.close();
        con.close();
    }
}
