/*
Write a progam to display only those records whose salary is more than 25000 from a table that contains id, name, post and salary of some employees.
 */
package JDBCDriver;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
public class Fall2019 {
    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3306/Company";
        String username = "root";
        String password = "";

        try {
            // Database Connection
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            // SQL Query
            String query = "SELECT * FROM Employee WHERE salary>25000;";

            // Execute Query
            ResultSet executeQuery = statement.executeQuery(query);
            if (executeQuery.next()) {
                int id = executeQuery.getInt(1);
                String name = executeQuery.getString(2);
                String post = executeQuery.getString(3);
                int salary = executeQuery.getInt(4);

                System.out.println(id +" "+ name +" "+ post +" "+ salary);
            }

            // Close the connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

/*
    JDBC driver is already outdated so we need to add manually in the "ProjectStructure>>Modules>>Dependencies"
*/

/*
    SQL QUERIES
    -  CREATE DATABASE Company;
    -  CREATE TABLE Student(id INT PRIMARY KEY NOT NULL,
                            name VARCHAR(30),
                            post VARCHAR(30),
                            salary INT);
    -  INSERT INTO Employee(id, name, post, salary) VALUES (1, "Pragya", "BE IT", 27500),
														(2, "Rajesh", "BE IT", 24499);

 */