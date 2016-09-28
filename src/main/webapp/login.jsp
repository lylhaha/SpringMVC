<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2016/9/27
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>String MVC</title>
</head>
<body>
<form name="User" action="loginController" method="post">
  输入用户名：<input type="text" name="account" value="" /><br />
  输入密码：<input type="text" name="password" value="" /><br />
  <input type="submit" name="method" value="login"/>${status}

</form>

</body>
</html>
