package saurabh.veritas.StringAlternate;

public class AlternateWayOfMerging {

	public static void main(String[] args) {
		String a = "saurabh";
		String b = "kumar";

		String result = a + b;
		String s = "";

		int z = 0;
		StringBuffer sb = new StringBuffer("saurabhkumar");//cannot use setChar() if sb is not having anything to alter
		int counter1 = 0;
		int counter2 = 1;
		for (int i = (a.length() - 1); i >= 0; i--) {

			sb.setCharAt(counter1, a.charAt(i));
			if (z < b.length()) {
				counter1 = counter1 + 2;
			} else {
				counter1++;
			}
			z++;
		}

		for (int i = (b.length() - 1); i >= 0; i--) {

			sb.setCharAt(counter2, b.charAt(i));
			counter2 = counter2 + 2;
		}
		System.out.println(sb);

	}

}
