package c4_oops_patterns;

public class LaunchPatternProgramming {
public static void main(String[] args) {
	
	/*
	   *****
	   *****
	   *****
	   *****
	   *****
	 */
	
	int n=5;
	
	for(int i=0; i<n; i++) {
		for(int j=0; j<n; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	/*
	   *****
	   *   *
	   *   *
	   *   *
	   *****
	 */
	
	System.out.println("_____________________________________");
	System.out.println();
	
	
	for(int i=0; i<n; i++) {
		for(int j=0; j<n; j++) {
			//System.out.print("*");
			if(i==0 || i == (n-1) || j==0 || j==(n-1)) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	
	
	//Other Pattern
	
	System.out.println("_____________________________________");
	System.out.println();
	
	
	for(int i=0; i<n; i++) {
		for(int j=0; j<n; j++) {
			//System.out.print("*");
			if(i==0 || i == (n-1)/2 || j==0 || j==(n-1)) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	
	
	System.out.println("_____________________________________");
	System.out.println();
	
	
	for(int i=0; i<n; i++) {
		for(int j=0; j<n; j++) {
			//System.out.print("*");
			if(i==0 || j == (n-1)/2 ) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	
	
	System.out.println("_____________________________________");
	System.out.println();
	
	
	for(int i=0; i<n; i++) {
		for(int j=0; j<n; j++) {
			//System.out.print("*");
			if(j==0 || j==(n-1)|| i == (n-1)/2 ) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	
	
	System.out.println("_____________________________________");
	System.out.println();
	
	
	for(int i=0; i<n; i++) {
		for(int j=0; j<n; j++) {
			//System.out.print("*");
			if(j==0 || i==0 || i==(n-1)/2|| i == (n-1)) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	

}
}
