<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>회원 정보</title>
</head>
<body>
    <h1>회원 정보</h1>
    <p>ID: ${member.id}</p>
    <p>Username: ${member.username}</p>
    <p>Name: ${member.name}</p>
    <p>Email: ${member.email}</p>
    <p>Address: ${member.address}</p>
    <p>Role: ${member.role}</p>

    <a href="/members">회원 목록</a>
    <a href="/members/${member.id}/edit">회원 수정</a>
    <form action="/members/${member.id}/delete" method="post">
        <button type="submit">회원 삭제</button>
    </form>
</body>
</html>
