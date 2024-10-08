/* Buatlah program untuk menerima inputan biodata Anda berupa jenis kelamin, nomor sepatu (tipe int), sudah menikah (tipe boolean). Contohnya:

Jenis Kelamin: Laki-Laki
Nomor Sepatu: 40
Sudah Menikah?: false
Kemudian tampilkan output dari inputan tersebut. */
package Tugas_InputOutput.Tugas03;

import java.util.Scanner;

public class Tugas03 {
    public static void main(String[] args) {
        final Scanner anda = new Scanner(System.in);

        System.out.print("Masukkan Jenis Kelamin : ");
        String jk = anda.nextLine();
        
        System.out.print("Masukkan Nomor Sepatu : ");
        int sepatu = anda.nextInt();
        anda.nextLine();
        
        System.out.print("Sudah menikah? ");
        boolean menikah = anda.nextBoolean();
        anda.nextLine();

        System.out.println("=========== Output =============");
        
        System.out.println("Jenis kelamin : " + jk + "\nNomor sepatu : " + sepatu + "\nApakah sudah menikah? " + menikah);
    }
}
