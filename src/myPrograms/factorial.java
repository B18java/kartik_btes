package myPrograms;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int fact=1,num;
        System.out.println("enter the number");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial of number:"+fact);
    }
}
