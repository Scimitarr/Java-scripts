public class TabliczkaMnozenia {
    public static void main(String[] args) {
        int[][] macierz;
        macierz = new int[5][5];

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                macierz[i][j] = (i+1) * (j+1);
            }
        }
        System.out.println("Tabliczka mnożenia do 5:");
        System.out.print("  | ");
        for (int i = 0; i <= 4; i++){
            System.out.print(macierz[i][0] + " ");
        }
        System.out.println("\n----------------");
        for (int i = 0; i <= 4; i++) {
            System.out.print(macierz[0][i] + " | ");
            for (int j = 0; j <= 4; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
