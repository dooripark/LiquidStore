<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>주문하기</h1>
<form action="/checkout" method="post">
    <label for="customerName">이름:</label>
    <input type="text" id="customerName" name="customerName" required>
    <br>
    <label for="shippingAddress">배송 주소:</label>
    <input type="text" id="shippingAddress" name="shippingAddress" required>
    <br>
    <button type="submit">주문하기</button>
</form>
