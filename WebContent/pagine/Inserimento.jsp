<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>InserisciCitta</title>
</head>
<body>

	<div align="center" style="margin-top: 50px">

		<form name="Inserisci" action="../InserimentoServlet">

			<p>
				Nome: <input name="name" type="text" value="">
			</p>

			<p>
				Popolazione: <input name="popolazione" type="number"
					value="popolazione">
			</p>
			
			<!-- i parametri di sopra da dove li prendo?? Dalla insertupdate quindi aziono l'inserimento servlet e non città
			     servlet -->
			<input type="submit" value="Inserisci">

			
		</form>
		
		

	</div>

</body>
</html>