package myPrograms;

import java.util.*;

public class bubbleSort {

	public static void main(String[] args) {
     int a[]= new int [5];
     int i,j,temp;
     Scanner s = new Scanner(System.in);
     for(i=0;i<=4;i++)
     {
 		a[i] =s.nextInt();
	}
     for(i=0;i<4;i++)
     {
    	 for(j=0;j<4-i;j++)
    	 {
    		if(a[j]>a[j+1]) 
    		{
    			temp=a[j];
    			a[j]=a[j+1];
    			a[j+1]=temp;
    		}
    	 }
     }
     for(j=0;j<=4;j++)
     {
    	System.out.println(a[j]); 
     }
     }}
    
