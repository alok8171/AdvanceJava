package JavaJDBC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_Insert {
    public static void main(String[] args) {
        try
        {
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String password = "Alok@8171";
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect to MySQL (no DB selected)
            Connection con = DriverManager.getConnection(url, user, password);

            //insert data
            PreparedStatement psmt=con.prepareStatement("insert into stu values (?,?,?)");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            while(true)
            {
                System.out.println("enter student ID");
                int roll=Integer.parseInt(br.readLine());
                System.out.println("enter student name");
                String stuname=br.readLine();
                System.out.println("enter student age");
                int age=Integer.parseInt(br.readLine());

                psmt.setInt(1, roll);
                psmt.setString(2, stuname);
                psmt.setInt(3, age);

                int count=psmt.executeUpdate();
                if(count>0)
                {
                    System.out.println(count+"student record inserted");

                }
                else {
                    System.out.println("no record inserted");
                }
                System.out.println("do you want to continue add record?[yes/no]");

                String ch=br.readLine();
                if(ch.equalsIgnoreCase("no"))
                {
                    break;
                }

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
