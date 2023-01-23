package operator;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int a=10;
	a++;                     //a=a+1
	System.out.println("value of a = "+a);
	
	int b=45;
	b--;                     //b=b-1    
	System.out.println("value of b = "+b);
	
	int x=55 , y=48 ,z ,m ;
	z=x++;                  //postfix ----it assign first old value and than icrease
	System.out.println("value of z = "+z+" x= "+x);
	
	m=++y;                 //prefix ------ first icrease than assign value
	System.out.println("value of m = "+m+" y= "+y);

	}

}
