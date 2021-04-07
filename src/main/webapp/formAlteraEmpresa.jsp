<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/gerenciador/alteraEmpresa" method="post">
	
		Nome: <input type="text" name="nome" value="${ empresa.nome }"/>
		
		<input type="hidden" name="id" value="${ empresa.id }"/>
		<input type="submit"/>
	</form>

</body>
</html>