<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<h1>EMPLOYEE DETAILS </h1>
<html>
<body>
	<form:form action="" method="POST" commandName="employee">
		
		Employee Name <form:input path="name"/> <form:errors path="name"></form:errors><br>
		Employee Id <form:input path="eid"/> <br>
		Salary <form:input path="salary"/><br>
		City <form:input path="city"/> <br>
		Country <form:input path="country"/> <br>
		
		<input type="submit" value="Next" name="_target1">
		
		
		
	  
	</form:form>

</body>
</html>