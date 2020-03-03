public class Zadanie01 {
    public static void main(String[] args) {
        int a = 1, b = 30; //zakres <a;b>
        int x = 2, y = 3; //liczby przez ktore dzielimy

        System.out.print("Liczby podzielne przez " + x + " a niepodzielne przez " + y + " to: ");
        for(int n = a; n <= b; n++){
            if((n % x == 0) && (n % y != 0)){
                System.out.print(n + " ");
            }
        }
        System.out.println("\n---KONIEC---");
    }
}
