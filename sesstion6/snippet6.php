<html>
<head>
    <title>
        Static Variables
    </title>
</head>
<body>
<?php
   function decrement(){
       static  $static_int1 = 99;
       $static_int1++;
       echo "the decrement is $static_int1";
   }
   decrement();
?>
</body>
</html>