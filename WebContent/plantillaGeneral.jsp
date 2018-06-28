<!DOCTYPE html>
<!--
Proyecto: 
Versi�n: 
Descripci�n: 
-->
<html>
    <head>
        <title>ENSAYO</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/restaurante.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div id="wrapper">
            <div id="header">
                <h1>Restaurante v3e (Multi,MVC,JSP,JSTL)</h1>
                <h2>Paso 01 - Identificaci�n</h2>
            </div>
            <div id="main">
                <form action="Servlet" method="post">
                    <fieldset>
                        <legend>Datos del cliente</legend>
                        <p>
                            <label for="nombre">Indique su nombre:</label>
                            <input type="text" id="nombre" name="nombre" required />
                        </p>
                        <p>
                            <label for="habitacion">Indique el n�mero de habitaci�n:</label>
                            <input type="text" size="5" id="habitacion" name="habitacion" required />
                        </p>
                        <p>
                            <input type="submit" value="Realizar pedido" />
                        </p>
                    </fieldset>
                </form>
            </div>
        </div>
    </body>
</html>