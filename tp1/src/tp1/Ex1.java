package tp1;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner sc = new Scanner(System.in);
		System.out.println("donner le premier entier");
		double x = sc.nextDouble();
		System.out.println("donner le deusieme entier");
		double y = sc.nextDouble();
		
		double d = 0;
		System.out.println("donner le type d'operation");
		String op=sc.next();
		switch(op)
		{
		   case "+":
		   {
			d=x+y;
			break;
		   }
		
		
		   case "-":
		   {
			d=x-y;
			break;
		   }
		
		
		
		   case "*":
		   {
			d=x*y;
			break;
		   }
		
	
	
		   case "/":
		   {
			d=x/y;
			break;
		   }
		
	
	default:{System.out.println("erreur");}
		
	
	
	}
		System.out.println("res="+d);
		

}
}