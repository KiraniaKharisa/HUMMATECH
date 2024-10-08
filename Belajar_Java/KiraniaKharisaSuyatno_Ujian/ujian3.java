import java.util.Scanner;

public class ujian3 {
    public static void main(String[] args) {
        final Scanner biodata = new Scanner(System.in);

        System.out.print("Masukkan nomor satu : ");
        int satu = biodata.nextInt();
        biodata.nextLine();

        System.out.print("Masukkan nomor dua : ");
        int dua = biodata.nextInt();
        biodata.nextLine();

        System.out.print("Masukkan nomor tiga : ");
        int tiga = biodata.nextInt();
        biodata.nextLine();

        double rata = (satu+dua+tiga)/3;
        System.out.println(rata);
        System.out.println("Hasil :" + (rata > 75 ? "Lulus" : "Tidak lulus"));
    }
}
