<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>     
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>작업 목록</title>
</head>
<body>
<jsp:include page="../header.jsp"/>
<h1><a href='../../${teamName}'>${teamName}</a>
의 작업 목록</h1>
<p><a href='form'>새작업</a></p>
<table border='1'>
<tr>
    <th>번호</th><th>작업명</th><th>기간</th><th>작업자</th>
</tr>
<c:forEach items="${list}" var="task">
<tr>
    <td>${task.no}</td>    
    <td><a href='${task.no}'>${task.title}</a></td>    
    <td>${task.startDate} ~ ${task.endDate}</td>    
    <td>${task.worker == null ? "" : task.worker.id}</td>
</tr>
</c:forEach>
</table>
</body>
</html>


    