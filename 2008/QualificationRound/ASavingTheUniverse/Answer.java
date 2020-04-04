import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Answer {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("in.txt");
        Scanner scan = new Scanner(file);
        int index = Integer.parseInt(scan.nextLine());
        for(int i = 1;i <= index;i++){
            int n = Integer.parseInt(scan.nextLine());
            for(int j = 1;j <= n;j++){
                String engin = scan.nextLine();
            }
            HashSet<String> sset = new HashSet<>();
            int q = Integer.parseInt(scan.nextLine());
            String temp = "-1";
            int ans = -1;
            if(q == 0){
                ans = 0;
            }
            for(int j = 1;j <= q;j++){
                String sstring = scan.nextLine();
                sset.add(sstring);
                if(sset.size() >= n){
                    if(!temp.equals(sstring)){
                        ans++;
                    }
                    sset.clear();
                    sset.add(sstring);
                }
            }
            if(sset.size() != 0){
                ans++;
            }
            System.out.println("Case #"+i+": "+ans);
        }
        scan.close();
    }
}