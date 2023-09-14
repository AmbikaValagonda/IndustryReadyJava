package class3operators;

public class TypeCasting {
	public static void main(String[] args) {
		
		//Implicit Type casting
		int a = 7;
		long b;
		b = a;
		
		float f1 = 4.508f;
		double d1;
		
		d1 = f1;
		System.out.println("d1: " + d1);
		System.out.println("b: " + b);
		
		//Explicit Type Casting
		long c = 45;
		int d;
		d =  (int) c;
		
		double d2 = 4.67889786676775676767678;
		float f2 ;
		f2 = (float) d2;
		System.out.println("f2: " + f2);
		
		
	}
}
