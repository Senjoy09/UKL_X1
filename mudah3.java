import java.util.Scanner;
public class mudah3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Masukkan bilangannya : ");
        int c = scanner.nextInt(); // Variabel yang akan digunakan dalam perulangan
        do { // Menjalankan kode setidaknya satu kali, bahkan jika kondisi dalam while bernilai salah sejak awal
            if (c % 3 == 0) {
                System.out.println(c + ". Saya angkatan 33");
            } else if (c % 3 == 1) {
                System.out.println(c + ". Saya anak wikusama");
            } else {
                System.out.println(c + ". Saya anak moklet");
            } c--; // Pada setiap proses pengulangan , nilai c dikurangi 1 sehingga perulangan dapat berhenti setelah nilai c kurang dari 2
        } while (c >= 2); // Perulangan akan terus berjalan selama nilai c lebih besar atau sama dengan 2
        System.out.println("1. Saya senang");
    }
}