<%--
  Created by IntelliJ IDEA.
  User: 吾心
  Date: 2021/10/14
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
登录成功
session:${sessionScope.user.uid}<!-- 就是你可以永远在一个页面显示你的这个用户名称-->
欢迎${requestScope.user.uid}<!--
意思是他会返回这个用户名称     可以这样理解 当浏览器访问是 他会带着这个 request对象（就是它里面原有的数据） 一起到
tomcat中  然后再一起返回到主页面

-->

<a href="/main.jsp">前往主页</a>>
</body>
</html>
