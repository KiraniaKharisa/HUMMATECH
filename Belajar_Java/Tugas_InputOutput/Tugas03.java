package Tugas_InputOutput;
import java.util.Scanner;

public class Tugas03 {
    public static void main(String[] args) {
        final Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan Nilai : ");
        double nilai = inputUser.nextDouble();

        if(nilai > 100 || nilai <= 0) {
            System.out.println("Nilai yang anda masukkan tidak valid");

        } else if(nilai > 80) {
            System.out.println("Anda mendapatkan nilai A");

        } else if(nilai > 70) {
            System.out.println("Anda mendapatkan nilai B");

        } else if(nilai > 50) {
            System.out.println("Anda mendapatkan nilai C");
            
        } else if(nilai > 20 ) {
            System.out.println("Anda mendapatkan nilai D");
            
        } else {
            System.out.println("Anda mendapatkan nilai E");

        }
    }
}
