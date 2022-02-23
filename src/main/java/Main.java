import org.apache.log4j.Logger;
import java.io.*;
import java.sql.SQLException;

public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());
    static int number_of_values = 30;

    public static void main(String[] args)throws IOException, SQLException {
        Fibonacci result = new Fibonacci(number_of_values);
        log.debug("Hello this is a debug message");
        log.info(Fibonacci.calculate());
    }
}
