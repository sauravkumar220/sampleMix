package program.Xactly;

public class SumOfTwoNosInArr {

	public static void main(String[] args) {
		int sum = 8;
		int[] arr = { 3, 2, 5, 7, 1 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == 8) {
					System.out.println(arr[i] + " : " + arr[j]);
				}
			}
		}

	}

}
