package c3_operators;

public class RelationalLogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// <, <=, >, >=, !=, == Relational
		// &&, ||, !, ~ Logical
		// int 12age; Invalid
		int age12; // Valid
		int age_12_; //Valid
		int $; //Valid
		int $_; //Valid
		int _$; //Valid
		int $Age; //Valid
		int _$age; //Valid
		int m_of_$; //Valid
		int num = 10_1000; //Valid
		//int 10_; //Invalid
		float f = 10.5f;
		//float f1 = 10.5_f; //Invlid
		int ff_45;//Valid
		//int ff_@; //Invalid
		int ff_; //Valid
			
		
		int a = 18;
		int b = 20;
		int c = 18;
		
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a==b);
		System.out.println(a<=b);
		System.out.println(a>=c);
		System.out.println(a!=c);
		System.out.println(a==b);
		System.out.println(a==c);
		
		boolean res = (a<b) && (a>b) && (a==c);
		System.out.println("res:: "  + res);
		
		boolean res1 = (a<b) || (a>b) || (a==c);
		System.out.println("res1:: "  + res1);
	
		boolean res2 = (a<b) && (a<=b) && (a>=c);
		System.out.println("res2:: "  + res2);
		
		
		boolean res3 = (a>b) && (a>b) && (a==c);
		boolean res4 = (a>b) || (a>b) || (a==c);
		
		System.out.println("res3 "+res3);
		System.out.println("res4 "+res4);
	}

}
