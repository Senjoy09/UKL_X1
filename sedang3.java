import java.util.Random; // Menghasilkan angka dan operator secara acak
import java.util.Scanner;
public class sedang3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Selamat datang di Kuis Matematika!");
        System.out.println("Jawab pertanyaan berikut atau ketik keluar untuk menghentikan kuis");
        int [] bilanganPertama = new int [5]; // Menyimpan angka soal
        int [] bilanganKedua = new int [5]; // Menyimpan angka soal
        int [] hasilBenar = new int [5]; // Menyimpan hasil perhitungan yang benar
        char [] simbolOperator = new char [5]; // Menyimpan operator
        for (int d = 0; d < bilanganPertama.length; d++) {
            // Menghasilkan angka dan operator secara acak
            // Menghitung hasil sesuai operator yang dipilih
            bilanganPertama [d] = random.nextInt(10) + 1;
            bilanganKedua [d] = random.nextInt(10) + 1;
            int operator = random.nextInt(3);
            if (operator == 0) {
                simbolOperator [d] = '*';
                hasilBenar [d] = bilanganPertama [d] * bilanganKedua [d];
            } else if (operator == 1) {
                simbolOperator [d] = '/';
                hasilBenar [d] = bilanganPertama [d] / bilanganKedua [d];
            } else if (operator == 2) {
                simbolOperator [d] = '%';
                hasilBenar [d] = bilanganPertama [d] % bilanganKedua [d];
            }
        }
        int soalIndex = 0;
        String input = "";
        while (soalIndex < bilanganPertama.length) { // Berjalan selama soal belum selesai
            System.out.print(bilanganPertama [soalIndex] + " ");
            System.out.print(simbolOperator [soalIndex] + " ");
            System.out.println(bilanganKedua [soalIndex] + " = ?");
            input = scanner.nextLine();
            if (input.length() == 6 && input.charAt (0) == 'k' && input.charAt(1) == 'e' && input.charAt(2) == 'l' && input.charAt(3) == 'u' && input.charAt(4) == 'a' && input.charAt(5) == 'r') {
                System.out.println("Terimakasih sudah bermain!");
                break;
            }
            int jawabanUser = 0;
            int validInput = 1;
            for (int d = 0; d < input.length(); d++) {
                if (input.charAt (d) < '0' || input.charAt (d) > '9') {
                    validInput = 0;
                    break;
                }
                jawabanUser = jawabanUser * 10 + (input.charAt (d) - '0');
            } if (validInput == 1) {
                if (jawabanUser == hasilBenar [soalIndex]) {
                    System.out.println("Jawaban anda benar!");
                } else {
                    System.out.println("Jawaban anda salah! Jawaban yang benar adalah: " + hasilBenar [soalIndex]);
                }
                soalIndex++;
            } else {
                System.out.println("Input tidak valid, masukkan angka atau ketik keluar untuk keluar");
            }
        }
    }
}