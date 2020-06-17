<?php
require_once 'login.php';
$conn = new mysqli($hn,$un,$pw,$db);
if ($conn->connect_errno) die("kết nối thất bại");

$query = "SELECT * FROM customers";
$result = $conn->query($query);
if(!$result) die("kết nội thất bại");

$rows = $result->num_rows;

for ($j=0 ; $j < $rows ; ++$j)
{
    $rows = $result->fetch_array(MYSQLI_ASSOC);
    echo 'name:' .$rows['name']  .'<br>';
    echo 'isbn:' .$rows['isbn']  .'<br><br>';
}
$result->close();
$conn->close();
?>