/* Deskripsi
Buatlah program untuk menghitung rumus: a + b * c, yang mana nilai dari a, b, dan c didapatkan dari inputan user menggunakan BufferedReader. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tugas02 {
    public static void main(String[] args) {
        final BufferedReader prog = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukkan nilai A : ");
            int nilaiA = Integer.parseInt(prog.readLine());

            System.out.print("Masukkan nilai B : ");
            int nilaiB = Integer.parseInt(prog.readLine());

            System.out.print("Masukkan nilai C : ");
            int nilaiC = Integer.parseInt(prog.readLine());
            
        } catch (Exception e) {
            System.err.println("Ada Error Pengambilan Input : " + e);
            // TODO: handle exception
        }

    }
}
