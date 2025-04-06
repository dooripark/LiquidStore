<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>${product.name}</h1>
<p>${product.description}</p>
<p>Price: ${product.price}</p>
<img src="${product.imageUrl}" width="300" />
<a href="/cart/add?id=${product.id}">Add to Cart</a>