<?php
 if($_POST)
 {
  $un=$_POST['u'];
  $pw=$_POST['p'];
  if($un=='waseem' and $pw=='1234')
  {
   echo '<table align="center" border="2" width="40%" height="30%">';
   echo '<tr><th align="center"><font color="blue">***PERSONAL DETAILS***</font></th></tr>';
   echo '<tr><td><center><pre><h3><font color="blue">';
   echo 'NAME - WASEEM AKRAM
D.O.B - JAN 21,2003
BLOOD GP - O+
CONTACT NO - 7659072553
ADDRESS - YELAHANKA,BANGLORE
EMAIL ID - waseeakram32@gmail.com';
   echo '</font></h3></pre></center></td></tr><table>';
  }
  else 
 {
  echo '<h3 align="center"><font color="red" size="50%">INVALID<br>USERNAME<br>OR<br>PASSWORD<br>!!!</font></h3>';
 } 
 }
?>