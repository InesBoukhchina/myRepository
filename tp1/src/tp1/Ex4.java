package tp1;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		String tab[];
		tab=new String[4];
		int couleur;
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<tab.length;i++)
		
		
			
			{
				
				do {
					System.out.println("tab["+i+"] : ");
					System.out.println("choisissez une couleur :");
					System.out.println("1-Rouge");
					System.out.println("2-Jaune");
					System.out.println("3-Noir");
					couleur=sc.nextInt();
				
                    }
				while((couleur<1)||(couleur>3));
			
			             if(couleur==1)
			              tab[i]="rouge";
			             else if (couleur==2)
				          tab[i]="jaune";
			             else
			               	tab[i]="noir";
				
			
			}
		
		int e=0;
		while(e<tab.length)
		{
			
			if(tab[e]=="rouge") {
				for(int j=e;j>0;j--)
					tab[j]=tab[j-1];
				tab[0]="rouge";
			}
			else if(tab[e]=="noir")
			{
				for(int j=e;j<tab.length-1;j++)
					tab[j]=tab[j+1];
				tab[tab.length-1]="noir";
			}
			e++;
				
		}
		
		
		
		
		for(int i=0;i<tab.length;i++)
		{
			System.out.println("tab["+i+"] : ");
			System.out.println(tab[i]);
		}
		
    }
 }
