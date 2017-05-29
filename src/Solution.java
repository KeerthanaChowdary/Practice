import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = n;
		int n2 = 1;
		//String space = " ";
		while (n1 >= 0) {
			for (int i = n1 - 1; i >= 0; i--)
				System.out.print(" ");
			for (int j = 1; j <= n2; j++)
				System.out.print("#");
			System.out.println();
			n1--;
			n2++;
		}

	}
}