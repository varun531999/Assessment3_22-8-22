<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome To Sign-up Pages For Customer</h1>
<hr>
<p>Pls!! Enter All The Details Below</p>
<br>
<form action="getdata">
Customerid: <input type="number" name="c_id" required><br>
Customer Name : <input type="text" name="c_name" required><br>
Customer Phone : <input type="text" name="c_phone" required><br>
Customer Address : <input type="text" name="c_add" required><br>
Customer Login Id :  <input type="email" name="c_logig" required><br>
Customer Password :  <input type="password" name="c_pass" required><br>
<input type="submit" value="Submit">

</form>
	
</body>
</html>