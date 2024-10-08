<?php
$siswa = array
(
    array(135410154,"Bima","Rekayasa Perangkat Lunak"),
    array(125610893,"Rani","Rekayasa Perangkat Lunak"),
    array(135596944,"Devina","Desain Komunikasi Visual"),
    array(145293833,"Nisa","Teknik Kendaraan Ringan"),
);

for ($row = 0; $row < 4; $row++ ) {
    echo "<p><b>Siswa Index Ke-$row</b></p>";
    echo "<ul>";
    for ($col = 0; $col < 3; $col++) {
        echo "<li>".$siswa[$row][$col]."</li>";
    }
    echo "</ul>";
}

?>