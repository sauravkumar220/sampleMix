package ondataSstem;

public class TableOfFiveUsingRecursion {
static int j=0;
	public TableOfFiveUsingRecursion() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		s(5);

	}

	private static void s(int i) {
		while(j<=10) {
			System.out.println(i*j);
			j++;
			s(5);
		}
		
	}

}
