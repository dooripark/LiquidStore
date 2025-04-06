<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<h2>회원 목록</h2>
<table>
    <thead>
        <tr>
            <th>아이디</th>
            <th>이름</th>
            <th>이메일</th>
            <th>주소</th>
            <th>역할</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="member" items="${members}">
            <tr>
                <td>${member.username}</td>
                <td>${member.name}</td>
                <td>${member.email}</td>
                <td>${member.address}</td>
                <td>${member.role}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
