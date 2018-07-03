<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<!--
	Editorial by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
<head>
<title>Editorial by HTML5 UP</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
</head>
<body class="is-preload">

	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Main -->
		<div id="main">

			<div class="inner">
				<a href="Servlet" class="logo"><strong></strong><img
					src="images/logoPrincipal.PNG" alt=""></img></a>
				<!-- Header -->
				<header id="header">

					<ul class="icons">
						<li><a href="#" class="icon fa-twitter"><span
								class="label">Twitter</span></a></li>
						<li><a href="#" class="icon fa-facebook"><span
								class="label">Facebook</span></a></li>
						<li><a href="#" class="icon fa-snapchat-ghost"><span
								class="label">Snapchat</span></a></li>
						<li><a href="#" class="icon fa-instagram"><span
								class="label">Instagram</span></a></li>
						<li><a href="#" class="icon fa-medium"><span
								class="label">Medium</span></a></li>
					</ul>
				</header>

				<!-- Section -->
				<section>
					<tbody>
						<c:forEach var="movil" items="${moviles2}">
							<header class="major">
								<h2>${movil.marca.nombre} ${movil.nombre}:</h2>
							</header>
							<span class="image main"><img src="${movil.foto}" /></span>
							<h2>CARACTERISTICAS:</h2>
							<h3>MARCA:</h3>
							<form action="ServletCrearMovil" method="post">
							<h3>
							<select>
								<option selected> ${movil.marca.nombre} </option>
							<c:forEach var="marca" items="${marcas}">
								<option> ${marca.nombre}</option>
							</c:forEach>
							</select>
							</h3>
							<h3>
								<label>Nombre:</label>
                            	<input type="text" name="Nombre" id="Nombre" value ="${movil.nombre}" placeholder="${movil.nombre}"/>
							</h3>
							<h3>
								<label>Precio(Euros):</label>
                            	<input type="text" name="Precio" id="Precio" value ="${movil.precio}" placeholder="${movil.precio}"/>
							</h3>
							<h3>
								<label>Procesador:</label>
                            	<input type="text" name="Procesador" id = "Procesador" value ="${movil.procesador}" placeholder="${movil.procesador}"/>
							</h3>
							<h3>
								<label>Stock disponible:</label>
                            	<input type="text" name="Stock" id = "Stock" value ="${movil.stock}" placeholder="${movil.stock}"/>
							</h3>
							<h3>
								<label>Memoria interna(Gb):</label>
                            	<input type="text" name="Memoria" id = "Memoria" value ="${movil.memoria}" placeholder="${movil.memoria}"/>
							</h3>
							<h3>
								<label>Bateria(mAh):</label>
                            	<input type="text" name="Bateria" id = "Bateria" value ="${movil.bateria}" placeholder="${movil.bateria}"/>
							</h3>
								<input type ="hidden" name="Idmovil" id = "Idmovil" value="${movil.idMovil}" />					
						</c:forEach>
							<div>
       							 <button type="submit">Aceptar</button>
       							 <button href="#">Cancelar</button>
   							</div>
   							</form>
										

   							
						</ul>
					</tbody>
				</section>

			</div>
		</div>

		

	</div>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/browser.min.js"></script>
	<script src="assets/js/breakpoints.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>

</body>
</html>
