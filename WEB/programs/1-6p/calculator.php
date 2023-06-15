<?php
 if(isset($_POST['disp']))
 {
  $a=$_POST['num1'];
  $b=$_POST['num2'];
  $ch=$_POST['ch'];
  switch($ch)
  {
   case 'ADDITION':
         $res=$a+$b;break;
   case 'SUBTRACTION':
         $res=$a-$b;break;
   case 'MULTIPLICATION':
         $res=$a*$b;break;
   case 'DIVISION':
         $res=$a/$b;break;
  }
 }
?>
<html>
 <body bgcolor="gold">
  <form action="" method="post">
   <table align="center" width="56%" border="3" bgcolor="navyblue">
    <tr><th align="center" colspan="2"><font color="red"><u>CALCULATOR</u></font></th>
        <th></th></tr>
    <tr><td>Enter The First Number :</td>
        <td><input type="text" name="num1"></td></tr>
    <tr><td>Enter the Second Nunber :</td>
        <td><input type="text" name="num2"></td></tr>
    <tr><td>Choose The Option :</td>
        <td><select name="ch">
             <option selected>CHOICE</option>
             <option>ADDITION</option>
             <option>SUBTRACTION</option>
             <option>MULTIPLICATION</option>
             <option>DIVISION</option>
            </select></td></tr>
    <tr><td><input type="submit" value="		RESULT	 		" name="disp"></td>
        <td><input type="text" value="<?php echo@$res;?>" readonly></td></tr>
    
   </table>
  </form>
 </body>
</html>