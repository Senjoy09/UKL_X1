public class sulit2 {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 3, 4};
        cekDuplikat(array);
    } public static void cekDuplikat(int[] array) {
        int duplikatDitemukan = 0;
        for (int e = 0; e < array.length; e++) {
            if (array [e] == -1) {
                continue;
            } for (int f = e + 1; f < array.length; f++) {
                if (array [e] == array [f]) {
                    System.out.println("Array memiliki elemen duplikat : " + array [e]);
                    array [f] = -1;
                    duplikatDitemukan = 1;
                    break;
                }
            }
        } if (duplikatDitemukan == 0) {
            System.out.println("Array tidak memiliki elemen duplikat");
        }
    }
}