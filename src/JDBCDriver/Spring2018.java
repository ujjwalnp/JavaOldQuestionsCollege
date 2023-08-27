/*
A database "testdb" contains a table "employee" with some records having id, name, post, salary. WAP to update the salary to 50000 whose post is "Manager".
 */
package JDBCDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
public class Spring2018 {
    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "";
        
        try {
            // Database connection
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            // SQL Query
            String query = "UPDATE employee SET salary=50000 WHERE post='Manager';";

            // Execute Query
            statement.executeUpdate(query);

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
    -  CREATE DATABASE testdb;
    -  CREATE TABLE employee(id INT PRIMARY KEY NOT NULL,
                            name VARCHAR(30),
                            post VARCHAR(30),
                            salary INT);
    -  INSERT INTO employee(id, name, post, salary) VALUES (1, "Pragya", "Manager", 27500),
														(2, "Rajesh", "BE IT", 24499);

 */
