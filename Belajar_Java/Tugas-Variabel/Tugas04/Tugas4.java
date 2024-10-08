// Buatlah program untuk menghitung luas lingkaran yang memiliki rumus: 

// PI * jari-jari * jari-jari 

// PI karena nilainya tetap, maka menjadi konstanta. Sedangkan jari-jari menjadi variabel.

public class Tugas4 {
    public static void main(String[] args) {
        int jariJari = 40;
        final double phi = 3.14;
        double hasil;

        hasil = phi * jariJari * jariJari;
        System.out.println("rumus lingkaran = phi x jari-jari x jari-jari");
        System.out.println("rumus lingkaran = " + phi + "x" + jariJari + "x" + jariJari);
        System.out.println("rumus lingkaran = " + phi + "x" + jariJari * jariJari);
        System.out.println("rumus lingkaran = " + hasil);
    }
}
