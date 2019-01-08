package ondataSstem;

public class PrintDupFrom2Array {

	public PrintDupFrom2Array() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[] a = {11,15,16,17,21,22};
		int[] b = {21,22,23,15,35,34,76};
		
for (int i = 0; i < b.length; i++) {
	for (int j = 0; j < a.length; j++) {
		if(a[i]==b[j]) {
			System.out.println(a[i]);
		}
	}
}
	}

}
