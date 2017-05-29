import java.util.Scanner;

public class S {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double T = Double.parseDouble(sc.nextLine());
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			double matrix[][][] = new double[N][N][N];
			int M = sc.nextInt();
			sc.nextLine();
			for (int j = 0; j < M; j++) {
				String[] line = sc.nextLine().split(" ");
				String operation = line[0];
				if (operation.equals("UPDATE")) {
					matrix[(Integer.parseInt(line[1]) - 1)][(Integer.parseInt(line[2]) - 1)][(Integer.parseInt(line[3]) - 1)] = Double.parseDouble(line[4]);
				} else {
					double sum = 0.0;
					int x1, x2, y1, y2, z1, z2;
					x1 = Integer.parseInt(line[1]) - 1;
					y1 = Integer.parseInt(line[2]) - 1;
					z1 = Integer.parseInt(line[3]) - 1;
					x2 = Integer.parseInt(line[4]) - 1;
					y2 = Integer.parseInt(line[5]) - 1;
					z2 = Integer.parseInt(line[6]) - 1;
					for (int p = x1; p <= x2; p++) {
						for (int q = y1; q <= y2; q++) {
							for (int r = z1; r <= z2; r++) {
								sum = sum + matrix[p][q][r];
							}
						}
					}
					System.out.println((int) sum);
				}
			}
		}
		sc.close();
	}
}