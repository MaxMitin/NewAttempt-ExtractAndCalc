import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ExtractAndCalc {
    public static void main(String[] args) {

        String TextFile = "a1.txt";
        try {
            Scanner scannerFile = new Scanner(new File(TextFile));
            int x = scannerFile.nextInt();
            int y = scannerFile.nextInt();
            System.out.println("Сумма извлеченых чисел равна значению: " + (x+y));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Ой-ой!");
        }
    }
}








