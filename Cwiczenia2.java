public class Cwiczenia2 {
    public static void main(String[] args) {
        //ax^2 + bx + c
        double a = 0,  b = 4, c = 2;
        double x0, x1, x2;
        double delta = b * b - 4 * a * c;
        if(a != 0) {
            if (delta == 0) {
                x0 = -b / (2 * a);
                System.out.println("Rozwiazaniem rownania jest " + x0);
            } else if (delta > 0) {
                x1 = -b - Math.sqrt(delta) / (2 * a);
                x2 = -b + Math.sqrt(delta) / (2 * a);
                System.out.println("Rozwiazaniami rowniania sa " + x1 + " oraz " + x2);
            } else
                System.out.println("Rownanie nie ma rozwiazan");
        }
        else
            System.out.println("To nie jest rownanie kwadratowe");
    }
}
