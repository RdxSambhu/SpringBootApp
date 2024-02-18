<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome to BCC</title>

    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
        }

        #navbar {
            font-size: 50px;
            color: white;
            text-align: center;
            background-color: rgb(48, 36, 36);
            padding: 10px;
        }

        .container {
            display: flex;
            justify-content: center;
            background-color: rgb(231, 224, 224);
            padding: 20px;
            min-height: 100vh;
            box-sizing: border-box;
        }

        .items {
            background-color: rgb(161, 141, 141);
            width: 350px;
            height: fit-content;
            margin-top: 100px;
            margin-left: 70px;
            padding: 20px;
            box-sizing: border-box;
        }

        h2 {
            text-align: center;
        }

        form {
            display: flex;
            flex-direction: column;
        }

        .form-group {
            margin-bottom: 10px;
            margin-right: 20px;
        }

        .form-group label {
            display: block;
            margin-bottom: 5px;
        }

        .form-group input {
            width: 100%;
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        .button {
            display: inline-block;
            width: 40%;
            padding: 10px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            text-align: center;
            text-decoration: none;
        }

        .button:hover {
            background-color: #a1afbe;
        }

        h4 {
            color: red;
        }
    </style>
</head>

<body>
    <nav id="navbar">Welcome to Bright Coaching Centre</nav>
    
               <h4 style="margin: 0px;padding: 0px;">please use id = a and passwword = a </h4>
    <div class="container">
        <!-- Student login section -->
        <div class="items">
            <h2>Student Login</h2>
            <form action="/userHome" method="get">
                <div class="form-group">
                    <label for="studentid">Student ID:</label>
                    <input type="text" id="studentid" name="studentid" required>
                </div>
                <div class="form-group">
                    <label for="studentpassword">Password:</label>
                    <input type="password" id="studentpassword" name="studentpassword" required>
                </div>
                <div>
                    <button type="submit" class="button">Login</button>
                    <a href="/userHome" class="button">Register</a>
                </div>
            </form>
            <h4>${errorMsg}</h4>
        </div>
    </div>
    <script>
        history.pushState(null, null, location.href);
        window.onpopstate = function () {
            history.go(0);
        };
    </script>
</body>

</html>
