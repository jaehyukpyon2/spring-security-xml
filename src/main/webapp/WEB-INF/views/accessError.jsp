<%@ page contentType="text/html;charset=UTF-8" language="java"
         trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Access Denied</title>
</head>
<body>
    <h1>Access Denied Page</h1>
    <h2 style="color: blue"><c:out value="${SPRING_SECURITY_403_EXCEPTION.getMessage()}" /></h2>
    <h2 style="color: red"><c:out value="${msg}" /></h2>
</body>
</html>
