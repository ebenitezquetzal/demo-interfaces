<%@page import="com.qualitas.entities.Cliente"%>
<%@ page import="java.util.List" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel=StyleSheet href='CSS/estilos.css' type='text/css' media=screen>
<title>Insert title here</title>
</head>
<body>
	<h1>Catálogo de clientes</h1>
	
	<%
		List<Cliente> clientes = (List<Cliente>)session.getAttribute("clientes");		
		
	%>
	<table>
		<tr>
			<td class="tdazulmarino">Nombre</td>
			<td class="tdazulmarino">Dirección (Calle)</td>
			<td class="tdazulmarino">Número de Póliza</td>
		</tr>
		
		<%
			for(Cliente cliente:clientes)
			{
				out.println("<tr>");
				out.println("	<td>");
				out.println( 		cliente.getNombre());
				out.println("	</td>");
				out.println("	<td>");
				out.println( 		cliente.getDireccion());
				out.println("	</td>");
				out.println("	<td>");
				out.println( 		cliente.getPoliza().getNumero());
				out.println("	</td>");
				out.println("</tr>");
			}					
		%>		
	</table>
</body>
</html>