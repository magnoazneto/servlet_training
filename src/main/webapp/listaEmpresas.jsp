<%@page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	Lista de empresas: <br/>
	
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			<li> ${empresa.nome} </li>
		</c:forEach>
	</ul>

</body>
</html>