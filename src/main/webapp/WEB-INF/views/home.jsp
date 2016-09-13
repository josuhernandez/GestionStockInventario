<%@ include file="/WEB-INF/views/include.jsp" %>


<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	<a href="inventario">Ver inventario</a>  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<h2>Datos Request<a href="info">(pincha para verlos)</a></h2>
<ul>
	<li>IP:${requestIp}</li>
	<li>UserAgent:${requestUa}</li>
</ul>

</body>
</html>
