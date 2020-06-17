<?php
$connect = mysqli_connect("loaclhost","root","");
if ($result = mysql_query($connect,"SELECT * FROM ebookstore"))
{
   $rows = mysql_num_rows($result);
   echo "the table contains $rows rows<br>";
}
?>