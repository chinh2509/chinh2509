<html><body>
<?php
   $to = "recipient@gmail.com";
   $from = "kutysomapc@gmail.com";
   $subject = "test e-mail";
   $body = "this is an example for showing the usage of the mail() funtion.";
   $send = mail($to ,$subject,$body,$from);
   if($send)
   {
       echo "mail sent to $to address!!";
   }
   else{
       echo "mail could not be sent to $to address";
   }
?>
</body></html>