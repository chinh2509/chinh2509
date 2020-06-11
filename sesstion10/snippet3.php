<?php
$sales = 2750;
if($sales > 2000){
    $comn = $sales * .1;
    echo  "Sales: $$sales <br> Commisstion : $$comn";
}
else
{
    $comn = $sales * .05;
    echo  "Sales: $$sales <br> Commisstion : $$comn";
}