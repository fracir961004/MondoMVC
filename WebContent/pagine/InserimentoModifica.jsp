<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inserisci/Modifica Citta</title>
</head>
<body>

	<div align="center" style="margin-top: 50px">


		<form name="Inserisci" action="../InserimentoServlet">
			<br> <br> <input name="id" type="hidden"
				value="${param.id}">
			<p>
				Nome: <input name="name" type="text" value="${param.Name}">
				<!-- il param name serve per recuperare un parametro da una jsp diverso -->
			</p>

			<p>
				Popolazione: <input name="popolazione" type="number"
					value="${param.popolazione}">
			</p>

			<p>

			 <input name="code" type="hidden" value="${param.code}">

			</p>

			<!-- i parametri di sopra da dove li prendo?? Dalla insertupdate quindi aziono l'inserimento servlet e non città
			     servlet -->
			<br> <br> <input type="submit" value="Inserisci">

		</form>




	</div>


</body>
</html>