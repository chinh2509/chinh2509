<?php
if (isset($_COOKIE['NAME']))
{
    $Last = $_COOKIE['NAME'];
    echo "Welcome back! <BR> Your name is ".$Last;
}

else
{
    echo "Welcome to our site!";
}?>