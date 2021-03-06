<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<%@page pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8");%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Архив видеозапсией</title>

        <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
        <link href="${contextPath}/resources/css/common.css" rel="stylesheet">

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
    <title>Customer Manager</title>
</head>
<body>

<div class="container">
<p><strong>Видеоархив</strong></p>
<table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">ИД</th>
      <th scope="col">ИД камеры</th>
      <th scope="col">Серийный номер камеры</th>
      <th scope="col">Состояние камеры</th>
      <th scope="col">Длительность</th>
      <th scope="col">Время начала записи</th>
      <th scope="col">URI</th>
    </tr>
  </thead>
  <tbody>
   <c:forEach items="${listVideoEntity}" var="entity">
              <tr>
                  <td>${entity.id}</td>
                  <td>${entity.camera.id}</td>
                  <td>${entity.camera.serial}</td>
                  <td>${entity.camera.status}</td>
                  <td>${entity.duration}</td>
                  <td>${entity.beginTime}</td>
                  <td>
                      <a href="/video?id=${entity.id}">${entity.uri}</a>
                  </td>
              </tr>
    </c:forEach>
  </tbody>
</table>
</div>

</body>
</html>