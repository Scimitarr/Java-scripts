public class ZadanieTablica {
    public static void main(String[] args) {
        //odwrocona tablica
        int[] tablica1 = {1,2,3,4,5,6,7};
        int[] tablica2;
        tablica2 = new int[tablica1.length];
        int j = 0;

        for (int i = tablica1.length - 1; i >= 0; i--) {
            tablica2[j] = tablica1[i];
            j++;
        }
        for(int i = 0; i <= tablica2.length - 1; i++){
            System.out.print(tablica2[i] + " ");
        }
        System.out.println("\n---WERSJA 2----------------");
        int pomocnicza;
        j = tablica1.length - 1;
        for(int i = 0; i <= tablica1.length / 2; i++){
            pomocnicza = tablica1[i];
            tablica1[i] = tablica1[j];
            tablica1[j] = pomocnicza;
            j--;
        }
        for(int i = 0; i <= tablica1.length - 1; i++){
            System.out.print(tablica1[i] + " ");
        }

    }
}
