import java.util.Scanner; 

public class ujian4 {
  public final static Scanner inputUser = new Scanner(System.in);
  
  public static void main(String[] args) {
    System.out.print("Belanja : ");
    int belanja = inputUser.nextInt();
    inputUser.nextLine();
    
    double diskon = 0;
    if(belanja >= 1000000) {
      diskon = (belanja * 10) / 100;
      System.out.println("Anda Mendapatkan Diskon 20% Total Belanja Menjadi : " + (belanja - diskon));
    } else if(belanja >= 500000) {
      diskon = (belanja * 20) / 100;
      System.out.println("Anda Mendapatkan Diskon 10% Total Belanja Menjadi : " + (belanja - diskon));
      
    } else {
      int persen10 = 500000 - belanja;
      int peren20 = 1000000 - belanja;
      
      System.out.println("Anda Tidak Mendapatkan Diskon, Untuk Mendapat Diskon 10% Tambah : " + persen10 + " Untuk Diskon 20% Tambah : " + peren20);
    }
  }
}