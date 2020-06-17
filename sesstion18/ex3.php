<?php
$dbname = 'mysql';
if (!mysqli_connect('127.0.0.1','root',''))
{
    echo 'Count not connect to mýql';
    exit;
}
$sql = "SHOW TABLE FROM $dbname";
$connect_mysql = mysqli_connect('127.0.0.1','root','');
$result = mysqli_query($connect_mysql,$sql);
if (!$result)
    $result = mysqli_query($sql);
echo "the table from the database are:<br><br>";
if (!$result)
{
    echo 'DB Error: ' . mysqli_error();
    exit;
}
while ($row = mysqli_fetch_row($result))
{
    echo "Table: {$row(0)}<br>";
}
?>