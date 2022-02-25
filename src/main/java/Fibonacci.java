public class Fibonacci {

    public static double op1;
    public static double x = 0;
    public static double y = 1;
    public static double z = 1;
    public static String r = "";
    public static String resultat = "0";
    private double calculate;

    public Fibonacci(double op1){
        this.op1 = op1;
    }

    public static String calculate() {

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