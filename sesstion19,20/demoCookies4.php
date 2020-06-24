<?php
require_once 'login.php';
$connection = new mysqli($hn,$un,$pw,$db);
if ($connection->connect_errno) die("kết nối faled");
$query = "CREATE TABLE users(
          forename varchar(32) NOT NULL,
          surname varchar(32) not null,
          username varchar(32) not null unique,
          password varchar(225) not null
)";
$result = $connection->query($query);
if (!$result ) die("lỗi kết nối");
//----------------------------------------------------
$forename = 'triệu';
$surname = 'cao';
$username = 'chinh';
$password = 'chinh123';
$hash = password_hash($password,PASSWORD_DEFAULT);

add_user($connection,$forename,$surname,$username,$hash);

$forename = 'triệu';
$surname = 'cao';
$username = 'hung';
$password = 'hunglinhtinh';
$hash = password_hash($password,PASSWORD_DEFAULT);

add_user($connection,$forename,$surname,$username,$hash);
//---------------------------------------------------------
function add_user($connection,$hn,$un,$pw,$db)
{
    $stmt = $connection->prepare('INSERT INTO users VALUE (?,?,?,?)');
    $stmt->bind_param('ssss',$hn,$un,$pw,$db);
    $stmt->execute();
    $stmt->close();
}
?>