<?php
    require_once 'login.php';
    $conn = new mysqli($hn,$un,$pw,$db);
    if ($conn->connect_errno) die("kết nối thất bại");

    $query = "SELECT * FROM classics";
    $result = $conn->query($query);
    if(!$result) die("kết nội thất bại");

    $rows = $result->num_rows;

    for ($j=0 ; $j < $rows ; ++$j)
    {
        $rows = $result->fetch_array(MYSQLI_ASSOC);
        echo 'author:' .$rows['authors']  .'<br>';
        echo 'Title:' .$rows['title']  .'<br>';
        echo 'Category:' .$rows['category']  .'<br>';
        echo 'Year:' .$rows['YEAR']  .'<br>';
        echo 'ISBN:' .$rows['isbn']  .'<br><br>';

    }
    $result->close();
    $conn->close();
    ?>