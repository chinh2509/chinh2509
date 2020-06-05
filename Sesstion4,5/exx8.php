<?php
$num2 = 0;
echo "the multiplication value of 14 * 15 is </br>";
function multiply(){
    $num1 = 14;
    $num2 = 19;
    $num2 =     $num1 + $num2;
    echo $num2;
}
multiply();
echo "<br/> the value the of the local variable on exiting the function is</br>";
echo $num2;
?>