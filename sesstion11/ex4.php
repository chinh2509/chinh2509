<html>
<head>
    <title>grand tails</title>
</head>
<body>
<?php
    $myname=$_GET('myname');
    $mygrade=$_GET('mygrade');
    echo"<br>";

    if($myname){echo "please are enter name";
    }
    else{
        switch ($mygrade) {
            case "":
                echo $myname;
                echo "kqua1";
                break;
            case "A":
                echo "kqua2";
                echo "<br><br>";
                echo "kqua3";
                echo "<br><br>";
                echo "kqua4";
                echo "<br><br>";
                echo "kqua5";
                echo "<br><br>";
                echo "kqua6";
                echo "<br><br>";
                break;
            case "B":
                echo "kqua7 $myname (Grade B)";
                echo "<br><br>";
                echo "Increment = 20% of basic salary";
                echo "<br><br>";
                echo "bonus = 10% of basic salary";
                echo "<br><br>";
                echo "traveling allowance = $300";
                echo "<br><br>";
                echo "Medical allowance $300";
                echo "<br><br>";
                break;
            case "C":
                echo "Facililites for $myname (Grade C)";
                echo "<br><br>";
                echo "Increment = 10% of basic salary";
                echo "<br><br>";
                echo "bonus = 5% of basic salary";
                echo "<br><br>";
                echo "traveling allowance = $100";
                echo "<br><br>";
                echo "Medical allowance $100";
                echo "<br><br>";
                break;
            default:
                echo "$myname , please enter the correct Grade (A,B or C)";
                break;

        }
    }
?>
<a href="perks.html"></a>
</body>
</html>
