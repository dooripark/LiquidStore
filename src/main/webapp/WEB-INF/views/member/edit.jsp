<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>회원 수정</title>
</head>
<body>
    <h1>회원 수정</h1>
    <form action="/members/${member.id}" method="post">
        <label for="username">Username:</label>
        <input type="text" name="username" id="username" value="${member.username}" required><br>

        <label for="password">Password:</label>
        <input type="password" name="password" id="password" value="${member.password}" required><br>

        <label for="name">Name:</label>
        <input type="text" name="name" id="name" value="${member.name}" required><br>

        <label for="email">Email:</label>
        <input type="email" name="email" id="email" value="${member.email}" required><br>

        <label for="address">Address:</label>
        <input type="text" name="address" id="address" value="${member.address}" required><br>

        <label for="role">Role:</label>
        <input type="text" name="role" id="role" value="${member.role}" required><br>

        <button type="submit">회원 수정</button>
    </form>
    <a href="/members">회원 목록</a>
</body>
</html>
