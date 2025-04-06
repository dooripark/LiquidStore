<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<h2>회원 가입</h2>
<form action="/members/save" method="POST">
    <label>아이디</label>
    <input type="text" name="username" required/>
    <br/>
    <label>이름</label>
    <input type="text" name="name" required/>
    <br/>
    <label>비밀번호</label>
    <input type="password" name="password" required/>
    <br/>
    <label>이메일</label>
    <input type="email" name="email" required/>
    <br/>
    <label>주소</label>
    <input type="text" name="address" required/>
    <br/>
    <label>역할</label>
    <input type="text" name="role" required/>
    <br/>
    <button type="submit">가입하기</button>
</form>
</body>
</html>
