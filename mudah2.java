import java.util.Scanner;
public class mudah2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan bilangannya : ");
        int [] bilangan = new int [5];
        for (int i = 0; i < 5; i++) {
            bilangan [i] = scanner.nextInt();
        } System.out.println("Hasil bilangan : ");
        for (int i = 0; i < 5; i++) {
            if (bilangan [i] % 2 == 0) {
                System.out.println("Bilangan " + bilangan [i] + " adalah bilangan genap");
            } else {
                System.out.println("Bilangan " + bilangan [i] + " adalah bilangan ganjil");
            }
        }
    }
}
