package class5loopspatterns;

public class LaunchPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.print("    ");
			
			for(int j=0; j<n; j++) {
				if(i+j == n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			
			System.out.print("    ");
			for(int j=0; j<n; j++) {
				if(i==j && j<=(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.print("   ");
			
			for(int j=0; j<n; j++) {
				if(i+j==n-1 && i<=(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.print("     ");
			
			for(int j=0; j<n; j++) {
				if(i-j==(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.print("     ");
			
			for(int j=0; j<n; j++) {
				if(i+j==3 * (n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.print("     ");
			
			for(int j=0; j<n; j++) {
				if( (i+j == (n-1)/2 && i<=(n-1)/2) || (i-j == (n-1)/2) || (j-i == (n-1)/2) || i+j == 3* (n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.print("     ");
			
			for(int j=0; j<=i; j++) {
					System.out.print("*");

				
			}
			System.out.print("     ");
			
			
			for(int j=n; j>i; j--) {

				
					System.out.print("*");
				}

			
			System.out.print("     ");
			


			for(int j=0; j<n; j++) {
				//System.out.println("j, n, i " + j + ":" + n + ":" + i);
				if(j<(n-1)-i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				
			}
			System.out.print("     ");
			
			for(int j=0; j<=i; j++) {
					System.out.print("*");

				
			}
			
			System.out.print("     ");
			
			for(int j=0; j<n-i; j++) {
			
			if(j>(n-1)-i) {
				System.out.print(" ");
			}
			else {
				System.out.print("*");
			}
			
			
		}
		
			System.out.print("     ");
			
			
			for(int j=0; j<n; j++) {
				//System.out.println("j, n, i " + j + ":" + n + ":" + i);
				if(j<(n-1)-i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				
			}
			
			for(int j=0; j<=i; j++) {
					System.out.print("*");

				
			}
		
			
			System.out.println();
		}

	}

}
