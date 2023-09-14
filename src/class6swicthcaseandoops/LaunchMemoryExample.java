package class6swicthcaseandoops;

class Demo {
	
	int a = 70;
	double d = 77.8;
	
	void disp() {
		a = 10;
		d = 45.5;
		System.out.println("a, d: " + a + " " + d);
	}
	
	void disp3() {
		a = 20;
		d = 35.5;
		System.out.println("a, d: " + a + " " + d);
	}
}

class Demo2{
	void disp() {
		Demo d = new Demo();
		d.disp();
	}
}
public class LaunchMemoryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Demo2 d2 = new Demo2();
		//d2.disp();
		Demo d = new Demo();
		d.disp();
		d.disp3();
		d.disp();

	}

}
