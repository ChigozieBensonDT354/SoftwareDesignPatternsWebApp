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

<form action="/searchProducts" method="GET"
				class="form-inline my-2 my-lg-0">
				<input id="keyword" name="keyword" class="form-control mr-sm-2"
					type="text" placeholder="Search">
				<button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
			</form>
			<br>
    <h2>Hello 
items</h2>
 <p>
   <h1> items to choose from</h1>
    <c:forEach var="items" items="${lists}">
    <c:choose>
    <c:when test="${!items.itemState}">Out of stock</c:when>
    <c:when test="${items.itemState}">In stock</c:when>
    </c:choose>
 
   <div class = "item"><div class="start"><img src="${items.image}" width="193", height="130"/>
   <p class="title"><form method="post" action="pay"><input type="hidden" name="itemId" value="${items.id}"><button id="loginButton" class="form-control">${items.title}</button></form></p></div></div> </c:forEach>
       
  <br>
   	
									<!--  >input id="loyaltyCard" name="loyaltyCard" class="form-control mr-sm-2"
					type="text" placeholder="Standard/Silver/Gold"-->
									 <form action="confirmLoyaltyCard" method="post">
									 <label for="Loyalty Card" class="control-label">Loyalty Card
										Type</label> <br><select id="loyaltyCard" name="loyaltyCard">
										<option  value="Standard">Standard</option>
										<option value="Silver">Silver</option>
										<option value="Gold">Gold</option>
									</select>
		<button id="itemButton" class="form-control">Confirm Loyalty Card</button>
		</form>
		<br>
		<h2>${card}</h2>
		<br>
		
  <form action="confirmCart" method="post">
		<button id="itemButton" class="form-control">Confirm CART</button>
		</form>
   
</body>
</html>
