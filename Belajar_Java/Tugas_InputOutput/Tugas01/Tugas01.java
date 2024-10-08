/* Deskripsi
Buatlah program untuk menerima inputan biodata Anda berupa nama lengkap, usia, kota asal, tinggi badan (berupa angka desimal, misalnya 160.0). Kemudian tampilkan output dari inputan tersebut. */

import java.util.Scanner;

public class Tugas01 {
    public static void main(String[] args ) {
        final Scanner inputUser = new Scanner (System.in);

        System.out.print("Masukkan nama anda : ");
        String nama = inputUser.nextLine();
        
        System.out.print("Berapa usia anda : ");
        int usia = inputUser.nextInt();
        inputUser.nextLine();
        
        System.out.print("Dari kota mana anda berasal : ");
        String kota = inputUser.nextLine();
        
        System.out.println("Masukkan tinggi badan : ");
        double tinggi = inputUser.nextDouble();
        inputUser.nextLine();
        
        System.out.println("Nama yang anda masukkan adalah : " + nama );
        System.out.println("Usia yang anda masukkan adalah : " + usia );
        System.out.println("Kota yang anda masukkan adalah : " + kota );
        System.out.println("Tinggi yang anda masukkan adalah : " + tinggi );
    }
}
