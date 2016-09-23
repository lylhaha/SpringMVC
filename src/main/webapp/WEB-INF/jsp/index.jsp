<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page isELIgnored="false"%>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2016/9/22
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
hello ${helloWord}
<c:out value="${helloWord}"></c:out>
</body>
</html>
