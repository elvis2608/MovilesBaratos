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

	  <div id="contenedor">
            <h2>LISTA DE MOVILES GUARDADOS:</h2>
            <div id="body">        
                <h3>LISTADO DE MOVILES</h3>
                <table border="1">
                    <thead>
                        <tr>
                            <th>foto</th>
                            <th>nombre</th>
                            <th>marca</th>
                            <th></th>
                            <th></th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="movil" items="${moviles}">
                            <tr>
                                <td><a href="#" class="image"><img src="${movil.foto}" alt="" /></a></td>
                                <td style="vertical-align: middle;">${movil.nombre}</td>
                                <td style="vertical-align: middle;">${movil.marca.nombre}</td>
                                <td style="vertical-align: middle;"><a href="ServletAdmin?operacion=detalles&id=${movil.idMovil}">Ver Detalles</a></td>
                                <td style="vertical-align: middle;"><a href="ServletAdmin?operacion=baja?id=${movil.idMovil}">Eliminar</a></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
                <p><a href="ServletAdmin?operacion=alta">Crear nuevo movil</a></p>

                <br/>
                <br/>
                <div id="listado"></div>
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