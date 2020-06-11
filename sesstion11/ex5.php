<?php
$myname=$_POST('myname');
$mynage=$_POST('mynage');
if ($myname){
    echo "please enter name your";

}
else{
    $esg = ($myage=="") ? "$myname please enter your age!":
        "hi $myname.your age is $myage.";
    echo $esg;
}
?>
<br>
<a href="info.html"></a>
