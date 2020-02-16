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

    <title>Log in with your account</title>

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/common.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<div class="mx-auto" style="width: 1200px;">
   <h1> Просмотр информации о состоянии системы мониторинга<h1>
</div>

<div class="container">
  <div class="row">
    <div class="col-sm">
      <div class="container">
      <div class="card" style="width: 18rem;">
        <img src="${contextPath}/resources/image/2020-02-07_232750.jpg" class="card-img-top" alt="...">
        <div class="card-body">
          <h5 class="card-title">Камеры наблюдения</h5>
          <p class="card-text">Просмотр списка камер наблюдения. Местоположение камер. Видеоархивы камер.</p>
          <a href="${contextPath}/cameras" class="btn btn-primary">Перейти к списку</a>
        </div>
      </div>
      </div>
    </div>
    <div class="col-sm">
      <div class="container">
      <div class="card" style="width: 18rem;">
        <img src="${contextPath}/resources/image/2020-02-07_233024.jpg" class="card-img-top" alt="...">
        <div class="card-body">
          <h5 class="card-title">Датчики</h5>
          <p class="card-text">Просмотр списка датчиков. Местоположение датчиков. Состояние датчиков.</p>
          <a href="${contextPath}/sensors" class="btn btn-primary">Перейти к списку</a>
        </div>
      </div>
      </div>
    </div>
    <div class="col-sm">
      <div class="container">
      <div class="card" style="width: 18rem;">
        <img src="${contextPath}/resources/image/2020-02-07_233110.jpg" class="card-img-top" alt="...">
        <div class="card-body">
          <h5 class="card-title">Палубы</h5>
          <p class="card-text">Список палуб. Расположение камер на палубе. Расположение датчиков на палубе</p>
          <a href="${contextPath}/demo_decks" class="btn btn-primary">Перейти к списку</a>
        </div>
      </div>
      </div>
    </div>
  </div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
