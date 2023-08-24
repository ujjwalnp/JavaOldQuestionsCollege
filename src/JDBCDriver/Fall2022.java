/*
A database db_std contains a table tbl_std having field roll, name, faculty and mark. Write a program that does achieve the following:
i. Print the total number of stundents,
ii. Find the average mark.
 */

package JDBCDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Fall2022 {
    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3306/db_std";
        String username = "root";
        String password = "";

        try {
            // Connect to the database
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            // Task 1: Print the total number of students
            String countStudentQuery = "SELECT COUNT(*) FROM tbl_std";
            ResultSet executeCountStudentQuery = statement.executeQuery(countStudentQuery);
            if (executeCountStudentQuery.next()) {
                int totalStudents = executeCountStudentQuery.getInt(1);
                System.out.println("Total no. of Students: "+ totalStudents);
            }

            // Task 2: Find the average mark
            String avgQuery = "SELECT AVG(marks) FROM tbl_std";
            ResultSet executeAvgQuery = statement.executeQuery(avgQuery);
            if (executeAvgQuery.next()) {
                int avgMark = executeAvgQuery.getInt(1);
                System.out.println("Average mark: "+ avgMark);
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
    SQL QUERIES TO MAKE THE DATABASE

    CREATE DATABASE db_std;

    CREATE TABLE tbl_std(roll INT PRIMARY KEY NOT NULL,
                    name VARCHAR(30),
                     faculty VARCHAR(30),
                     marks INT);

    INSERT INTO tbl_std(roll, name, faculty, marks) VALUES (1, "Pragya", "BE IT", 87),
														(2, "Rajesh", "BE IT", 81);

 */

