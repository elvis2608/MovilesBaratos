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
						<c:forEach var="movil" items="${movilGamero}">
							<header class="major">
								<h2>${movil.marca.nombre} ${movil.nombre}:</h2>
							</header>
							<span class="image main"><img src="${movil.foto}" /></span>
							<h2>CARACTERISTICAS:</h2>
							<h3>Precio: ${movil.precio}euros</h3>
							<h3>Procesador: ${movil.procesador}</h3>
							<h3>Nos quedan ${movil.stock} en almacen</h3>
							<h3>Memoria interna: ${movil.memoria}GIGAS</h3>
							<h3>Bateria: ${movil.bateria}mAh</h3>						
						</c:forEach>
					</tbody>
				</section>

			</div>
		</div>

		<!-- Sidebar -->
		<div id="sidebar">
			<div class="inner">

				<!-- Search -->
				<section id="search" class="alt">
					<form method="post" action="#">
						<input type="text" name="query" id="query" placeholder="Search" />
					</form>
				</section>

				<!-- Menu -->
				<nav id="menu">
					<header class="major">
						<h2>
							<a href='Servlet'>Marcas: </a>
						</h2>
					</header>
					<ul>
						<tbody>
							<c:forEach var="marca" items="${marcas}">

								<li><a href='Servlet?id=${marca.idMarca}'>
										${marca.nombre}</a></li>
							</c:forEach>
						</tbody>
					</ul>

				</nav>

				<!-- Section -->
				<section>
					<header class="major">
						<h2>Sobre nosotros:</h2>
					</header>
					<p>tienda Online de confianza, vendiendo moviles desde 2010</p>
					<ul class="contact">
						<li class="fa-envelope-o"><a href="#">information@untitled.tld</a></li>
						<li class="fa-phone">654 654 786</li>
						<li class="fa-home">Av San Juan nº136 bajo C <br /> Madrid,
							CC:24765
						</li>
					</ul>
				</section>

				<!-- Footer -->
				<footer id="footer">
					<p class="copyright">
						&copy; Pagina creada por Ruben, Elvis y Gamero: <a href="Servlet"></a>.
						Design: <a href="Servlet">movilesBaratos.com</a>.
					</p>
				</footer>

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
