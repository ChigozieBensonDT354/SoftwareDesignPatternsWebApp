<!DOCTYPE html>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
 
   <div class = "item"><div class="start"><img src="${items.image}" width:193px, height:130px/><p class="title">${items.title}</p></div></div> </c:forEach>
       
  
   
</body>
</html>