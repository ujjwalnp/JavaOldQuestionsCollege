import java.sql.*;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class JDBCDemo {
    public static void main(String args[]) {
        try {
            String url = "jdbc:mysql://localhost:3306/jdbcdemo";

            // set username and passowrd
            String username = "root";
            String password = "";

            // define forName
            Class.forName(("com.mysql.cj.jdbc.Driver"));

            // create connection
            Connection connection = DriverManager.getConnection(url, username, password);

            // create statement
            Statement statement = connection.createStatement();

            // execute queries
            ResultSet resultSet = statement.executeQuery("SELECT * FROM student");

            while(resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4));

            }

            // close the connection
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
