public class Zadanie1 {
    public static void main(String[] args) {
        int[] tablica = {1,0,-1,2,3,-5,3,1,9,4};
        int suma = 0, min = tablica[0], max = tablica[0];
        for (int element : tablica) {
           suma =  element + suma;
            if (element < min)
                min = element;
            if (element > max)
                max = element;
        }
        System.out.println("Suma elementow tablicy wynosi " + suma);
        System.out.println("Najmniejszy element tablicy wynosi " + min);
        System.out.println("Najwiekszy element tablicy wynosi " + max);
        System.out.println("Srednia arytmetyczna elementow tablicy wynosi " + (double) suma / tablica.length);
    }
}
