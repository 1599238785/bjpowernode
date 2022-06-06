<%--
  Created by IntelliJ IDEA.
  User: 吾心
  Date: 2021/10/5
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="/say/hello">跳转</a><!-- 这是他要跳转的地址sayhello-->

<a href="/say/param1?uid=20212302">传参1</a><!--   <a href="show.jsp?name=tom&pass=123&score=78,5">连接</a>

1、超链接传值传递的都是String类型，如果需要其他类型，则需要进行类型转换
2、超链接传值有长度限制，最长不能超过255个字符，从?后开始算起
3.<a href="网站地址 ? 类型名=数值&类型名2=数值">传参</a>
-->

<a href="/say/param2?uid=2021230&uname=张三&sex=女">传参2</a>


<a href="/say/param3?uid=20212130&name=张三&sex=女">传参3</a>

<form action="/say/param4" method="post">
    学号:<input type="text" name="uid"/><br/>
    姓名:<input type="text" name="uname"/><br/>
    <input type="submit" value="提交"/>
    <input type="reset" value="重置"/>
</form>

<a href="/say/param5?uid=21050461030&uname=张三">实体传参</a>

</body>
</html>
