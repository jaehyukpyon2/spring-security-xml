<%@ page contentType="text/html;charset=UTF-8" language="java"
         trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Title</title>
</head>
<body>
<h1>Custom Login Page</h1>
<h2><c:out value="${error}" /></h2>
<h2><c:out value="${logout}" /></h2>

    <form method='post' action="/login">
        <div>
            <input type='text' name='username' value='admin'>
        </div>
        <div>
            <input type='password' name='password' value='admin'>
        </div>
        <div><input type='submit'></div>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    </form>
</body>
</html>
