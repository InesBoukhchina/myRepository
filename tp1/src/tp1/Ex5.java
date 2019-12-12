package tp1;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int NL=2;
		final int NC=2;
		int M[][];
		M=new int[NL][NC];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<NL;i++)
			for(int j=0;j<NC;j++)
			{
				System.out.println("donner un entier(M["+i+"]["+j+"]) : ");
				M[i][j]=sc.nextInt();
				
			}
		for(int i=0;i<NL;i++)
		{
			int max=M[i][0];
			int min=M[i][0];
			for(int j=1;j<NC;j++)
			{
			if(M[i][j]>max)
				max=M[i][j];
			if(M[i][j]<min)
				min=M[i][j];				
			}
			System.out.println("Pour la ligne "+i+": min="+min+" max="+max);
		}
	}

	}


