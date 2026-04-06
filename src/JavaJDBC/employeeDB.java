package JavaJDBC;

import java.sql.*;

public class employeeDB {

    public static void main(String[] args) {

        String driver = "com.mysql.cj.jdbc.Driver";
        String host = "jdbc:mysql://localhost:3306/employeedb";
        String username = "root";
        String password = "Alok@8171";

        String create_table = """
            CREATE TABLE IF NOT EXISTS employee (
                id INT PRIMARY KEY,
                name VARCHAR(100),
                salary DOUBLE,
                department VARCHAR(50)
            )
        """;

        try {
            Class.forName(driver);
            System.out.println("Driver loaded successfully");

            Connection connection = DriverManager.getConnection(host, username, password);
            System.out.println("Connected to database");

            Statement statement = connection.createStatement();

            // Create table
            statement.execute(create_table);
            System.out.println("Table is ready");
            ResultSet rs=statement.executeQuery("SELECT * FROM employee");
            System.out.println("ID | NAME | SALARY | DEPARTMENT");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                long salary = rs.getLong("salary");
                String department = rs.getString("department");
                System.out.println(String.format("%d |%s |%d| %s",id,name,salary,department));
            }
//            statement.executeUpdate("""
//              INSERT INTO employee(id,name,salary,department)
//              VALUES (3,' raj',50000,'cs')
//           """);
            // Insert data
//            int rowAffected = statement.executeUpdate("""
//                INSERT INTO employee(id,name,salary,department)
//                VALUES (1,'alok',400000,'hr')
//            """);
//
//            if (rowAffected > 0) {
//                System.out.println("Record inserted successfully");
//            } else {
//                System.out.println("Record not inserted");
//            }

        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}