public class Fibonacci {

    public static String calculate(double op1) {
        double x = 0;
        double y = 1;
        double z = 1;
        String r = "";
        String resultat = "0";

        for (int i = 0; i < op1; i++) {
            r = String.valueOf(z);
            //Nachkommastellen abschneiden
            if (r.substring(r.length() - 2).equals(".0")) {
                r = r.substring(0, r.length() - 2);
            }

            resultat = resultat + "," + r;
            z = x + y;
            x = y;
            y = z;
        }
        return resultat;
    }
}