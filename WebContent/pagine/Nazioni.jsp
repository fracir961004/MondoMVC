<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Nazioni</title>

<body>
	<h1>Elenco Nazioni</h1>

	<div align="center" style="margin-top: 50px">

	
		<c:forEach var="listaNazioni" items="${risultato}" > <br>
		
			<a href="/MondoMVC/CittaServlet?Name=${listaNazioni}" >
				${listaNazioni}	
				</a>
		</c:forEach>

	</div>
</body>
</html>
</head>