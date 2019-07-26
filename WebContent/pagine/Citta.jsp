<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Citta</title>
</head>

<body>
	<h1>Le citta della nazione scelta:</h1>

	<div align="center" style="margin-top: 50px">

		<c:forEach items="${elencoCitta}" var="city">
			<br>
			
			${city.name}
			
		   <div class="Azione">
		   
					<a href="EliminazioneServlet?id=${city.id}">Elimina</a>
					

			</div>


		</c:forEach>
		
		
	</div>
	
	<div align="center" style="margin-top: 50px">
	<a href="InserimentoServlet?id=${CittaInserita.id}">Inserisci</a>
	</div>
</body>
</html>