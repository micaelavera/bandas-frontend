<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="bandas" />
</head>
<title>
Notificaciones
 </title>
 <asset:stylesheet src="listar.css"/>
 </head>
<h1>Notificaciones disponibles</h1>
<body>
 <ul>
<g:each in="${notificaciones}">
 <p>Te encontramos una banda que necesita una experiencia de ${it.busqueda.experiencia} con el instrumento </p>
 <p>${it.busqueda.instrumento}</p>
 </g:each>
 </ul>
</body>
</html>