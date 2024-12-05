import java.util.Scanner;
public class sedang2 {
    public static void volume (double phi, int r, int t) { // Method volume digunakan untuk menghitung rumus volume tabung
        Scanner scanner = new Scanner (System.in);
        System.out.println("Masukkan jari jarinya : ");
        int jariJari = scanner.nextInt();
        System.out.println("Masukkan tingginya : ");
        int tinggi = scanner.nextInt();
        double hasil = phi * jariJari * jariJari * tinggi;
        System.out.println("Hasil : " + hasil);
    }
    public static void main (String[] args) {
           volume(3.14, 7, 15); // Memanggil method volume dengan argumen
    }
}