public class sulit3 {
    public static void main(String[] args) {
        int [] array = {1, 1, 1, 2, 2, 3, 3, 3}; // Array berisi elemen int, menghitung berapa kali setiap elemen muncul dalam array
        hitungFrekuensi(array); // Menghitung frekuensi kemunculan setiap elemen dalam array
    } public static void hitungFrekuensi(int[] array) {
        for (int g = 0; g < array.length; g++) { // Memproses setiap elemen dalam array satu per satu
            int frekuensi = 1; // Elemen pertama yang ditemukan dianggap muncul sekali
            for (int h = g + 1; h < array.length; h++) { // Memeriksa elemen setelah indeks g untuk mencari elemen yang sama
                if (array [g] == array[h]) { // Nilai frekuensi akan ditambah 1
                    frekuensi++;
                    array [h] = -1; // Nilai array [h] diubah menjadi -1 untuk menandai bahwa elemen tersebut sudah dihitung
                }
            } if (array [g] != -1) { // Jika elemen array [h] belum dihitung, elemen akan dicetak bersama jumlah kemunculannya
                System.out.println(array [g] + " muncul " + frekuensi + " kali");
            }
        }
    }
}