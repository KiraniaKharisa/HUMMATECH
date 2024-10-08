/* Buatlah program untuk menerima inputan biodata Anda berupa nama lengkap, nomor induk siswa, umur (tipe int). Contohnya:

Nama Lengkap: Rully Safri
NIS: 110123
Umur: 15 tahun
Kemudian tampilkan output dari inputan tersebut.*/

import java.util.Scanner;

package Tugas_InputOutput.Tugas04;

public class Tugas04 {
    public static void main(String[] args) {
        final Scanner nama = new Scanner(System.in);
        
        System.out.print("Masukkan nama lengkap : ");
        String lengkap = nama.nextLine();

        System.out.print("Masukkan nomor induk : ");
        int induk = nama.nextInt();
        nama.nextLine();
        
        System.out.print("Masukkan umur anda : ");
        int umur = nama.nextInt();
        nama.nextLine();

        System.out.println("=========== Output =============");

        System.out.println("Nama Lengkap : " + lengkap + "\nNIS : " + induk + "\nUmur : " + umur + " Tahun");
    }
}
