<?php
$result = mysqli_query($connect_mysql, "select * from ebookstore");
while ($row = mysqli_fetch_row($result)){
    printf("(#s)\n",$row[0],$row[1]);

}
?>