package JavaJDBC;

import java.io.*;
import java.sql.*;

public class JDBC_Update {
    public static void main(String[] args) {

        try {
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String password = "Alok@8171";

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("enter roll no:");
            int roll = Integer.parseInt(br.readLine());

            System.out.println("enter new age:");
            int age = Integer.parseInt(br.readLine());

            // ✅ PreparedStatement use karo
            PreparedStatement psmt = con.prepareStatement(
                    "UPDATE stu SET sage=? WHERE roll=?"
            );

            psmt.setInt(1, age);   // new age
            psmt.setInt(2, roll);  // roll number

            int count = psmt.executeUpdate();

            if (count > 0) {
                System.out.println("update success ✅");
            } else {
                System.out.println("update fail ❌");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}