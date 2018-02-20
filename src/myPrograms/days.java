package myPrograms;
import java.util.Scanner;
public class days {
    public static void main(String[] args) {
        int d,m;
        System.out.println("Enter the number of days");
        Scanner s=new Scanner(System.in);
        d=s.nextInt();
        m=d/30;
        d=d%30;
        System.out.println("months="+m+"days="+d);
  
    }
}
