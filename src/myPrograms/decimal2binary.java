package myPrograms;
import java.util.Scanner;
public class decimal2binary {
    public static void main(String[] args) {
        int i=0,j,n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the decimal number");
        n=s.nextInt();
        int a[]=new int[100];
        while(n>0)
        {
            a[i++]=n%2;
            n=n/2;
            
        }
        System.out.println("binary number is: ");
        for(j=i-1;j>=0;j--)
        {
            System.out.print(a[j]);
        }}}
        
    