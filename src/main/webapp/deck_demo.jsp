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

        <title>Палубы</title>

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

<div class="position-fixed" style="top: 50px; left: 200px">

<div class="container">

   <div class="row">
        <div class="row mr-auto ml-auto">
            <div class="container">
                <h1> Список палуб </h1>
              </div>
         </div>
   </div>

   <div class="row">
             <div class="row mr-auto ml-auto">
                  <nav aria-label="Page navigation example">
                     <ul class="pagination">
                    <li class="page-item"><a class="page-link" href="${contextPath}/demo_decks?id=${prevId}">Previous</a></li>

                  <c:forEach items="${listDecks}" var="deck">
                       <li class="page-item"><a class="page-link" href="${contextPath}/demo_decks?id=${deck.id}">${deck.id}</a></li>
                   </c:forEach>

                  <li class="page-item"><a class="page-link" href="${contextPath}/demo_decks?id=${nextId}">Next</a></li>
                  </ul>
             </nav>
          </div>
    </div>

        <div class="container">
            <h1> ${listDecks[currentIndex].name} </h1>
            <img src="${contextPath}/resources/image/${listDecks[currentIndex].linkImg}" class="img-fluid" alt="Responsive image">
        </div>

        <div class="row">
            <div class="row mr-auto ml-auto">
                 <div class="btn-group" role="group" aria-label="Basic example">
                     <a href="${contextPath}/camera_by_deck?id=${currentId}" class="btn btn-secondary">Список камер</a>
                     <a href="${contextPath}/sensor_by_deck?id=${currentId}" class="btn btn-secondary">Список датчиков</a>
                     <a href="${contextPath}/videos_by_deck?id=${currentId}" class="btn btn-secondary">Видеоархив</a>
                 </div>
             </div>
         </div>
</div>
</div>

</body>
</html>
