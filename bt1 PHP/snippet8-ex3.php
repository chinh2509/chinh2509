<?php
include 'myfile.php';
use aptech\{Boston,NewYork};
use function aptech\{foo1,foo2};
$d = new \aptech\Boston();
$d->say();
$n = new \aptech\NewYork();
$n->say();
foo1();
foo2();
?>