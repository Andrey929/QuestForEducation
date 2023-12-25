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
<button id="buttonWithPC" type="button" class="btn b1" onclick="window.location = '/logic?ans=1'"> Выбрать первый исход </button>
<button id="buttonWithPlayer" type="button" class="btn b2" onclick="window.location = '/logic?ans=2'"> Выбрать второй исход</button>
</body>
</html>
