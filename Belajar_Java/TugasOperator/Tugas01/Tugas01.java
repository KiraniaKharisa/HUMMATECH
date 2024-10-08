/*Deskripsi
Buatlah program untuk menghitung luas segitiga, yang mana nilai alas dan tinggi didapatkan dari inputan user menggunakan Scanner. */

package TugasOperator.Tugas01;
import java.util.Scanner;

public class Tugas01 {
    public static void main(String[] args) {
        final Scanner luas = new Scanner(System.in);

        System.out.print("Masukkan Luas : ");
        double alas = luas.nextDouble();
        luas.nextLine();

        System.out.print("Masukkan Tinggi : ");
        double tinggi = luas.nextDouble();
        luas.nextLine();

        System.out.println("========== OUTPUT ==========");
        System.out.println("Alas : " + alas);
        System.out.println("Tinggi : " + tinggi);

        double hasil = (alas * tinggi) / 2;
        System.out.println("Hasil : " + hasil);

        
    }
}
