package JavaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Connect {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "Alok@8171";

        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect to MySQL (no DB selected)
            Connection con = DriverManager.getConnection(url, user, password);

            // 3. Create Statement
            Statement smt = con.createStatement();

            // 4. Create Database
            smt.executeUpdate("CREATE DATABASE IF NOT EXISTS test");

            // 5. Use Database
            smt.executeUpdate("USE test");

            // 6. Create Table
            smt.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS stu (" +
                            "roll INT, " +
                            "stuname VARCHAR(15), " +
                            "sage INT)"
            );

            System.out.println("Database & Table created successfully ✅");

            // 7. Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}