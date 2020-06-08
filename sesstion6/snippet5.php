<html>
<head>
    <title>Global Variables</title>
</head>
<body>
<?php
    $int1 = 29;
    $int2 = 39;
    function siv(){
        global $int2,$int1;
        $int3 = $int2 / $int1;
        echo "kết quả : $int2 / $int1 = $int3";
    }
    siv();
?>
</body>
</html>