<?php
$sal = $_GET('sal');
echo "Total Sales : $";
echo $sal;
echo "<br>";
if ($sal > 50000)
{
    $comn = $sal * .10;
    echo "commisstion: $$comn";
    echo "<br>";
}
else if ($sal > 20000 and $sal <= 50000)
{
    $comn = $sal * .07;
    echo "commisstion: $$comn";
    echo "<br>";
}
else if ($sal<20000){
    $comn = $sal * .05;
    echo "commisstion: $$comn";
    echo "<br>";
}
?>