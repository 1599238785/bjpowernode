<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 吾心
  Date: 2021/10/12
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
<style type="text/css">
    table,td,th{
        border: solid blue 1px;
        border-collapse: collapse;
    }

</style>

</head>
<body>
<table>
    <tr>
        <th>课程号</th>
        <th>课程名</th>
        <th>课  时</th>
    </tr>
<c:forEach items="${list}" var="c">
    <tr>
        <td>${c.cno}</td>
        <td>${c.cname}</td>
        <td>${c.classHour}</td>
    </tr>
</c:forEach>

</table>


</body>
</html>
