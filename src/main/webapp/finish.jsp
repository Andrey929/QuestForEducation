<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Sourse.Questionnaire" %>
<html>
<head>
    <style><%@ include file="static/main.css" %></style>
</head>
<body>

<div class="main">
    <h2><%= Questionnaire.getQuestion()%></h2>

</div>
<button id="buttonRestart" type="button" class="btn b1" onclick="window.location = '/init'"> Рестарт</button>
</body>
</html>
