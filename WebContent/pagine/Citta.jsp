<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Citta</title>
</head>



<body>
	<h1>Elenco Citta</h1>

	<div align="center" style="margin-top: 50px">
	
	<c:forEach var="listaCitta" items="${listaCitta}">

			<form action="Scelta">   <br>
			
				
				<a href="/MondoMVC/NazioneServlet?Name=${listaCitta}" >
				${listaCitta}
					
				</a> 
			
			
			</form>  
		</c:forEach>

	</div>
</body>
</html>