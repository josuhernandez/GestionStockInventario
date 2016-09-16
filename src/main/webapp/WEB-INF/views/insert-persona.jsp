<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>

<title><fmt:message key="persona.crear.title"/></title>
<style>
    .error { color: red; }
  </style> 
</head>
<body>

<!-- Formulario con comando html normal -->
<h1><fmt:message key="persona.crear.title"/></h1>
 <form action="insertar-persona.html" method="post">
 	
 	<label for="nombre"><fmt:message key="persona.nombre"/></label>
 	<input name="nombre" value=""  placeholder="Escrbe tu nombre"/>
 	<br><br>
 	<label for="edad"><fmt:message key="persona.edad"/></label>
 	<input name="edad" value=""  placeholder="0-199"/>
 	<br><br>
 	<input type="submit" value=<fmt:message key="persona.boton.crear"/>  placeholder="Escrbe tu nombre"/>
 	<br><br>
</form>

<!-- Formulario con comando SPRING-->

<h1><fmt:message key="persona.crear.title"/></h1>

	<form:form commandName="persona" action="insertar-persona.html" method="post">
	
		<label for="nombre"><fmt:message key="persona.nombre"/></label>
		<form:input path="nombre" placeholder="Escribe tu nombre"/>
		<form:errors path="nombre" cssClass="error"/>
		<br><br>
		
		<label for="edad"><fmt:message key="persona.edad"/></label>
		<form:input path="edad"/>
		 <form:errors path="edad" cssClass="error"/>
		<br><br><br>		
		<input type="submit" value="<fmt:message key="persona.boton.crear"/>">
		
	</form:form>




<a href="<c:url value=""/>">Home</a>

</body>
</html>