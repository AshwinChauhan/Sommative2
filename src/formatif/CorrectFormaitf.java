package formatif;

import java.util.Scanner;

/*
* Author : ashwin
*Date : 15-Dec-2020
*Despcritoip
*/
public class CorrectFormaitf {

	public static void main(String[] args) 
	{
		int[] myTab= {12,405,3,29,296,1876,987};
		
		for (int i : myTab) 
		{
			System.out.println(i);
			
		}
		
		//System.out.println(nombrePairs(myTab));
		
		/*Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		if(isPresent(myTab,b))
			System.out.println(b +"l'element est present");
		else
			System.out.println(b +"n'est pas present");	
		sc.close();*/
		
		/*int[]myTab=new int[10];
		for (int i = 0; i <10; i++) 
		{
			myTab[i]=(int)(Math.random()*(i+1));
		}*/
		
	}
	//Method pour calculer et afficher la somme des élement du tableau d'entier
	static int calculerSomme(int []a)
	{
		int somme=0;
		for (int i = 0; i < a.length; i++) 
		somme+=a[i]; //additioner les element
		return somme;
	}
// si un element existe dans un tableau d'entier
static boolean isPresent(int []a, int s) // l'usager va fournier l'emenent s
{
	for (int i = 0; i < a.length; i++) 
	{
		if(a[i]==s) //si l'element est presente
			return true;
	}
	return false; // si l'élement n'a pas été trouvé
		
	}
// compter les nombre pair d'un tableau
static int nombrePairs(int []a)
{
	int cpt=0;
	for (int i = 0; i < a.length; i++) 
	{
		if(a[i]%2==0) //Si le nombre est paire
		cpt++;
		
	}
	return cpt;
}
}
//Method pour amputer un tableau d'entier de l'element le plus grand (sans modifier la taille du tableau)


	
	