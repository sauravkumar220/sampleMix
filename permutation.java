package recursionPrograms;

public class permutation {
	static int count = 0;

	public static void main(String[] args) {
		permute("abcde");
	}

	private static void permute(String string) {
		permute(string, "");
		System.out.println(count);
	}

	private static void permute(String string1, String string2) {

		if (string1.length() == 0) {
			System.out.println("---"+string2);

		} else {
			for (int i = 0; i < string1.length(); i++) {
				
				String sec=string2 +string1.charAt(i);
				String rem = string1.substring(0, i) + string1.substring(i + 1);
				permute(rem, sec);
				
			}
		}

	}

}
