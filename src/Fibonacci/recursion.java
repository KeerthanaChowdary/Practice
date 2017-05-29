package Fibonacci;

import java.util.Scanner;

public class recursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(fib(n));
	}

	private static int fib(int n) {
		// TODO Auto-generated method stub
		if (n <= 1)
			return n;
		else
			return fib(n - 1) + fib(n - 2);
	}

}
