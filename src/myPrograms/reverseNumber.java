package myPrograms;
import java.util.*;
public class reverseNumber {

	public static void main(String[] args) {
 int rev=0,a;
 Scanner s= new Scanner(System.in);
 System.out.println("Enter a number");
 a=s.nextInt();
   while(a!=0)
   {
	int digit=a%10;
	rev= (rev * 10) + digit;
	a=a/10;
   }
System.out.println(rev);
	}

}
