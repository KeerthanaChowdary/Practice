package Fibonacci;

import java.util.Scanner;

public class DP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(fib(n));
	}

	private static int fib(int n) {
		if (n > 1) {
			int fib[] = new int[n + 1];
			fib[0] = 0;
			fib[1] = 1;
			for (int i = 2; i <= n; i++) {
				fib[i] = fib[i - 2] + fib[i - 1];
			}
			return fib[n];
		} else
			return n;

	}
}
