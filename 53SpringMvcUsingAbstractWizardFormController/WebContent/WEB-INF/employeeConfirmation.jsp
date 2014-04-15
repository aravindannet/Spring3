<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
  
<h1>EMPLOYEE DETAILS CONFIRMATION </h1>
<html>
<body>
	<form:form action="" method="POST" commandName="employee">
		Following are the details you entered :	 <br>
		Employee Name ${employee.name} <br>
		Employee Id ${employee.eid } <br>
		Salary  ${employee.salary }<br>
		City ${employee.city } <br>
		Country ${employee.country } <br>
		
		<input type="submit" value="Back" name="_target1">
		<input type="submit" value="Confirm" name="_finish">
		<input type="submit" value="Cancel" name="_cancel">
		
	
	</form:form>

</body>
</html>