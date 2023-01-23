package operator;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean x=true , y=false , z;
		
		z= x && y;
		System.out.println("logical and-x && y : "+z);
		
		z= x || y;
		System.out.println("logical or-x || y : "+z);
		
		int a=50 , b=45 , c=78;
		
		z= (a<b) && (a<c);
		System.out.println("logical and-x && y : "+z);
		
		z= (a<b) || (a<c);
		System.out.println("logical or-x || y : "+z);



	}

}
