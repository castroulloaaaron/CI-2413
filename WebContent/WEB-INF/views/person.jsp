<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC Form Handling</title>
</head>
<body>

	<h2>Submitted Student Information</h2>
	<table>
		<tr>
			<td>Name</td>
			<td>${person.name}</td>
		</tr>
		<tr>
			<td>Age</td>
			<td>${person.age}</td>
		</tr>
		<tr>
			<td>LastName</td>
			<td>${person.lastName}</td>
		</tr>
	</table>
</body>
</html>