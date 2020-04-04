
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Answer {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("in.txt");
        Scanner scan = new Scanner(file);
        String name = scan.nextLine();
        System.out.println("Hello World "+name);
        scan.close();
    }
}