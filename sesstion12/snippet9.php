<?php
$counter = 0;
while ($counter < 5)
{
    $counter++;
    if($counter==3){
        echo "Continues are loop<br>";
        continue;
    }
    echo "$counter<br>";
}
echo "the loop ends here";
?>