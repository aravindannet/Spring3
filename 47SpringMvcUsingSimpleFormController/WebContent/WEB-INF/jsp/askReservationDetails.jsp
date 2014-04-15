<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>  
<head>
<title>Make Reservation</title>
</head>
<body>

<form:form commandName="reservation">

	<form:errors path="*" /> <br>

	Court Name <form:input path="courtName"/> <br>
	Date       <form:input path="date"/> <br>
	Hour       <form:input path="hour"/> <br>

		<input type="submit" value="Make Reservation"/>

</form:form>


</body>
</html>