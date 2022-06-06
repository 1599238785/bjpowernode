<%--
  Created by IntelliJ IDEA.
  User: 吾心
  Date: 2021/10/9
  Time: 9:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
<form action="/course/add" method="post">
    课程名: <input type="text" name="cname"></br>
     课时: <input type="text" name="classHour"></br>
    <input type="submit" value="保存"/> <input type="reset" value="重置"/>
</form>
</body>
</html>
