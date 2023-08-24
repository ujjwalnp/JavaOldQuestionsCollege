/*
    A database "pu" contains a table "Employee". Write a program that asks user to enter name, then query the database and display total number of employees with that name.
 */

package JDBCDriver;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Spring2021 {
    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3306/pu";
        String username = "root";
        String password = "";

        try {
            // Connect to the database
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            // Get user input for the name
            String name = getUserInput();

            // Construct the query
            String query = "SELECT COUNT(*) FROM Employee WHERE name = '" +name + "'";

            // Execute the query
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                System.out.println("Total number of employees with the name '"+name+"': "+count);
            }

            // Close the connection
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    // Helper method to get user input
    private static String getUserInput() {
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }
}

/*
    JDBC driver is already outdated so we need to add manually in the "ProjectStructure>>Modules>>Dependencies"
*/

/*
    SQL QUERIES TO CREATE DATABASE

    CREATE DATABASE pu;

    CREATE TABLE Employee(emp_id INT PRIMARY KEY NOT NULL,
                      name VARCHAR(30));

    INSERT INTO Employee(emp_id, name) VALUES (1, "Pragya"),
											(2, "Rajesh");
 */
