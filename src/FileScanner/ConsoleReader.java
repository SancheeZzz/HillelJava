package FileScanner;
import java.util.Scanner;
public class ConsoleReader implements Reader {

    public String read(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }


}
