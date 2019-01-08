package ds;

public class SelectionSort {
//in place and big 0(n^2)
	public static void main(String[] args) {
		int[] arr = {10,7,8,4,9,2};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[i]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					System.out.println("swappped");
				}
			}
		}
		//index can be used  to short this and make faster 
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
