<html>
<head>
    <title>User Information</title>
</head>
<body>
<?php
    $myname = $_POST('myname');
    $myage = $_POST('myage');
    if ($myname=='')
    {
        echo"qkua1";
    }
    else{
        if ($myage==""){
            echo "$myname";
            echo "kqua2";
        }
        else{
            echo "hi";
            echo $myname;
            echo ".";
            echo "your are age is ";
            echo $myage;
            echo ".";
        }
    }

?>
<br>
<a href="info.html">back</a>
</body>
</html>