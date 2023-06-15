<?php
// Array with names
$a[] = "Anna";
$a[] = "Amarnadth";
$a[] = "Waseem";
$a[] = "Akram";
$a[] = "Waqar";
$a[] = "divya";
$a[] = "wajid";
$a[] = "deekshita";

$q = $_REQUEST["q"];

$hint = "";

if ($q != "") {
    $q = strtolower($q);
    $len=strlen($q);
    foreach($a as $name) {
        if (stristr($q, substr($name, 0, $len))) {
            if ($hint === "") {
                $hint = $name;
            } else {
                $hint .= ", $name";
            }
        }
    }
}

echo $hint === "" ? "no suggestion" : $hint;
?>