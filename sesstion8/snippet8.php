<?php
$x = 50;
$y = 5;
echo "\$x & \$y = " .($x & $y)."<br>";
echo "\$x | \$y = " .($x & $y)."<br>";
echo "\$x ^ \$y = " .($x & $y)."<br>";
echo " ~(\$y) = " .~$y."<br>";
//x is divided by 2 y times
echo "\$x >> \$y = ".($x >> $y)."<br>";
//x is multiplied by 2 y times
echo "\$x << \$y = ".($x << $y)."<br>";
//trước tiên chuyển đổi các toán hạng thành giá trị ASCII của chúng ('5' (ascii 53)) ^ ('9' (asccii 57))
echo "the bitwise result of 5 ^ 9 is :".(5^9)."<br>";
//chuyển đổi "8" để thực hiện thao tác (5 ^ (int) "8")
echo "the result of 5^8 is:".(5^8)."<br>";
?>
