<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>
    <h1>Dashboard</h1>
    <p>Welcome, <%= request.getAttribute("username") %>!</p>
    <a href="logout">Logout</a>
</body>
</html>
