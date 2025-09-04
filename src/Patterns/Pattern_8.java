package Patterns;

public class Pattern_8 {
	public static void main(String[] args) {
		// Your code here
		pattern(5);
	}

	public static void pattern(int n) {
		for (int i = 1; i <= n; i++) {
//		space
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

//		star
			for (int k = 1; k <= (2 * i) - 1; k++) {
				System.out.print("*");
			}
//		space
			for (int l = 1; l <= n - i; l++) {
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		for (int i = 0; i < n; i++) {
//		space

			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

//		star
			for (int k = 0; k < 2 * n - (2 * i + 1); k++) {
				System.out.print("*");
			}
//		space
			for (int l = 0; l < i; l++) {
				System.out.print(" ");
			}
			System.out.print("\n");

		}
	}
}

