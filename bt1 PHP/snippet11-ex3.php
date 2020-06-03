<?php
function f1(){
    yield from f2();
    yield "f1() 1";
    yield "f1() 2";
    yield from [3,4];
    yield "f1() 3";
    yield "f1() end";
}
function f2(){
    yield "f1() 1";
    yield "f1() 2";
    yield "f1() 3";
    yield "f1() end";
}


$f1 ='chinh';
$f = $f1();
foreach ($f as $val){
    echo "$val</br>";
}
?>