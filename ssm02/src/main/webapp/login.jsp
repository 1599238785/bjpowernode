<%--
  Created by IntelliJ IDEA.
  User: 吾心
  Date: 2021/10/14
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="/login" method="post">
    用户名:<input type="text" name="uid" value="${user.uid}"><br/>
    密  码:<input type="password" name="pwd"/><br/>
 <input type="submit" value="登录"/>
 <input type="reset" value="重置"/>
</form>

</body>
</html>
