/*Buatlah kode program tentang quiz, yang dimana terdapat sebuah pertanyaan dan juga pilihan ganda
pertanyannya adalah "Dimnakah dibawah yang termasuk kedalam operator didalam pemrograman java"

"A. Operator Logika"
"B. Operator Indosat"
"C. Operator Telkomsel"
"D. Operator Perbandingan" */

import java.util.Scanner;

public class Tantangan5 {
    public static void main(String[] args) {
        final Scanner inputUser = new Scanner(System.in);
        // Pertanyaan
        String pertanyaan = "Dimanakah dibawah yang termasuk kedalam operator dalam pemrograman Java?";
        
        // Pilihan Jawaban
        String[] pilihan = {"A. Operator Logika", "B. Operator Indosat", "C. Operator Telkomsel", "D. Operator Perbandingan"};
        
        // Jawaban yang benar
        char jawabanBenar = 'A';
        
        // Menampilkan pertanyaan
        System.out.println(pertanyaan);
        
        // Menampilkan pilihan jawaban
        for (String pilihanJawaban : pilihan) {
            System.out.println(pilihanJawaban);
        }
        
        // Membuat Scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan pilihan jawaban Anda (A, B, C, atau D): ");
        
        // Membaca jawaban pengguna
        char jawabanPengguna = scanner.next().charAt(0);
        
        // Memeriksa jawaban
        if (jawabanPengguna == jawabanBenar) {
            System.out.println("Jawaban Anda benar!");
        } else {
            System.out.println("Jawaban Anda salah. Jawaban yang benar adalah " + jawabanBenar);
        }
        
        // Menutup Scanner
        scanner.close();
    }
}
