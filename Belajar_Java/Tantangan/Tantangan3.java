import javax.swing.JOptionPane;

public class Tantangan3 {
  public static void main(String[] args) {
    String namaSiswa1 = "Kirania Kharisa Suyatno";
    String namaSiswa2 = "Fahmy Bima Az Zukhruf";
    String namaSiswa3 = "Gathan Fairuz Izzudin";
    
    // Kirania Kharisa Suyatno
    double nilaiMatematikaKirania = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai Matematika Kirania"));
    double nilaiIpaKirania = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai IPA Kirania"));
    double nilaiIpsKirania = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai IPS Kirania"));
    double rataRataKirania = (nilaiMatematikaKirania + nilaiIpaKirania + nilaiIpsKirania) / 3;
    
    // Fahmy Bima Az Zukhruf
    double nilaiMatematikaFahmy = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai Matematika Fahmy"));
    double nilaiIpaFahmy = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai IPA Fahmy"));
    double nilaiIpsFahmy = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai IPS Fahmy"));
    double rataRataFahmy = (nilaiMatematikaFahmy + nilaiIpaFahmy + nilaiIpsFahmy) / 3;
    
    // Gathan Fairuz Izzudin
    double nilaiMatematikaGathan = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai Matematika Gathan"));
    double nilaiIpaGathan = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai IPA Gathan"));
    double nilaiIpsGathan = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai IPS Gathan"));
    double rataRataGathan = (nilaiMatematikaGathan + nilaiIpaGathan + nilaiIpsGathan) / 3;
    
    
    System.out.println("\n1." + namaSiswa1 + "\n\tNilai Matematika : " + nilaiMatematikaKirania + "\n\tNilai Ipa : " + nilaiIpaKirania + "\n\tNilai Ips : " + nilaiIpsKirania + "\n\tRata Rata : " + rataRataKirania + "\n");
    
    System.out.println("\n2." + namaSiswa2 + "\n\tNilai Matematika : " + nilaiMatematikaFahmy + "\n\tNilai Ipa : " + nilaiIpaFahmy + "\n\tNilai Ips : " + nilaiIpsFahmy + "\n\tRata Rata : " + rataRataFahmy + "\n");
    
    System.out.println("\n3." + namaSiswa3 + "\n\tNilai Matematika : " + nilaiMatematikaGathan + "\n\tNilai Ipa : " + nilaiIpaGathan + "\n\tNilai Ips : " + nilaiIpsGathan + "\n\tRata Rata : " + rataRataGathan + "\n");
    
    
    
  }
}



// import javax.swing.JOptionPane;
// Jika string
// JOptionPane.showInputDialog("Masukkan Nilai Matematika Kirania");

// jikai int
// Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Matematika Kirania"));

// jika double
// Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai Matematika Kirania"));

// jika boolean
// Boolean.parseBoolean(JOptionPane.showInputDialog("Masukkan Nilai Matematika Kirania"));

// jika float
// Float.parseFloat(JOptionPane.showInputDialog("Masukkan Nilai Matematika Kirania"))
