package String.Manipulation;

public class FirstStringIsPermuationOfOther {
//if both String length is not same return false directly
//check case senstive or spaces is valid or not 

	public static void main(String[] args) {
		String first = "asdf";
		String second = "adsf";

		System.out.println(isPermuation(first, second));

	}

	private static boolean isPermuation(String first, String second) {
		int[] letter= new int[128];
		for (int i = 0; i < first.length(); i++) {
			//all the character will  increament its specific index by +1 
			letter[first.charAt(i)]++;
		}
		for (int i = 0; i < second.length(); i++) {
//if nothing is there at index value ,will be decrement by 1 and goes less than 0			
			letter[second.charAt(i)]--;
			if(letter[second.charAt(i)]<0) {
				return false;
				
			}
		
	}
		return true;

	}
	}
//Method 2
/*if Arrays method is allowed ,we can sort both 
the string by Arrays.sort()  and compares by equals method */