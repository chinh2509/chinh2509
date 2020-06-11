<?php
$units = $_GET('units');
echo "Number of Units Consumed:";
echo $units;
echo "<br>";
if ($units > 1000){
    $rate = $units * 3;
    $service = $rate * .1;
    echo "Service charge added added for  units abount 1000:$$service";
    echo "<br>";
    $totalbill = $rate + $service;
    echo "total electriccity bill: $$totalbill";
}
else
{
    if ($units > 500 and $units <= 1000)
    {
        $rate = $units * 2;
        echo "total  electric city bill ::$rate";
    }
    else
    {
        $rate = $units * 1.5;
        echo "kqua2: $$rate";
    }
}
?>
