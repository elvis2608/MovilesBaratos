<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!--
Proyecto: 
Versión: 
Descripción: 
-->
<html>
<head>
<title>ENSAYO</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width">
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="css/restaurante.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h1>MOVILES BARATOS IN SESION</h1>
			<h2>Paso 01 - LISTA</h2>
		</div>
		<div id="main">
			<nav id="menu">

				<tbody>
					<ul>
						lista
						<c:forEach var="marcas" items="${marcas}">
							<tr>
								<li>valor</li>
								<li><a href="##">${marcas}</a></li>
							</tr>
						</c:forEach>

					</ul>
				</tbody>

			</nav>
		</div>
	</div>
</body>
</html>