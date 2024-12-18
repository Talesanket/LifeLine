<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login - LifeLine Hospital</title>
</head>
<body>
    <h1>Login</h1>

    <form action="login" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required><br><br>
        
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br><br>
        
        <input type="submit" value="Login">
    </form>

    <p style="color:red;">${error}</p>
    <p style="color:green;">${message}</p>

    <br><a href="/">Back to Home</a>
</body>
</html>
