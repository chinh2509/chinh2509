<?php
$y = 2011;
if(($y%4==0 && $y) || ($y%400 == 0))
    {
        echo "$y is s leap year.<br>";
    }
else
{
    echo "$y is not a leep year.<br>";
}
?>