<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>Following are the reservations for the court ${courtName} :</h1> <br>
  
<table>
  <tr>
    <th>CourtName</th>
    <th>Date</th>
	<th>Time</th>
  </tr>

<c:forEach items="${reservations}" var="reservation" >
  <tr>
    <td>${reservation.courtName}</td>
    <td>${reservation.date}</td>
	<td>${reservation.hour}</td>
  </tr>

</c:forEach>
  
</table>


