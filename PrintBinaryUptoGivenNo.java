package ondataSstem;

import java.util.Scanner;

public class PrintBinaryUptoGivenNo {

	public PrintBinaryUptoGivenNo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		for (int i = 0; i <= 25; i++) {
			getBinary(i);
		}

	}

	private static void getBinary(int n) {
		int a;

		String x = "";
		while (n > 0) {
			a = n % 2;
			x = x + "" + a;
			n = n / 2;
		}
		System.out.println("Binary number:" + x);

	}

}
