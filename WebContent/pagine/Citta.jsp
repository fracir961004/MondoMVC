<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Citta</title>
</head>

<body>
	<h1>Le città della nazione scelta:</h1>

	<div align="center" style="margin-top: 50px">

		<c:forEach items="${elencoCitta}" var="city"> <br>
			<p> ${city.name} </p>
		</c:forEach>

	</div>

</body>
</html>