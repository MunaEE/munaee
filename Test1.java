package test2;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] scores = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
		int i = sc.nextInt();
		int j = sc.nextInt();
		sc.close();
		double sum = (scores[i - 1] + scores[j - 1]);

		System.out.printf("%.1f", sum);

	}
}
