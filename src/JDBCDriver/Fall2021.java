package JDBCDriver;

import java.util.Scanner;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Fall2021 {
    public static void main(String args[]) {
        String prompt;
        Scanner in = new Scanner(System.in);

        // url, username & password
        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "";

        try {
            // Connect to database
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            do {
                // Input from User
                System.out.println("What is id, name, address?");
                int id = in.nextInt();
                in.nextLine();
                String name = in.nextLine();
                String address = in.nextLine();

                // Query to update database
                String query = "INSERT INTO Student(id, name, address) VALUES (" + id + ", '" + name + "', '" + address + "');";

                // Execute Query
                statement.executeUpdate(query);

                // prompt
                System.out.println("Do you want to insert more data? (y/n)");
                prompt = in.nextLine();
            } while (prompt.equals("y"));

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
    -  CREATE TABLE Student(id INT PRIMARY KEY NOT NULL,
                            name VARCHAR(30),
                            address VARCHAR(30));
 */