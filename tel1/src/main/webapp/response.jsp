<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form Submission</title>
</head>
<body>
    <h2>Thank You, <%= request.getAttribute("name") %>!</h2>
    <p>Your Email: <%= request.getAttribute("email") %></p>
    <p>Your Message:</p>
    <p><%= request.getAttribute("message") %></p>
    <br>
    <a href="index.html">Go Back</a>
</body>
</html>