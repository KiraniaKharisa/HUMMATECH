/* Buatlah 2 variabel yang dimana variabel tersebut masing" menyimpan nilai 10.

kemudian ubahlah nilai variabel tersebut menggunakan operator assigment (+=) dan nilai dari operator assigmentnya dapat dari inputan user(bebas)
contoh:
int angka1 = 10;
int angka2 = 10;

angka1 += input.nextInt();

angka2 += input.nextInt;

Setelah anda mengubah kedua nilainya silahkan anda lakukan perbandingan menggunakan simbol “==”, “!=”, “<”, “>”,"≤","≥, dan tanpilkan apakah nilainya true atau false */

import java.util.Scanner;


public class Tantangan4 {
    public static void main(String[] args) {
        // Memanggil scanner dengan variabel inputUser
        final Scanner inputUser = new Scanner(System.in);

        int angka1 = 10;
        int angka2 = 10;
        System.out.println("angka pertama : " + angka1);
        System.out.println("angka kedua : " + angka2);  
        
        System.out.print("\nTambahkan angka 1 : ");
        angka1 += inputUser.nextInt();
        System.out.print("Tambahkan angka 2 : ");
        angka2 += inputUser.nextInt();

        System.out.println("\nangka pertama : " + angka1);
        System.out.println("angka kedua : " + angka2);

        System.err.println("\n\n====== PERBANDINGAN ANGKA 1 DAN ANGKA 2 =======\n");

        
        System.out.println("apakah " + angka1 + " dengan " + angka2 + " itu sama: " + (angka1 == angka2));
        System.out.println("apakah " + angka1 + " dengan " + angka2 + " itu tidak sama: " + (angka1 != angka2));
        System.out.println("apakah " + angka1 + " kurang dari " + angka2 + " : " + (angka1 < angka2));
        System.out.println("apakah " + angka1 + " lebih dari " + angka2 + " : " + (angka1 > angka2));
        System.out.println("apakah " + angka1 + " kurang dari sama dengan " + angka2 + " : " + (angka1 <= angka2));
        System.out.println("apakah " + angka1 + " lebih dari sama dengan " + angka2 + " : " + (angka1 >= angka2));
        

    }
}