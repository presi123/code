<?php
  $servername="localhost";
  $username="root";
  $password="";
  $db_name="Demo";
  $con=mysqli_connect($servername,$username,$password);
  if(!$con)
   die("Error in connecting Mysql");
  else
   echo "Connection Established";
?>

