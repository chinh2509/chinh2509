<?php
$A = $_GET('name');
if($A>60)
{
    echo "Congrats";
    echo "you have got Grand1.";
}
else if ($A < 60 AND  $A > 40)
{
 echo "Congrats";
 echo "you have got Grand2.";
}
else{
    echo "sorry,you have failed";
}
?>