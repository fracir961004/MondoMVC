<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nazioni</title>
</head>
<body>
 <h1>Nazioni del Continente scelto:</h1>
 
 <div align="center" style="margin-top: 50px">

 
 

 <c:forEach var="nazioneScelta" items="${Nazioni}" > <br>
		     
		 
			<a href="/MondoMVC/NazioneServlet?Name=${nazioneScelta}" >
				${nazioneScelta}	
				</a>
				 
		</c:forEach>
		</div> 
</body>
</html>