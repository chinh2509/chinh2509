<?php
$val1 = $_GET('logname');
$val2 = $_GET('pass');

setcookie("logname",$val1);
if ($val1=="")
{
    echo "please enter the name!";
    echo "<html>";
    echo "<head>";
    echo "<title>validate</title>";
    echo "</head>";
    echo "<body>";
    echo "<a href='information.html'>back</a>";
    echo "</body>";
    echo "</html>";
}
else{
    header("location: homepage.php");
}
?>