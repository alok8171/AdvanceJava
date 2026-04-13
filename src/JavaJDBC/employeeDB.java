package JavaJDBC;

import java.sql.*;

public class employeeDB {

    public static void main(String[] args) {

        String driver = "com.mysql.cj.jdbc.Driver";
        String host = "jdbc:mysql://localhost:3306/employeedb";
        String username = "root";
        String password = "Alok@8171";

        try {
            // 1️⃣ Load JDBC Driver
            Class.forName(driver);
            System.out.println("Driver loaded successfully");

            // 2️⃣ Connect to Database
            Connection connection = DriverManager.getConnection(host, username, password);
            Statement st=connection.createStatement();
            connection.setAutoCommit(false);
            int rowAffected=st.executeUpdate("INSERT INTO employee(name, salary, department) VALUES ('Akash', 4000, 'HR')");
            if (rowAffected>0)
            {
                Savepoint sp1 = connection.setSavepoint("inserted");
            }
             rowAffected=st.executeUpdate("""
                update employee set salary = 4000 where name = "alok"
""");

            if (rowAffected>0)
            {
                Savepoint sp2 = connection.setSavepoint("inserted");
            }
            connection.setAutoCommit(true);
//            CallableStatement cst= connection.prepareCall("{call getEMP()}");
//            ResultSet rs=cst.executeQuery();
//            System.out.println("Connected to database");
//
//            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//
//            // 3️⃣ Drop table if exists (clean start)
//            statement.executeUpdate("DROP TABLE IF EXISTS employee");
//
//            // 4️⃣ Create table with AUTO_INCREMENT ID
//            statement.executeUpdate("""
//                CREATE TABLE employee (
//                    id INT PRIMARY KEY AUTO_INCREMENT,
//                    name VARCHAR(100),
//                    salary DOUBLE,
//                    department VARCHAR(50)
//                )
//            """);
//            System.out.println("Table is ready");
//
//            // 5️⃣ Insert sample data WITHOUT id (AUTO_INCREMENT handles it)
//            statement.executeUpdate("""
//                INSERT INTO employee(name, salary, department)
//                VALUES ('Alok', 4000, 'HR'),
//                       ('Rahul', 6000, 'IT'),
//                       ('Amit', 7000, 'CS')
//            """);
//            System.out.println("Data inserted successfully");
//
//            // 6️⃣ Update salary > 5000 (+2000)
//            int rowsUpdated = statement.executeUpdate(
//                    "UPDATE employee SET salary = salary + 2000 WHERE salary > 5000"
//            );
//            System.out.println("Rows updated: " + rowsUpdated);
//
//            // 7️⃣ Fetch and display data
//            ResultSet rs = statement.executeQuery("SELECT * FROM employee");
//
//            System.out.println("\nID | NAME  | SALARY | DEPARTMENT");
//            System.out.println("-------------------------------");
//
//            while (rs.next()) {
//                rs.moveToInsertRow();
//                rs.updateString("name","id");
//                rs.updateDouble("salary",8000);
//                rs.updateString("department",rs.getString("department"));
//                break;
//            }
//
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                double salary = rs.getDouble("salary");
//                String department = rs.getString("department");
//
//                System.out.printf("%d | %s | %.2f | %s\n", id, name, salary, department);
//            }

            // 8️⃣ Close connection
            connection.close();
            System.out.println("\nConnection closed");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}