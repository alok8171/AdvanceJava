package JavaJDBC;

import java.sql.*;

public class JDBC_Select {
    public static void main(String args[]) {
        try {
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String password = "Alok@8171";

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("select * from stu");

            while (rs.next()) {
                int roll = rs.getInt("roll");          // ✅ correct
                String name = rs.getString("stuname"); // ✅ correct
                int age = rs.getInt("sage");           // ✅ correct

                System.out.println("Roll: " + roll);
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("-------------------");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}