<?php
 include("connect.php");
 echo '<br>';
 mysqli_select_db($con,$db_name);
 $query="select name from user_info";
 $result=mysqli_query($con,$query);
 if(!$result)
  die("Query Fetching Error");
 else
   echo "Fetching Successfull";
 echo '<br>';
 while($row=mysqli_fetch_assoc($result))
 {
  echo $row['name'];
  echo '<br>';
 }
?>


