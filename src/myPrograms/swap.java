package myPrograms;
import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
          int x,y;
        System.out.println("Enter values of x and y");
        Scanner s=new Scanner(System.in);
        x=s.nextInt();
        y=s.nextInt();
        System.out.println("before swapping x= "+x+" y="+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("after swapping x= "+x+" y="+y);
    }
}