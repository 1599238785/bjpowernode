<%--
  Created by IntelliJ IDEA.
  User: 吾心
  Date: 2021/10/18
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${requestScope.user.id}  <!-- 为什莫这里不会显示用户的值-->
session:${sessionScope.USER.uid}<!-- 就是你可以永远在一个页面显示你的这个用户名称
生命周期
1.用户用浏览器访问网站，session开启当你在浏览器下访问的所有页面都关闭的话 session关闭
2.打开一个网站长时间不动 它会自动关闭30分钟


-->
</body>
</html>
