<html>
 <head>
  <style>
   body{
        border:2px solid red;
    }
  </style>
 </head>
 <body>
  <h2 align="center"><font color="red"><u>PALINDROME</u></font></h2>
  <form action="" method="post">
   <table align="center" bgcolor="mediumseagreen">
    <tr><td><br></td></tr>
    <tr>
     <td><input type="text" value="Enter The Input:" readonly>
         <input type="text" name="n" required>
     </td>
    </tr>
    <tr><td><br><br></td></tr>
    <tr align="center">
     <td><input type="submit" value="&nbsp;SUBMIT&nbsp;"><br><br></td>
    </tr>
   </table>
  </form>
  <?php
   if($_POST)
   {
    $name=$_POST["n"];
    $n=$name;
    $rev=0;
    while($n>0)
    {
     $temp=$n%10;
     $rev=$rev*10+$temp;
     $n=floor($n/10);
    }
   echo '<table align="center" border="2" width="24%">';
   echo '<tr><td><center><i>';
   echo '<font color="forestgreen">';
   if($name==$rev)
    echo "$name Is A Palindrome Number.";
   else
    echo "$name Is Not A Palindrome Number.";
   echo '</font></i></center></td></tr></table>';
   }
  ?>
 </body>
</html>