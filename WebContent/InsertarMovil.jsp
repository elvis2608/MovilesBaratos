<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


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
					
						<div id="formulario">
							
							<form action="ServletAdmin" method ="post">
							<h2> Datos del Movil nuevo</h2>
								<fieldset>
									
										<p>
											<label for="nombre"> Indique el nombre: </label>
											<input type="text" id="nombre" name="nombre" required>	
										</p>
										
										<p>
											<label for="procesador"> Indique el procesador: </label>
											<input type="text" id="procesador" name="procesador" required>	
										</p>
										
										<p>
											<label for="memoria"> Indique la memoria: </label>
											<input type="text" id="nombre" name="nombre" required>	
										</p>
										
										<p>
											<label for="bateria"> Indique la bateria: </label>
											<input type="text" id="nombre" name="nombre" required>	
										</p>
										
										<p>
											<label for="precio"> Indique el precio: </label>
											<input type="text" id="nombre" name="nombre" required>	
										</p>
										
										<p>
											<label for="stock"> Indique el stock: </label>
											<input type="text" id="nombre" name="nombre" required>	
										</p>
										
										<p>
											<label for="marca"> Seleccione la marca: </label>
											<select name="marcas">
											
											<c:forEach var="marca" items="${marcas}">
												<option> 
												
												<a href='Servlet?id=${marca.idMarca}'>${marca.nombre}</a> 
												
												</option>
											</c:forEach>
											
											
											</select>
										
										</p>
										
										<p>
											<input type="submit" value="CONFIRMAR">
											
											
										
										</p> 
								
								
								</fieldset>
							
							
							
							
							</form>
						
						</div>
														
					
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