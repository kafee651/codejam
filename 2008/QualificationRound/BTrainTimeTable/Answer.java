import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Answer {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("in.txt");
        Scanner scan = new Scanner(file);
        int index = Integer.parseInt(scan.nextLine());
        for(int i = 1;i <= index;i++){
            int t = Integer.parseInt(scan.nextLine());
            int na = scan.nextInt();
            int nb = scan.nextInt();
            ArrayList<Integer> aa = new ArrayList<>();
            ArrayList<Integer> ar = new ArrayList<>();
            ArrayList<Integer> ba = new ArrayList<>();
            ArrayList<Integer> br = new ArrayList<>();
            String temp = scan.nextLine();
            for(int j = 1;j <= na;j++){
                String trainTime = scan.nextLine();
                String[] ad = trainTime.split(" ");
                String[] hm = ad[0].split(":");
                Integer h = Integer.parseInt(hm[0]);
                Integer m = Integer.parseInt(hm[1]);
                ar.add(m+h*60);
                hm = ad[1].split(":");
                h = Integer.parseInt(hm[0]);
                m = Integer.parseInt(hm[1]);
                ba.add(m+h*60 + t);
            }
            for(int j = 1;j <= nb;j++){
                String trainTime = scan.nextLine();
                String[] ad = trainTime.split(" ");
                String[] hm = ad[0].split(":");
                Integer h = Integer.parseInt(hm[0]);
                Integer m = Integer.parseInt(hm[1]);
                br.add(m+h*60);
                hm = ad[1].split(":");
                h = Integer.parseInt(hm[0]);
                m = Integer.parseInt(hm[1]);
                aa.add(m+h*60 + t);
            }
            aa.sort(null);
            ba.sort(null);
            ar.sort(null);
            br.sort(null);
            //System.out.println("AA list");
            for(Integer ia :aa){
                //System.out.println(ia);
            }
            //System.out.println("BA list");
            for(Integer ia :ba){
                //System.out.println(ia);
            }
            //System.out.println("AR list");
            int aai = 0;
            int bai = 0;
            int ansA = 0;
            int ansB = 0;
            for(Integer ia :ar){
                //System.out.println(ia);
                if(aa.size() > 0 && aai < aa.size() && ia >= aa.get(aai)){
                    aai++;
                }else{
                    ansA++;
                }
            }
           // System.out.println("BR list");
            for(Integer ia :br){
                //System.out.println(ia);
                if(ba.size() > 0 && bai < ba.size() && ia >= ba.get(bai)){
                    bai++;
                }else{
                    ansB++;
                }
            }
         
            System.out.println("Case #"+i+": "+ansA+" "+ansB);
        }
        scan.close();
    }
}