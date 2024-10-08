// Buatlah variabel dan konstanta untuk program kasir yang menyimpan beberapa data, yaitu: 

// Sebagai konstanta : nama toko dan harga pokok
// Sebagai variabel  : 
// Harga promo (harga pokok dikurangi 10.000) 
// Harga reseller (harga pokok dikurangi 20.000)
 

// Kemudian tampilkan semua data tersebut dengan perintah System.out.println().

public class Tugas5 {
    public static void main(String[] args) {
        final String namaToko = "Kirania Olshop";
        final int hargaPokok = 50000;

        int hargaPromo = hargaPokok-10000;
        int hargaReseller = hargaPokok-20000;
        System.out.println("Nama Toko : " + namaToko);
        System.out.println("Harga Pokok : " + hargaPokok);
        
        System.out.println("Harga Promo : " + hargaPromo);
        System.out.println("Harga Reseller : " + hargaReseller);
    }
}
