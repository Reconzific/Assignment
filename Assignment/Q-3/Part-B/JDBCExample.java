import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", 
                "root", 
                "Backup@11"
            );
            PreparedStatement ps = con.prepareStatement("INSERT INTO students VALUES (?, ?)");
            ps.setString(1, "Yuvi");
            ps.setInt(2, 103);
            ps.executeUpdate();
            System.out.println("Connection Successful");
            System.out.println("Record Inserted");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
