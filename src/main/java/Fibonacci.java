public class Fibonacci {

    private static double x = 0;
    private static double y = 1;
    private static double z = 1;
    private static String r = "";
    private static String resultat = "0";

    public static String calculate(double op1) {
        for (int i=0;i<op1;i++){
            r =     String.valueOf(z);
            //Nachkommastellen abschneiden
            if (r.substring(r.length()-2).equals(".0")){
                r = r.substring(0,r.length()-2);
            }

            resultat = resultat +","+ r;
            z= x + y;
            x = y;
            y = z;
        }
        return resultat;
    }
}