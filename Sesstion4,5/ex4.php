<html>
<head>
    <title>Employee Details</title>
</head>
<body>
<h4>
    Enter your details
</h4>
<form method=post action="emp_details.php"></form>
<table>
    <tr>
        <tc>employee ID</tc><br/>
        <tc><INPUT TYPE="text" NAME="emid"></tc>
    </tr>
    <br/>
    <tr><tc>name</tc><br/>
        <tc><INPUT TYPE="text" NAME="emid"></tc>
    </tr></br>
    <tr><tc>Department</tc>
        <tc>
            <INPUT TYPE="radio" NAME="dept" value="finance">finance
            <INPUT TYPE="radio" NAME="dept" value="marketing">marketing
            <INPUT TYPE="radio" NAME="dept" value="IT">IT

        </tc>
    </tr>
    </br><tr>
        <tc>Email</tc>
        <td><INPUT TYPE="text" NAME="email"></td>
    </tr>
</table>
<br>
<td><INPUT TYPE="submit" VALUE="submit"></td>
</body>
</html>
