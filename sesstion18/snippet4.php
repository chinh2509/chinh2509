<?php
$connect_mysql = mysqli_connect("localhost","root","");
$result = mysqli_query($connect_mysql,"SELECT * FROM ebookstore");
$rows = $result->num_rows;
echo "the table contains $rows rows<br>";
mysqli_close($connect_mysql);
echo "the conection to the database has been closed";
?>