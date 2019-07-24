<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Citta</title>
</head>



<body>
	<h1>Citta della nazione scelta</h1>

	<div align="center" style="margin-top: 50px">

		<c:forEach var="city" items="${elencoCitta}"> <br>
		       <p> ${city.name}</p> 
				</c:forEach>

	</div>

			
		
</body>
</html>