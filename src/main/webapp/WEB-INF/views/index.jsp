
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>Province Id</th>
			<th>Province Name</th>
		</tr>
		<c:forEach var="province" items="${province}">
			<tr>
				<td>${province.provinceId } </td>
				<td>${province.provinceName } </td>
			</tr>
		</c:forEach>
	</table>	
</body>
</html>