<?php
$avar;
$rar = "";
$ccount = 0;
echo "Enter the Value of Array";
$handle = fopen("php://stdin", "r");
$val = (int) fgets($handle);
for ($i = 0; $i < $val; $i ++) {
    $avar[$i] = (int) fgets($handle);
}
rsort($avar);
$ccount = count($avar);
$fcount = 0;
$lcount = $ccount - 1;
if ($ccount % 2 == 0) {
    for ($i = 0; $i < $ccount / 2; $i ++) {
        $rar .= $avar[$fcount];
        $fcount += 1;
        $rar .= $avar[$lcount];
        $lcount -= 1;
    }
    echo $rar;
} else {
    for ($i = 0; $i < (($ccount) / 2); $i ++) {
        $rar .= $avar[$fcount];
        ++ $fcount;
        $rar .= $avar[$lcount];
        -- $lcount;
    }
    echo substr($rar, 0, - 1);
}

?>
