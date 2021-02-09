
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div align="center">
  <h1> Registration Form</h1>
  <form action="PersonCtl" method="post">
   <table style="with: 80%">
    <tr>
     <td>First Name</td>
     <td><input type="text" maxLength="20" name="firstName"  /></td>
    </tr>
    <tr>
     <td>Last Name</td>
     <td><input type="text" maxLength="20" name="lastName" /></td>
    </tr>
    <tr>
     <td>DOB</td>
     <td><input type="Date" name="DOB" /></td>
    </tr>
     <tr>
     <td>Age</td>
     <td><input type="number" name="Age" minvalue="24" maxvalue="70" /></td>
    </tr>
    <tr>
     <td>AddressLine1</td>
     <td><input type="text" name="AddressLine1" /></td>
    </tr>
    <tr>
     <td>AddressLine2</td>
     <td><input type="text" name="AddressLine2" /></td>
    </tr>
   <tr>
     <td>City</td>
     <td><input type="text" name="City" /></td>
    </tr>
    <tr>
     <td>State</td>
     <td><input type="text" name="State" /></td>
    </tr>
     <tr>
     <td>Country</td>
     <td><input type="text" name="Country" /></td>
    </tr>
     <tr>
     <td>PostalCode</td>
     <td><input type="number" id="zip" inputmode="numeric"  name="PostalCode" pattern="[0-6]*"/></td>
    </tr>
    
     
   </table>
   <input type="submit" name="operation" value="submit" />
  </form>
 </div>
</body>
</html>
