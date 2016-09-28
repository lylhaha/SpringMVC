<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <title>抛出异常页面</title>
</head>
<body>
<%--<% Exception ex= (Exception) request.getAttribute("Exception");--%>

<%--%>--%>
<%
  Exception ex = (Exception) request.getAttribute("exception");
  //记录日志

%>
<h2>
  Exception : <%=ex.getMessage()%>
</h2>

</body>
</html>
