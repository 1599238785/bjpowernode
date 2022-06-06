<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 吾心
  Date: 2021/10/12
  Time: 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<>
<c:if test="${c.classHour>64}">
    课时比较多
</c:if>
<c:if test="${c.classHour<=64}">
    课时比较少
</c:if>
<br>------------------------------<br>
<c:choose>
    <c:when test="${c.classHour>64&&c.classHour<=100}">
        可是较高
    </c:when>
    
<c:when test="${c.classHour<=64&&c.classHour>0}">
    欢迎教员登录，请管理并授课好班级，让学生多学东西
</c:when>

<c:otherwise>
    输出错了
</c:otherwise>

</c:choose>

<br/>##########################<br/>

<c:forEach var="i" begin="1"  end="10"  step="1">
    ${i}--${11-i}</br>
</c:forEach>


</body>
</html>
