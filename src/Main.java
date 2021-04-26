import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file");
        Scanner scanner  = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFileText readFileText = new ReadFileText();
        readFileText.readFileText(path);
//        readFileText(path);
    }
}
