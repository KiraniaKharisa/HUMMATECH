// Buatlah variabel untuk mengisi biodata Anda yang berisi 
    // nama lengkap
    // nama panggilan
    // umur (tipe data int)
    // tinggi badan (tipe data float)
    // berat badan (tipe data double)
    // kota kelahiran
    // jenis kelamin (tipe data char)
    // sudahkah menikah (tipe data boolean)
    // apakah WNI (tipe data boolean)

// Isikan variabel tersebut sesuai dengan biodata Anda.
// Ingat! Pembuatan tipe data disesuaikan dengan karakteristiknya. Dan untuk nama variabel yang lebih dari 2 kata, maka gunakanlah camelCase.

public class Tugas1 {
    public static void main(String[] args) {
        System.out.println("========================================\n\n\n");
        
        
        String namaLengkap = "Kirania Kharisa Suyatno";
        System.out.println("Nama : " + namaLengkap);

        String namaPanggilan = "Rani";
        System.out.println("Nama Panggilan : " + namaPanggilan); 

        int umur = 15;
        System.out.println("Umur : " + umur);
        
        float tinggiBadan = 1.55f;
        System.out.println("Tinggi Badan : " + tinggiBadan + " Meter ");
        
        double beratBadan = 50;
        System.out.println("Berat Badan : " + beratBadan + " KG ");

        String kotaKelahiran = "Jember";
        System.out.println("Kota Kelahiran : " + kotaKelahiran);
        
        char jenisKelamin = 'P';
        System.out.println("Jenis Kelamin : " + jenisKelamin + " (Perempuan) ");
        
        boolean sudahMenikah = false;
        System.out.println("Sudah Menikah : " + sudahMenikah + " (belum) ");
        
        boolean WNI = true;
        System.out.println("Apakah WNI : " + WNI + " (iya) ");
        
        
        // Perkenalkan nama saya ... panggilan saya ... saya berumur ..., tinggi badan saya ..., berat badan saya ..., saya lahir di ..., saya berjenis kelamin ... saya belum menikah dan saya warga negara indonesia
        
        String perkenalan = "Perkenalkan nama saya " + namaLengkap + " Panggilan saya " + namaPanggilan + " saya berumur " + umur + " tinggi badan saya " + tinggiBadan + " berat badan saya " + " saya lahir di " + kotaKelahiran + " saya berjenis kelamin " + jenisKelamin + " saya belum menikah dan saya warga negara Indonesia ";
        System.out.println(perkenalan);
        

        System.out.println("\n\n\n========================================");
    }
}
