<?php
 if(isset($_SERVER['PHP_AUTH_USER']) &&
         ($_SERVER['PHP_AUTH_PW']))
{
    echo "welcome User:" .htmlspecialchars($_SERVER['PHP_AUTH_USER'])  .
         "password:"     .htmlspecialchars($_SERVER['PHP_AUTH_PW']);
}
else
{
    header('WWW-Authenticate: Basic realm="Restricted Area"');
    header('HTTP/1.0 401 Unauthorized');
    die("hãy nhaapjn thông tin user");
}
