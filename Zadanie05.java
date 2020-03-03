public class Zadanie05 {
    public static void main(String[] args) {
        //odwrocenie tablicy
        int[] tablica1 = {10,21,33,4,15,6};
        int[] tablica2;
        tablica2 = new int[tablica1.length];
        int j = 0;

        for(int i = 0; i < 6; i++){
            tablica2[j] = tablica1[i];
            j--;
        }
        for(int i = 0; i < 6; i++){
            System.out.print(tablica2[i] + " ");
        }

    }
}
