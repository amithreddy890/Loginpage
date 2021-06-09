<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<h2>How to fetch data from database in Spring MVC</h2>


	<table border="1">

		<th>userid</th>
		<th>password</th>
		<th>firstname</th>
		<th>lastname</th>
		<th>address</th>
		<th>phone</th>

		<c:forEach items="${u}" var="u1">
			<tr>
				
				<td>${u1.firstname}</td>
				<td>${u1.lastname}</td>
				<td>${u1.address}</td>
				<td>${u1.phone}</td>
				

			</tr>
		</c:forEach>
	</table>

</body>
</html>