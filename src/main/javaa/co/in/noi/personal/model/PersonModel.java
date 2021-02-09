package co.in.noi.personal.model;


import java.beans.Statement;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import Test.Student;
import co.in.Bean.BasicInfo;


public class PersonModel{
	private final static String url = "jdbc:mysql://localhost:3306/basic";
	private final static  String user = "root";
	private final static String password = "root";

	private static final String INSERT_USERS_SQL = "INSERT INTO basic_info VALUES (?, ?, ?, ?,?,?,?,?,?,?);";
	private static final String INSERT_USERS_SQL1 = "INSERT INTO Address VALUES (?, ?);";

private static final String COMMA_DELIMITER = ",";
	
	//Student attributes index
	private static final int FIRSTNAME = 1;
	private static final int LASTNAME = 2;
	private static final int DOB = 3;
	private static final int AGE = 4; 
	private static final int AddressLine1 = 5;
	private static final int AddressLine2 = 6;
	private static final int City = 7;
	private static final int State = 8;
	private static final int  Country = 9;
	private static final int Postal_Code = 10;
	
	
	@SuppressWarnings("unchecked")
	public static void readCsvFile(String fileName) {

		BufferedReader fileReader = null;
     
        try {
        	
        	//Create a new list of student to be filled by CSV file data 
        	List<Student> students = new ArrayList<Student>();
        	
            String line = "";
            
            //Create the file reader
            fileReader = new BufferedReader(new FileReader(fileName));
            
            //Read the CSV file header to skip it
            fileReader.readLine();
            
            //Read the file line by line starting from the second line
            while ((line = fileReader.readLine()) != null) {
                //Get all tokens available in line
                String[] tokens = line.split(COMMA_DELIMITER);
                if (tokens.length > 0) {
                	//Create a new student object and fill his  data
					BasicInfo student = new BasicInfo();
					students.addAll((Collection<? extends Student>) student);
				}
            }
            
            //Print the new student list
            for (Student student : students) {
				System.out.println(student.toString());
			}
        } 
        catch (Exception e) {
        	System.out.println("Error in CsvFileReader !!!");
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
            	System.out.println("Error while closing fileReader !!!");
                e.printStackTrace();
            }
        }

	}

	public static void save(BasicInfo bean ) throws Exception {
		System.out.println(INSERT_USERS_SQL);
		// Step 1: Establishing a Connection
		int status =0;
		
		try 
		{
			 Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, user, password);

				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL) ;
				PreparedStatement pre= connection.prepareStatement(INSERT_USERS_SQL1);
		
			preparedStatement.setString(1,bean.getFirstname());
			preparedStatement.setString(2, bean.getLastname());
			preparedStatement.setDate(3, new java.sql.Date(bean.getDOB().getTime()));
			preparedStatement.setString(4,bean.getAge());
			preparedStatement.setString(5, bean.getAdressline1());
			
			pre.setString(1, bean.getAdressline2());
			pre.setString(2,bean.getState());
			pre.setString(3,bean.getCity());
			pre.setString(4,bean.getCountry());
			pre.setInt(5,bean.getPostalode());

			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			preparedStatement.executeUpdate();
			pre.executeUpdate();
			
			
		
		}
		
				catch (SQLException e1) {

			// print SQL exception information
			System.out.println(e1);
		}
	 

		// Step 4: try-with-resource statement will auto close the connection.
	}
}