<?php
$link_id = mysqli_connect('localhost','root','');
if ($link_id->connect_errno) die("kết nối thất bại");
else echo "kết nối thành công";
?>