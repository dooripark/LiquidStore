<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>로그인 - LiquidStore</title>
</head>
<body>
    <h2>로그인</h2>

    <form action="${pageContext.request.contextPath}/members/login" method="post">
        <label for="username">아이디:</label>
        <input type="text" id="username" name="username" required><br><br>

        <label for="password">비밀번호:</label>
        <input type="password" id="password" name="password" required><br><br>

        <button type="submit">로그인</button>
    </form>

    <p>계정이 없으신가요? <a href="${pageContext.request.contextPath}/members/new">회원가입</a></p>
</body>
</html>
