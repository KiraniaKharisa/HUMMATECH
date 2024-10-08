/* Buatlah sebuah perulangan mencetak bilangan ganjil
Buatlah sebuah program untuk mencetak bilangan ganjil dari 1 hingga N. Jika N kurang dari atau sama dengan 0, cetak pesan bahwa N harus lebih besar dari 0. */

import java.util.Scanner;

public class Tantangan7 {
    public static void main(String[] args) {
        Scanner aku = new Scanner(System.in);

        System.out.print("Masukkan nilai n : ");
        int n = aku.nextInt();
        
        while (n<=0) {
            System.out.println("N harus lebih besar dari 0");

            System.out.print("Masukkan nilai n : ");
            n = aku.nextInt();
        }

        for (int i=1; i<=n;i++) {
           if ((i%2) != 0) {
            System.out.println(i);
           }
        }

    }
}