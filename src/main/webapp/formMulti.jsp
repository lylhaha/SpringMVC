<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2016/9/23
  Time: 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form name="form" action="formMultiController" method="post">
  欢迎<input type="text" name="msg" value=""/><br />
  <input type="submit" name="method" value="insert"/><br>
  <input type="submit" name="method" value="update"/><br>
  <input type="submit" name="method" value="delete"/><br>

</form>

</body>
</html>
