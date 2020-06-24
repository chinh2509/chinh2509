<?php
$test = "false";
if (isset($test['test'])) $test =$_COOKIE['test'];
echo "<p><b>kết nối ok</b></p>";
//dang thường
setcookie("name","value");
//dạng mảng
setcookie("cookies[one]","one");
setcookie("cookies[two]","two");
setcookie("cookies[three]","three");
///dạn nhiều biến
if (isset($_COOKIE['cookies'])){
    foreach ($_COOKIE['cookies'] as $name => $value)
    {
        $name = htmlspecialchars($name);
        $value = htmlspecialchars($value);
        echo "$name : $value <br>\n";
    }
}
?>