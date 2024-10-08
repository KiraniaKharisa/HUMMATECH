import java.util.Scanner;

public class ujian2 {
    public static void main(String[] args) {
        final Scanner biodata = new Scanner(System.in);

        System.out.print("Masukkan nomor A : ");
        int a = biodata.nextInt();
        biodata.nextLine();

        System.out.print("Masukkan nomor B : ");
        int b = biodata.nextInt();
        biodata.nextLine();

        System.out.print("Masukkan nomor C : ");
        int c = biodata.nextInt();
        biodata.nextLine();

        System.out.print("Masukkan nomor D : ");
        int d = biodata.nextInt();
        biodata.nextLine();
        
        double hasil = a+b*c/d;
        System.out.println("Hasil : " + hasil );
    }
}
