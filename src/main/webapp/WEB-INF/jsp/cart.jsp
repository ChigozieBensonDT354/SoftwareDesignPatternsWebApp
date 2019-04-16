<!DOCTYPE html>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Items!</title>
    <link href="/css/main.css" rel="stylesheet">
</head>
<body>
    <h2>Hello 
items</h2>
 <p>
   <h1> items in your cart :</h1>
    <c:forEach var="items" items="${lists}">
 
   <div class = "item"><div class="start"><img src="${items.image}" width="193", height="130"/>
   <p class="title"><form method="post" action="pay"><input type="hidden" name="itemId" value="${items.id}"><button id="loginButton" class="form-control">${items.title}</button></form></p></div></div> </c:forEach>
       
  
   
</body>
</html>
<a  href="${contextPath}/pay" name="items.id"  value="${items.id}">${items.title}</a>