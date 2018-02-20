package myPrograms;
import java.util.*;
public class insertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp,i,j;
		int a[]=new int[6];
		
		System.out.println("Enter value ");
		for( i=0;i<=4;i++) {
		a[i] =sc.nextInt();
         if(a[i]==1)
         {
        	 for(int k=0;k<=4;k++)
        	 {
		if(a[i+1]>a[i])
		{
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}}}}
		for(j=0;j<=4;j++)
		{
			System.out.println(a[j]);
		}
		}}
