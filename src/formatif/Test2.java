package formatif;

import java.util.Arrays;

/*
* Author : ashwin
*Date : 16-Dec-2020
*Bonjour
*Method qui permet de faire la moyenne des nombres impaires contenues dans un tableau de 20 nombres entiers
*génerés au hazard
*/
public class Test2 {

	public static void main(String[] args) 
	{
		{
			// code pour generer 20 nombre au hazzard
			int [] myTab = new int [20];
			for(int i= 0; i<20; i++)
			{myTab[i] = (int)(Math.random() * (i+1));}
			System.out.println(Arrays.toString(myTab));
			System.out.println(ashwin(myTab));
			}
	}
// method pour trouver les nombre impaire puis trouver la moyenne
	static double ashwin(int []nbr)
	
	{
		int somme=0;
		double moy=0.0;
		int cpt=0;
		for(int i=0; i<nbr.length; i++)
		{
			if(nbr[i]%2==1)
			{
				cpt++;
				somme+=nbr[i];
				
			}
		}
		{
		moy=somme/cpt;
		return moy;
		}
			
			
		
		
	}
	
}


	

