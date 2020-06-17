<?php
require_once 'login.php';
$conn = new mysqli($hn,$un,$pw,$db);
if ($conn->connect_errno)
    die("kết nối thất bại");
else
    echo "kết nối thành công!";
?>
