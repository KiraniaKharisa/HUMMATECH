import java.util.Scanner;

public class ujian1 {
    public static void main(String[] args) {
        final Scanner biodata = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap : ");
        String nama = biodata.nextLine();
        
        System.out.print("Masukkan nomor NIS anda : ");
        int nis = biodata.nextInt();
        biodata.nextLine();
        
        System.out.print("Masukkan umur anda : ");
        int umur = biodata.nextInt();
        biodata.nextLine();
        
        System.out.print("Masukkan alamat anda : ");
        String alamat = biodata.nextLine();
        biodata.nextLine();
        
        System.out.print("Masukkan nama Sekolah anda  : ");
        String sekolah = biodata.nextLine();
        biodata.nextLine();
        
        System.out.print("Masukkan nomor telephone anda : ");
        String no = biodata.next();
        biodata.nextLine();

        System.out.print("Masukkan tinggi badan anda : ");
        Double tinggi = biodata.nextDouble();
        biodata.nextLine();
        
        System.out.print("Masukkan berat badan anda : ");
        int berat = biodata.nextInt();
        biodata.nextLine();
        System.out.println("=========== Output =============");


        System.out.println("Nama panjang : " + nama + "\nNIS : " + nis  + "\nUmur : " + umur + "Tahun" + "\nAlamat : " + alamat + "\nSekolah : " + sekolah + "\nNo telp : " + no + "/nTinggi Badan : " + tinggi + "\nBerat Badan : " + berat);
        
    }
}
