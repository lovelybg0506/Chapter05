package part01.sec01.exam02;

public class Ex05_11 {

	public static void main(String[] args) {

		int i, k;

		for (i = 2; i <= 9; i++) {

			for (k = 1; k <= 9; k++) {

				System.out.printf("%d * %d = %d\t", i, k, i * k);
			}
			System.out.println();
		}

	}

}
