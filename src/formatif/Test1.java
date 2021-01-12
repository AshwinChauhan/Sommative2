
package formatif;
/*
* Author : ashwin
*Date : 15-Dec-2020
*Description: 
*/
public class Test1 
{

	public static void main(String[] args) 
	{
	int [] myTab = new int [100];
	for(int i= 0; i<100; i++)
	{myTab[i] = (int)(Math.random() * (i+1));}
	
	for(int i : myTab)
	{System.out.println(i);}
	}
	
static boolean NPsomme (int a)		
{
	for (int i = 0; i < 100; i++) 
	{
		for(int j=2;j<=a/2;j++)
		{
			if(a%j ==0)
			{
				return false;
			}
			else return true;
		}
	if(return true)
	{
		int somme=0;
		for(int i=0;i<a.length;i++)
		{
			somme+=a[i];  // somme = somme+a[i];
		}
	}
	}
	return true;
	

}
}

