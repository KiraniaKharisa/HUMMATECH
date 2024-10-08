// Buatlah program untuk menerima inputan biodata Anda berupa nama sekolah, jarak rumah ke sekolah (tipe double), kode plat nomor kendaraan (tipe char), anak ke berapa (tipe int). Contohnya:

// -Nama Sekolah: SMK 1 Hummasoft Malang
// -Jarak Rumah ke Sekolah: 10.5 km
// -Kode Plat Nomor Kendaraan: N
// -Anak Ke Berapa: 2
// -Kemudian tampilkan output dari inputan tersebut. 


import java.util.Scanner;

public class Tugas02 {
    public static void main(String[] args) {
        final Scanner biodata = new Scanner(System.in);

        System.out.print("Masukkan Nama Sekolah : ");
        String sekolah = biodata.nextLine();
        
        System.out.print("Jarak Rumah ke Sekolah : ");
        double jarak = biodata.nextDouble();
        biodata.nextLine();
        
        System.out.print("Kode Plat Nomor Kendaraan : ");
        char kode = biodata.next().charAt(0);
        biodata.nextLine();
        
        System.out.print("Anak ke Berapa : ");
        int anak = biodata.nextInt();
        biodata.nextLine();

        System.out.println("=========== Output =============");


        System.out.println("Nama Sekolah : " + sekolah + "\nJarak Rumah : " + jarak +" KM " + "\nKode Plat : " + kode + "\nAnak Ke : " + anak );
        
    }
}
