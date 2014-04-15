<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

<html>
	<body>
		<form action="add.htm">
			Name <input type="text" name="name"><br>
			Phone <input type="text" name="phone"><br>
			E-mail <input type="text" name="email"><br>
			<input type="submit" value="Add Member"/>
		</form>

		<table border="1">
			<tr>
				<th>Name</th>   
				<th>Phone</th>
				<th>Email</th>
				<th></th>
			</tr>
			<c:forEach items="${members}" var="member">
				<tr>
					<td>${member.name}</td>
					<td>${member.phone}</td>
					<td>${member.email}</td>
					<td><a href="remove.htm?memberName=${member.name}">Remove</a></td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>