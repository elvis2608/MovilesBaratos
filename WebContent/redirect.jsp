<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="utf-8">
 
    <script>
    window.onload=function(){
                // Una vez cargada la página, el formulario se enviara automáticamente.
		document.forms["miformulario"].submit();
    }
    </script>
</head>
 
<body>
 
<form name="miformulario" action="Servlet" method="POST">
	<input type="text" name="nombre" value="lista">
</form>
 
</body>
</html>