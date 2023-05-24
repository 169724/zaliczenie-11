import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tablica = {9, 3, 8, 2, 5};
        System.out.println("Tablica przed sortowaniem: " + Arrays.toString(tablica));
        sortujMalejaco(tablica);
        System.out.println("Tablica po sortowaniu: " + Arrays.toString(tablica));
    }
 public static void sortujMalejaco(int[] tablica) {
        int n = tablica.length;
    for (int i = 0; i < n - 1; i++) {
       for (int j = 0; j < n - 1 - i; j++) {
                if (tablica[j] < tablica[j + 1]) {
                  

                    int temp = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = temp;
                }
            }
        }
    }
}
