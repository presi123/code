<?php
 if(isset($_POST['disp']))
 {
  $n1=$_POST['num1'];
  $n2=$_POST['num2'];
  if($n1>$n2)
    $res=$n1;
  else
    $res=$n2;
 }
?>
<html>
 <body bgcolor="gold">
  <form action="" method="post">
   <table align="center" border="3" width="46%" bgcolor="mediumseagreen">
    <tr><th align="center" colspan="2"><font color="red"><u>LARGEST OF TWO NUMBERS</u></font></th>
        <th></th></tr>
    <tr><td>Enter the First Number :</td>
        <td><input type="text" name="num1" required></td></tr>
    <tr><td>Enter the Second Number :</td>
        <td><input type="text" name="num2" required></td></tr>
    <tr><td><input type="submit" name="disp" value="		RESULT			"></td>
        <td><input type="text" value="<?php echo@$res?>" readonly></td></tr>
   </table>
  </form>
 </body>
</html>