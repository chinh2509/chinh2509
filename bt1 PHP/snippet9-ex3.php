<?php
class Greetings{
    private $word = "hello";
}
$closure = function ($whom){
    echo"$this->word $whom </br>";
};
$obj = new Greetings();

$closure->call($obj , 'john');
$closure->call($obj , 'kevin');
?>

