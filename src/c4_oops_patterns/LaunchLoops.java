package class4loopspatterns;

public class LaunchLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FOR LOOP
		int n = 20;
		//Initialization, condition check and if true execute body, increment Repeat
		for(int i=0; i<5; i++) {
			System.out.println(i);
			//System.out.print(i);
		}
		
		
		//WHILE LOOP - Initialization is not mandate
		while(true) {
			System.out.println("*");
			int a = 10;
			if (a< 15) {
				break;
			}
		}
		int i = 1;
		while(i<n) {
			System.out.println("i: "+i);
			i++;
		}
		
		// DO WHILE
		int j = 1;
		do {
			System.out.println(j);
			j++;
		}while(j<n);
	}

}
