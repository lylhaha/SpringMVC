<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2016/9/23
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表单提交</title>
</head>
<body>
<form name="Form" action="FormController" method="post">
  欢迎<input type="text" name="msg" value=""/><br />
  <input type="submit" value="提交"/>
</form>

</body>
</html>
