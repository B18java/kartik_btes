package myPrograms;

public class patterns6 {
	
	static int a=2;
	public static int givePrime()
	{
		boolean flag=false;
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			int temp=a;
			a++;
			return temp;
		}
		else {
			a++;
			//System.out.println("hdvyg");
			//givePrime();
		}
		return givePrime();
	}
	public static void main(String[] args) {

	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=7;j++)
		{
			if((5-i)<=j  &&  j<= (3+i))
			{
				System.out.print(givePrime());
				
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
		}


	}

}
