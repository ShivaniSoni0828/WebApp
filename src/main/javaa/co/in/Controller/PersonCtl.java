package co.in.Controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.in.Bean.BasicInfo;
import co.in.noi.personal.model.PersonModel;

@WebServlet(name="PersonaCtl" ,urlPatterns="/PersonCtl")
public class PersonCtl extends HttpServlet{
	
	 
	
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	    	
	String op = request.getParameter("operation");
	

	        String firstName = null;
	        String LastName = null;
	        String DOB = null;
	        String Age = null;
	        String AddressLine1 = null;
	        String AddressLine2 =null;
	        String City=null;
	        String State=null;
	        String Country=null;
	        if ("true".equals(op)) {
				firstName = request.getParameter("firstName");
				System.out.println("first" + firstName);
				LastName = request.getParameter("LastName");
				DOB = request.getParameter("DOB");
				Age = request.getParameter("Age");
				AddressLine1 = request.getParameter("AddressLine1");
				AddressLine2 = request.getParameter("AddressLine2");
				City = request.getParameter("City");
				State = request.getParameter("State");
				Country = request.getParameter("Country");
				String contact = request.getParameter("PostalCode");
			}
		BasicInfo bf=new BasicInfo();
		
	       bf.setFirstname(firstName);
	       bf.setLastname(LastName);
	     SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yyyy");
			/* Date date=sf.parse("08-02-2021"); */
	            try {
					bf.setDOB(sf.parse(DOB));
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	            bf.setAge(Age);
	            bf.setAdressline1(AddressLine1);
	            bf.setAdressline2(AddressLine2);
	            bf.setCity(City);
	            bf.setState(State);
	            bf.setCountry(Country);

	        try {
	           if(op !=null) {
	            PersonModel.save(bf);
	           }
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

	        response.sendRedirect("");
	    }
}
