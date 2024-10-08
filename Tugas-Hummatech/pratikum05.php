<?php

//Setelah membuat program menghitung sisi miring segitiga pada soal nomor 4. Sekarang, gabungkan kode program tersebut dengan kode program menghitung luas dan keliling segitiga. Berikan kode program dan hasil eksekusinya


function hitungSisimiringSegitiga($a, $b) {
    return sqrt($a * $a + $b * $b);
}

function hitungLuasSegitiga($alas,$tinggi) {
    return $alas * $tinggi / 2;
}

function hitungKelilingSegitiga($alas, $tinggi, $sisiMiring) {
    return $alas + $tinggi + $sisiMiring;
}

$alas = 15; 
$tinggi = 20; 
$sisiMiring = hitungSisimiringSegitiga($alas, $tinggi);

echo "Alas : " . $alas . " cm<br>";
echo "Tinggi : " . $tinggi . " cm<br>";
echo "Sisi Miring (Segitiga): " . $sisiMiring . " cm<br>";
echo "Luas Segitiga : " . hitungLuasSegitiga($alas, $tinggi) . "<br>";
echo "Keliling Segitiga : " . hitungKelilingSegitiga($alas, $tinggi, $sisiMiring);


?>