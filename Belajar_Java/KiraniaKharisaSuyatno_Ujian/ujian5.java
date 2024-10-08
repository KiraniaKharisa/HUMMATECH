import javax.swing.JOptionPane;

public class ujian5 {
  public static void main(String[] args) {
    
    int jumlahDeret = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Deret"));
    
    int nilaiAwal = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Awal"));
    
    int deret = 0;
    
    while(true) {
      if(deret < jumlahDeret) {
        if((nilaiAwal % 2) != 0) {
          System.out.print(nilaiAwal + "\t");
          deret++;
        }
        nilaiAwal++;
      } else {
        break;
      }
    }
  }
}