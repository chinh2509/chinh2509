<html>
<body>
<?php
  $x = "cat";
  $y = "dog";
  echo $x.'<=>'.$y,'//return', $x <=> $y;
  //this will output -1 because Cat is less than dog.
echo '</br>';
$x = "PHP";
$Y = "PHP";
echo $x.'<=>'.$y,'//returns',$x <=> $y;
//this will output 0 because both string have same value.
echo '</br>';
$x = "Compute";
$y = "Apple";
echo $x.'<=>' .$y,'Returns',$x <=> $y;
//this will output 0 because both strings have same value.
echo '</br>';
?>
</body>
</html>