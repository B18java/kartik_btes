package myPrograms;

public class reverseword {
public static void main(String[] args) {
String s = "Pawan nagar is beautiful place";
int j=0;
String a="",store="";
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)==' ' || i==s.length()-1)
{
if(i==s.length()-1)
{
a=s.substring(j,i+1);	
}
else
{
	a=s.substring(j,i);
}
for(int k=a.length()-1;k>0;k--)
{
	store = store + a.charAt(k);
}
System.out.println();

store=store+" ";
j=i+1;
System.out.println(store);
}
}
	}

}
