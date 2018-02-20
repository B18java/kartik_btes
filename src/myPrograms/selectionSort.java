package myPrograms;

public class selectionSort {

	public static void main(String[] args) {
  int temp;
		int arr[]= {3,2,6,7,2,5,6,0,1,4};
		for(int i=0;i<9;i++)
		{
			for(int j=i+1;j<9;j++)
			{
				if(arr[i]>arr[j])
				{
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				}
			}}
			for(int k=0;k<9;k++)
			{
				System.out.print(arr[k]);
			}
		}}
