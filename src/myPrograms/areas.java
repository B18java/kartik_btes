package myPrograms;
import java.util.Scanner;
public class areas {
    public static void main(String[] args) {
        int side,rad;
        double ar1,ar2;
        System.out.println("Enter side of square:");
        Scanner s=new Scanner(System.in);
        side=s.nextInt();
        ar1=side*side;
        System.out.println("area of square is:"+ar1);
        System.out.println("enter radius of circle");
        Scanner sc=new Scanner(System.in);
        rad=sc.nextInt();
        ar2=3.14*rad*rad;
        System.out.println("area of circle is:"+ar2);
    }
}
