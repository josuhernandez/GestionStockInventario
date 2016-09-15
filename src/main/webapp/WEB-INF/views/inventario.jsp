<%@ include file="/WEB-INF/views/include.jsp" %>


<h1>INVENTARIADO</h1>

${hora}
<br>
${otro}
<br>

${products}
<br>


<html>
  <head><title><fmt:message key="title"/></title></head>
  <body>
    <h1><fmt:message key="heading"/></h1>
    <p><fmt:message key="greeting"/> <c:out value="${fecha}"/></p>
    <h3>Products</h3>
    <c:forEach items="${products}" var="prod">
      <c:out value="${prod.description}"/> <i>$<c:out value="${prod.price}"/></i><br><br>
    </c:forEach>
  </body>
</html>


<h3> 
	<a href=/formacion>Volver atras</a>
</h3>