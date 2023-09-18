package class3operators;

public class OperatorIncrementDecrement {
	public static void main(String[] args) {
		
		int a=5;
		int b;
		int c;
		a++;
		++a;
		++a;
		a++;
		System.out.println(a);
		a = ++a;
		System.out.println(a);	
		a = a++;
		System.out.println(a);
		c = ++a;
		System.out.println(c);
		System.out.println(a);
		//Ex10 Compound assignment - while assigning we are doing the operation
		int age = 18;
		age += 18;
		System.out.println(age);
		
		int num = 10;
		num -= 1;
		System.out.println(num);
		
		
		
	}

}
