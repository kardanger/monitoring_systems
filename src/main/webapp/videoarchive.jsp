<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

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

<div class="container">
  <div class="row">
    <div class="col-sm">
    <p><strong>"${contextPath}/resources/video/09 01 Tasks.mp4"</strong></p>
      <video width="300" height="230" controls>
          <source src="${contextPath}/resources/video/09 01 Tasks.mp4" type="video/mp4">
          Your browser does not support the video tag.
        </video>
    </div>
    <div class="col-sm">
    <p><strong>"${contextPath}/resources/video/09 01 Tasks.mp4"</strong></p>
      <video width="300" height="230" controls>
          <source src="${contextPath}/resources/video/09 02 Creating a Babel Transpiling Task.mp4" type="video/mp4">
          Your browser does not support the video tag.
        </video>
    </div>
    <div class="col-sm">
    <p><strong>"${contextPath}/resources/video/09 01 Tasks.mp4"</strong></p>
          <video width="300" height="230" controls>
              <source src="${contextPath}/resources/video/09 03 Watching with Babel.mp4" type="video/mp4">
              Your browser does not support the video tag.
            </video>
     </div>
  </div>
  <div class="row">
      <div class="col-sm">
        <video width="300" height="230" controls>
            <source src="${contextPath}/resources/video/09 04 Transpiling TypeScript.mp4" type="video/mp4">
            Your browser does not support the video tag.
          </video>
      </div>
      <div class="col-sm">
        <video width="300" height="230" controls>
            <source src="${contextPath}/resources/video/09 05 OS Specific Commands.mp4" type="video/mp4">
            Your browser does not support the video tag.
          </video>
      </div>
      <div class="col-sm">
            <video width="300" height="230" controls>
                <source src="${contextPath}/resources/video/09 06 Problem Matchers.mp4" type="video/mp4">
                Your browser does not support the video tag.
              </video>
          </div>
    </div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
