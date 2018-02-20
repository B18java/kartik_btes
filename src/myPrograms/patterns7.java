package myPrograms;
//prime no
public class patterns7 {

	public static void main(String[] args) {
		 int i,j,k,count;
	       
	        for(i=1;i<=6;i++)
	        {count=1;
	        for(j=1;j<=i*2;j++)
	        {
	            
	            boolean isPrime=true;
	                for(k=2;k<j;k++)
	                {
	                    if(j%k==0)
	                    {
	                    isPrime=false;
	                   
	                    break;
	                    }}
	                  if((isPrime==true)&& count<=i)
	        {
	            System.out.print(j);
	            count++;
	        }
	        }
	        System.out.println();
	        }
	}}
