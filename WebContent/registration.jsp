<%@ page isELIgnored="false"%>
<html>
<head>
<title>Spring MVC user registration and login example using JdbcTemplate + MySQL</title>
</head>
<body>

	<h3>Spring MVC user registration and login example using JdbcTemplate + MySQL</h3>


	<form action="register" method="post">
		<pre>
	    <strong>Register Here | <a href="login.jsp">Click here to Login</a></strong>
		
		User Id: <input type="text" name="userId" />
		
		Password: <input type="password" name="password" />
		First Name:<input type="firstname" name="firstname">
		Last Name:<input type="lastname" name="lastname">
		Address:<input type="address" name="address">
		Phone :<input type="phone" name="phone">
	
		<input type="submit" value="Register" />
	</pre>
	</form>

	${msg}


</body>
</html>