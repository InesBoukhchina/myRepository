package tp1;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("saisir un entier");
		int N=sc.nextInt();
		System.out.println("saisir un reel");
		double x=sc.nextDouble();
	    double somme=1;
	    int f=1;
		for ( int i=1;i<=N;i++)
		{
			f=f*i;
			somme=somme+Math.pow(x,i)/f;
			
		} 
		
		System.out.println(somme);

	}

}
