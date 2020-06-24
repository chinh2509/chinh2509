<?php
session_start();
$myname = $_SESSION['myname'];
session_unset();
session_destroy();
echo "Sesstion desroyed!";
?>
<html>
<title>Session</title>
<body>
<a href="myPage.php">Homepage of mypage.com</a>
</body>
</html>
