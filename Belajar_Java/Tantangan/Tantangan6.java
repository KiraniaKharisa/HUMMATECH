import java.util.Scanner;

public class Tantangan6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double ujian, tugas, nilai_akhir;

        while (true) {
            try {
                // Langkah 1: Memasukkan nilai ujian dan tugas
                System.out.print("Masukkan nilai ujian mahasiswa (0-100): ");
                ujian = input.nextDouble();
                System.out.print("Masukkan nilai tugas mahasiswa (0-100): ");
                tugas = input.nextDouble();

                // Langkah 2: Cek nilai ujian dan tugas
                if (ujian < 0 || ujian > 100 || tugas < 0 || tugas > 100) {
                    System.out.println("Nilai harus berada dalam rentang 0-100. Silakan coba lagi.");
                    continue;
                }

                // Langkah 3: Hitung nilai akhir
                nilai_akhir = (0.6 * ujian) + (0.4 * tugas);

                // Langkah 4: Cek apakah mahasiswa lulus atau tidak
                if (nilai_akhir >= 60) {
                    System.out.println("Mahasiswa lulus dengan nilai akhir: " + nilai_akhir);
                } else {
                    System.out.println("Mahasiswa gagal dengan nilai akhir: " + nilai_akhir);
                }

                break;
            } catch (Exception e) {
                System.out.println("Masukkan harus berupa angka. Silakan coba lagi.");
                input.nextLine(); // Clear the input buffer
            }
        }
        input.close();
    }

}
