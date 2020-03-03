public class Zadanie03 {
    public static void main(String[] args) {
        int iloscPotrzebnychLiczbDoZnalezienia = 5;
        int iloscZnalezionychLiczb = 0;
        int suma = 0;

        for(int i = 1; iloscZnalezionychLiczb < iloscPotrzebnychLiczbDoZnalezienia; i++){
            String lancuch = Integer.toString(i);
            if((lancuch.endsWith("1")) || (lancuch.endsWith("2")) || (lancuch.endsWith("7"))) {
                suma = suma + i;
                iloscZnalezionychLiczb++;
            }

        }
        System.out.println(suma);

    }
}
