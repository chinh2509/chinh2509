<?php
$connect_mysql=mysqli_connect('localhost','root','','publications');
$mysqli_db = mysqli_select_db($connect_mysql,"customers");

if($mysqli_db->connect_errno)
{
    die("failed");
}
else
{
    echo "kết nối thành công";
}
?>
