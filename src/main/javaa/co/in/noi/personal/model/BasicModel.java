package co.in.noi.personal.model;
import java.io.*;
import java.sql.*;
import java.util.Date;
public class BasicModel {
 public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/basic_info";
        String username = "root";
        String password = "root";
 
        String csvFilePath = "Reviews-simple.csv";
 
        int batchSize = 20;
 
        Connection connection = null;
 
        try {
 
            connection = DriverManager.getConnection(jdbcURL, username, password);
            connection.setAutoCommit(false);
 
            String sql = "INSERT INTO BasicInfo (First_name, Last_name, DOB, Age , City , State , Country , PostalCode) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
 
            BufferedReader lineReader = new BufferedReader(new FileReader(csvFilePath));
            String lineText = null;
 
            int count = 0;
 
            lineReader.readLine(); // skip header line
 
            while ((lineText = lineReader.readLine()) != null) {
                String[] data = lineText.split(",");
                String FirstName = data[0];
                String LastName = data[1];
                String DOB  = data[2];
                String rating = data[3];
                
                statement.setString(1, FirstName);
                statement.setString(2, LastName);
 
                statement.setDate(7, new java.sql.Date(BasicModel.getExamDate().getTime()));
                Float fRating = Float.parseFloat(rating);
                statement.setFloat(4, fRating);
 
              //  statement.setString(5, comment);
 
                statement.addBatch();
 
                if (count % batchSize == 0) {
                    statement.executeBatch();
                }
            }
 
            lineReader.close();
 
            // execute the remaining queries
            statement.executeBatch();
 
            connection.commit();
            connection.close();
 
        } catch (IOException ex) {
            System.err.println(ex);
        } catch (SQLException ex) {
            ex.printStackTrace();
 
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
 
    }

private static Date getExamDate() {
	// TODO Auto-generated method stub
	return null;
}
}