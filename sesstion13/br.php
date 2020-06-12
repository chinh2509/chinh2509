<?php
$number=$_GET['num'];
if($number==0)
{
    exit;
}
$ans = 1/$number;
echo "<br>Inverse of the entered number is 1/$number";
echo "<br>Ist decimal quivalent is $ans";
echo "<br><a href=break.html> go back</a>";
?>