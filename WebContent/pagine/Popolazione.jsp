<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Popolazione</title>

<body>
	<h1>Elenco Popolazione</h1>

	<div align="center" style="margin-top: 50px">

	
		<c:forEach var="listaPopolazione" items="${risultato}" > <br>
		
			
			<a href="/MondoMVC/PopolazioneServlet?Population=${listaPopolazione}" >
				${listaPopolazione}	</a>
				
		</c:forEach>

	</div>
</body>
</html>
</head>