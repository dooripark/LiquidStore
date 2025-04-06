<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Your Cart</h1>
<table>
    <tr>
        <th>Product</th>
        <th>Quantity</th>
        <th>Action</th>
    </tr>
    <c:forEach var="cart" items="${cart}">
        <tr>
            <td>${cart.productId}</td>
            <td>${cart.quantity}</td>
            <td>
                <form action="/cart/remove" method="post">
                    <input type="hidden" name="productId" value="${cart.productId}" />
                    <button type="submit">Remove</button>
                </form>
            </td>
        </tr>
    </c:forEach>
</table>

<a href="/order/checkout">주문하기</a>
