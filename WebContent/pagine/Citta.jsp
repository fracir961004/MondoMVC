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

			<!-- da qua devo andare alla jsp di inserimento. 
		
		perchè il percorso è file1.jsp/funzionalità.jsp/funzionalitàservlet/file1.jsp
		e non file.jsp/funzionalità.jsp
		- -->
			
		   <div class="Azione">
				 <br>${city.name}<br>
				<a href="EliminazioneServlet?id=${city.id}">Elimina</a> 
				<a href="/MondoMVC/pagine/InserimentoModifica.jsp?Name=${city.name}&id=${city.id}&popolazione=${city.population}">Modifica</a> <br>
				
				
			</div>

		</c:forEach>

		

		<a href="/MondoMVC/pagine/InserimentoModifica.jsp?id=0&code=${codice}">Inserisci</a>
		${param.name}
	</div>
</body>
</html>




</body>
</html>
