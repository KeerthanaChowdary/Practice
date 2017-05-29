package Fibonacci;

import java.util.Scanner;

public class SpaceOptimized1 {

	private static int fib(int n) {
		if (n > 1) {
			int a, b, c = 0;
			a = 0;
			b = 1;
			for (int i = 2; i <= n; i++) {
				c = a + b;
				a = b;
				b = c;
			}
			return c;
		} else
			return n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(fib(n));
	}

}
