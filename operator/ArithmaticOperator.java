package operator;

public class ArithmaticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Addition
		
		int a=89 , b=78 , c;
		
		c=a+b;
		
		System.out.println("Addition is :"+c);
		
		//Subtraction
		
		double x=54.23 , y=12.43 , z;
		
	    z=x-y;
		System.out.println("Substract is :"+z);
		
		z=y-x;
		System.out.println("Substract is :"+z);
		
		//Multiplication
		
		int n=5;
		a=9;
		c=a*n;
		System.out.println("Multiplicatin is :"+c);
		
		//Division
		
		z=x/y;
		System.out.println("Division is :"+z);
		
		z=a/b;
		System.out.println("Division is :"+z);// show zero so manualy declared double 42 line
		
		z=(double)a/b;
		System.out.println("Division is in double of two integer :"+z);
		
		float m;
		m=(float)(x/y);
		System.out.println("Division is in flot of two double :"+m);
		
		m=(float)a/b;
		System.out.println("Division is in flot of two integer :"+m);
		
		int q;
		q=(int)(x/y);
		System.out.println("value of q is :"+q);
		
		// Modulus -- it returns the reminder(baki)
		
		int f=5 , g=2 , e;
		e=f % g;
		System.out.println("Modulus is :"+e);
		
		double s=45 , w=12;
		int h;
		h=(int)(s % w);
		System.out.println("Modulus is in int of two double :"+h);
		
		
		

	}

}
