
package co.in.noi.personal.model;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import co.in.Bean.Address;


public class AddressModel {

			private final static String url = "jdbc:mysql://localhost:3306/basic";
		private final static  String user = "root";
		private final static String password = "root";

		private static final String INSERT_USERS_SQL = "INSERT INTO Address VALUES (?, ?, ?, ?, ?, ?);";

		

		public static void save(Address ad ) throws Exception {
			System.out.println(INSERT_USERS_SQL);
			// Step 1: Establishing a Connection
			int status =0;
			
			try 
			{
				 Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection(url, user, password);

					// Step 2:Create a statement using connection object
					PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL) ;
			
				preparedStatement.setString(1,ad.getAdressline1());
				preparedStatement.setString(2, ad.getAdressline2());
				preparedStatement.setString(3,ad.getState());
				preparedStatement.setString(4,ad.getCity());
				preparedStatement.setString(5,ad.getCountry());
				preparedStatement.setInt(6,ad.getPostalode());
				System.out.println(preparedStatement);
				// Step 3: Execute the query or update query
				preparedStatement.executeUpdate();
			
			}
					catch (SQLException e1) {

				// print SQL exception information
				System.out.println(e1);
			}
		 

			// Step 4: try-with-resource statement will auto close the connection.
		}
	}

