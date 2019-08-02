<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>continenti</title>
</head>



<body>
	<h1>Elenco Continenti</h1>

	<div align="center" style="margin-top: 50px">


		<c:forEach var="listaContinenti" items="${continenti}">
			<br>


			
			<select name="nazione">
			
		<option  value="lista"><a href="/MondoMVC/NazioneServlet?Continent=${listaContinenti}">
			
			${listaContinenti}
			
			</a></option>
</select>
			
			
		</c:forEach>
		
		
			
	</div>



</body>
</html>