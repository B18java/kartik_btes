package myPrograms;
import java.util.Scanner;
public class armstrongs {
public static void main(String [] args)
{
	int l,rem,n,sum=0,original;
	System.out.println("enter a number");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	original=n;
	l=length(n);
	while(n>0)
	{
		rem=n%10;
		sum=sum+pow(rem,l);
		n=n/10;
	}
	if(sum==original)
		System.out.println("armstrong number");
	else 
		System.out.println("It is not armstrong number");
}
public static int pow(int rem,int l)
{
	int s=1;
	for(int i=1;i<=l;i++)
	{
		s=s*rem;
	}
	return s;
}
public static int length(int n)
{
	int s=0;
	while(n>0)
	{
		s++;
		n=n/10;
	}
	return s;
}}