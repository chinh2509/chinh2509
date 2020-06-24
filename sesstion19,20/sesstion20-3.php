<?php
$logcookies = $_COOKIE['logname'];

echo "<html>";
echo "<head>";
echo "<title>home page</title>";
echo "</head>";
echo "<body>";
echo "<ALIGN='right'>";

ECHO "welcome $logcookies";
echo "<br><a href='logout.php'>logout</a>";
echo "<center>";
echo "<h3>shopper's Paradise</h3>";
echo "<h3>shop till you drop</h3>";
echo"<hr>";
echo"<br>";
echo"<table>";
echo "<tr align='center>";
echo "<td><a href='conf.php'>Confectionnery</a>";
echo "<tr align='center>";
echo "<td><a href='flowers.php'>flowers</a>";
echo "<tr align='center>";
echo "<td><a href='accessories.php'>accessories</a>";
echo "<tr align='center>";
echo "<td><a href='conf.php'>conf</a>";
echo "</tr>";
echo "<table>";
echo "</body>";
echo "</html>";
?>