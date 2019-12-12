package tp1;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		final double a;
		a=0;
        final double b;
		b=8;
	    final double c;
	    c=4;
	    double d;
	    
		if (a==0)
		{
			if(b==0)
			{
				if(c==0)
				{
					System.out.println("il y a une infinité de solutions");
				}
				else 
				{ 
					System.out.println("pas de solution");
				}
				
			}
			else
			{
				 double x=-c/b;
					System.out.println("la solution est"+ x);
			
			}
			
			
		}
		else 
		{
			d=(b*b)-(4*(a*c));
		if (d>0)
		{
			double x1= (-b-Math.sqrt(d))/2*a;
			double 	x2= (-b+Math.sqrt(d))/2*a;
			System.out.println(x1);
			System.out.println(x2);
		}
		if(d==0)
		{    
            double x=(-b/(2*a));
	    }
		if(d<0)
		{
			System.out.println("pas de solutions");
		}
		
			
			
		
		
		
	    }

     }
}
