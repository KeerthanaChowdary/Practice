import java.util.Scanner;

public class MinimumSteps {
	static int ans;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number: ");
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		System.out.println(numberOfSteps(n, 0));
	}

	public static long numberOfSteps(long n, int a) {
		ans = a;
		if (n == 1)
			return ans;
		else if (n <= 3) {
			return ans++;
		} else {
			if (n % 3 == 0) {
				n = n / 3;
				ans++;
				numberOfSteps(n, ans);

			} else if (n % 2 == 0) {
				n = n / 2;
				ans++;
				numberOfSteps(n, ans);
			} else {
				n = n - 1;
				ans++;
				numberOfSteps(n, ans);
			}

		}
		return ans;

	}
}
