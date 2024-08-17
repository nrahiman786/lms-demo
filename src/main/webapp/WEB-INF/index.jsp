<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>LMS Simulation - Main Menu</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }
        .container {
            width: 60%;
            margin: 50px auto;
            background: #fff;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            color: #333;
            text-align: center;
        }
        ul.menu {
            list-style-type: none;
            padding: 0;
        }
        ul.menu li {
            margin: 10px 0;
        }
        a {
            text-decoration: none;
            color: #007BFF;
            font-size: 18px;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>LMS Simulation for DevOps Project</h1>
        <ul class="menu">
            <li><a href="login.jsp">Login Page</a></li>
            <li><a href="adminDashboard.jsp">Admin Dashboard</a></li>
            <li><a href="studentDashboard.jsp">Student Dashboard</a></li>
            <!-- Add more menu items as needed -->
        </ul>
    </div>
</body>
</html>
