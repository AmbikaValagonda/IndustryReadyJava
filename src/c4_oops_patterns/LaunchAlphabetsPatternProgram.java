package c4_oops_patterns;

public class LaunchAlphabetsPatternProgram {
	
	public static void main(String[] args) {

		// Pattern Programming for - A B C D E F G H I J L O P S T U

		int n = 5;
		
		for(int i=0; i<n; i++) {
			
			// A
			for(int j=0; j<n; j++) {
				//System.out.print("*");
				if(i==0 || i == (n-1)/2 || j==0 || j==(n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			
			// B
			for(int j=0; j<n; j++) {
				//System.out.print("*");
				if(j==0 || (i == 0 && j<n-1) || ((i==(n-1)/2) && j<n-1) || ((i==(n-1) && j<n-1)) || ((i==(n-1)/4) && j==n-1) || ((i==3*(n-1)/4) && j==n-1)){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			

			// C
			for(int j=0; j<n; j++) {
				//System.out.print("*");
				if( ((j==0) && i>0 && i<n-1) || (i==0 && j>0) || (i==(n-1) && j>0) ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			
			// D
			for(int j=0; j<n; j++) {
				//System.out.print("*");
				if((i==0 && j<n-1) || j==0 || (i==n-1 && j<n-1) || (j==n-1 && i>0 && i<n-1) ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
	
			// E
			for(int j=0; j<n; j++) {
				//System.out.print("*");
				if(j==0 || i==0 || i==(n-1)/2|| i == (n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			
			// F
			for(int j=0; j<n; j++) {
				//System.out.print("*");
				if( j==0 || i==0 || (i==(n-1)/2 && j<n-1) ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			
		
			// G
			for(int j=0; j<n; j++) {
				//System.out.print("*");
				if( (i==0 && j>0) || (j==0 && i>0 && i<n-1) || (i==n-1 && j>0) || (j==n-1 && i>(n-1)/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			
			// H
			for(int j=0; j<n; j++) {
				//System.out.print("*");
				if(j==0 || j==(n-1)|| i == (n-1)/2 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			
			// I
			for(int j=0; j<n; j++) {
				//System.out.print("*");
				if(i==0 || i==n-1 || j==(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			
			// J
			for(int j=0; j<n; j++) {
				//System.out.print("*");
				if(i==0 || (i==(n-1) && j<((n-1)/2))  || j==(n-1)/2 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			
			// L
			for(int j=0; j<n; j++) {
				//System.out.print("*");
				if(j==0 || i==n-1 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
	
			// O
			for(int j=0; j<n; j++) {
				//System.out.print("*");
				if((i==0 && j>0 && j<n-1) || (i==n-1 && j>0 && j<n-1) || (j==0 && i>0 && i<n-1) || (j==n-1 && i>0 && i<n-1) ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			
			// P
			for(int j=0; j<n; j++) {
				//System.out.print("*");
				if(j==0 || (i==0 && j<(n-1)) || (i==(n-1)/2 && j<n-1) || (j==(n-1) && i<(n-1)/2) && i>0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			
			
			// S
			for(int j=0; j<n; j++) {
				//System.out.print("*");
				if((i==0 && j>0) || (i==(n-1)/2 && j>0) || (i==(n-1)) || (j==n-1 && i>(n-1)/2) || (j==0 && i<(n-1)/2) ){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			
			// T
			for(int j=0; j<n; j++) {
				//System.out.print("*");
				if(i==0 || j == (n-1)/2 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.print("    ");
			
			// U
			for(int j=0; j<n; j++) {
				//System.out.print("*");
				if((j==0 && i<n-1) || (j==n-1&& i<n-1) || (i == n-1 && j>0 && j<n-1)) {
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
