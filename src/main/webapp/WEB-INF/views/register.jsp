 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Patient Registration</title>
</head>
<body>
    <h2>Patient Registration Form</h2>
    <form action="register" method="post">
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName" required><br><br>

        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastName" required><br><br>

        <label for="gender">Gender:</label>
        <input type="text" id="gender" name="gender" required><br><br>

        <label for="dob">Date of Birth:</label>
        <input type="date" id="dob" name="dob" required><br><br>

        <label for="address">Address:</label>
        <input type="text" id="address" name="address" required><br><br>

        <label for="contactNumber">Contact Number:</label>
        <input type="text" id="contactNumber" name="contactNumber" required><br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>

        <label for="bloodType">Blood Type:</label>
        <input type="text" id="bloodType" name="bloodType" required><br><br>

        <label for="medicalHistory">Medical History:</label>
        <textarea id="medicalHistory" name="medicalHistory"></textarea><br><br>

        <input type="submit" value="Register">
    </form>

    <%
        if (request.getAttribute("message") != null) {
    %>
        <h3><%= request.getAttribute("message") %></h3>
    <%
        }
    %>
</body>
</html>
 