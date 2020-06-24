<?php
session_start();
$my_name = $_SESSION['myname'];
?>
<html>
<title>Homepage</title>
<body>
Welcome <?php echo $my_name ?>to myPage.php<br>
</body>
</html>
