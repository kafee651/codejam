import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Answer {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("in.txt");
        Scanner scan = new Scanner(file);
        int index = scan.nextInt();
        for(int i = 1;i <= index;i++){
            int n = scan.nextInt();
            ArrayList<Long> a = new ArrayList<>();
            ArrayList<Long> b = new ArrayList<>();
            for(int j = 1;j <= n;j++){
                a.add(scan.nextLong());
            }
            for(int j = 1;j <= n;j++){
                b.add(scan.nextLong());
            }
            a.sort(null);
            b.sort(null);
            Long sum = 0L;
            for(int j = 0;j < n;j++){
                sum += a.get(j)*b.get(n-1-j);
            }
            System.out.println("Case #"+i+": "+sum);
        }
        scan.close();
    }
}