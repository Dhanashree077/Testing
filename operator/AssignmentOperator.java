package operator;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=45;
		int b=3;
		
		a+=23;                      //a=a+23
		System.out.println("value of a : "+a);
		
		a+=b;                       //a=a+b
		System.out.println("value of a : "+a);
		
		b*=a;                       //b=b*a
		System.out.println("value of b : "+b);
		
		int c=30 , d=32;
		
		c>>=2;                      //c=c>>2
		System.out.println("value of c : "+c);
		
		d<<=3;                      //d=d<<3
		System.out.println("value of d : "+d);
		
		int g=50 , i=5;
		
		g/=i;                     //g=g/i
		System.out.println("value of g : "+g);
		
		g%=i;                     //g=g%i
		System.out.println("value of g : "+g);

	}

}
