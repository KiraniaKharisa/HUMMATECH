<?php
//Buatlah kode program PHP menghitung luas persegi. Berikan contoh program menghitung sisi miring segitiga, sertakan kode program dan hasil eksekusinya.

//Menghitung luas persegi
function hitungLuasPersegi($sisi) {
    return $sisi * $sisi;
}

//Input sisi persegi
$sisi = 10; 

//Hitung luas persegi
$luas = hitungLuasPersegi($sisi);

echo "Sisi Persegi: " . $sisi . " cm<br>";
echo "Luas Persegi: " . $luas . " cm²<br>";


//Menghitung sisi miring segitiga menggunakan rumus Pythagoras
function hitungSegitiga($a, $b) {
    return sqrt($a * $a + $b * $b);
}

//Input panjang sisi segitiga
$sisi1 = 15; 
$sisi2 = 20; 

//Hitung sisi miring segitiga
$rumus = hitungSegitiga($sisi1, $sisi2);

echo "Sisi Pertama: " . $sisi1 . " cm<br>";
echo "Sisi Kedua: " . $sisi2 . " cm<br>";
echo "Sisi Miring (Segitiga): " . number_format($rumus, 2) . " cm<br>";


?>