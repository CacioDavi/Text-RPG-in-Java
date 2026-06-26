import java.io.IOException;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        GameIntro.main();

        while (true) {
            String response = scanner.nextLine();
        }
        
    }
}
