 <%@ include file="/WEB-INF/views/include.jsp" %>
 
 
 <h1>Personas</h1>
 
 
 Mostrar el listado
 
 <html>
  <head><title><fmt:message key="title"/></title></head>
  <body>
    <h1><fmt:message key="heading"/></h1>
    <p><fmt:message key="greeting"/> <c:out value="${fecha}"/></p>
    <h3>Personas</h3>
    <c:forEach items="${personas}" var="persona">
      <c:out value="${nombre}"/> <br>
    </c:forEach>
  </body>
</html>


<h3> 
	<a href=/formacion>Volver atras</a>
</h3>