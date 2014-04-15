<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
 
<body>

	<form action="addEmployee.htm">
		Employee Name <input type="text" name="name"/> <br>
		Employee Id <input type="text" name="eid"/> <br>
		Salary <input type="text" name="salary"/> <br>
		City <input type="text" name="city"/> <br>
		Country <input type="text" name="country"/> <br>
		
		<input type="submit" value="Add Employee"/>
		
	
	</form>

</body>
</html>