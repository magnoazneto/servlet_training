<%@page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa" %>
<html>
<body>

	<ul>
	<%
		List<Empresa> lista = (List<Empresa>)request.getAttribute("empresas");
		for(Empresa empresa: lista) {
	%>
		<li> <%= empresa.getNome()  %></li>
	<%
		}
	%>
	
	</ul>

</body>
</html>