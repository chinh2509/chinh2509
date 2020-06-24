<html>
<body>
<?php
$to = "recipient@gmail.com ,recipient2@gmail.com ,recipient3@gmail.com";
$from = "kutysomapc@gmail.com";
for($i=0;$i<count($to);$i++)
{
    $to[$i] = trim($to[$i]);
    $subject = "An example";
    $body = "this is an example for showing the usage of the mail()
    funtion.";
    $send = mail($to,$subject,$body,$from);
        if($send)
        {
            echo "Mail was sent to all the addresses";
        }
}
?>
</body>
</html>

