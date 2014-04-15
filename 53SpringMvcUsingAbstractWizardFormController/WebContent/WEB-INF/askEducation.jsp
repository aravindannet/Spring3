<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<h1>EMPLOYEE QUALIFICATION DETAILS </h1>  
<html>
<body>
	<form:form action="" method="POST" commandName="employee">
		
		Qualification<form:input path="qualification"/> <br>
		Branch <form:input path="branch"/> <br>
		College <form:input path="college"/><br>
				
		
		<input type="submit" value="Back" name="_target0">
		<input type="submit" value="Next" name="_target2">
		
	
	</form:form>

</body>
</html>