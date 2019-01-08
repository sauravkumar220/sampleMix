package String.Manipulation;

public class StringHasUniqueCharacterOrNot {

	public static void main(String[] args) {
		String input="a*bc%d";
		System.out.println(isUnique(input));
		
		
		//if String is more 
		//than 128 char directly return False as some character must be repeating

	}
//cannot take Wrapper Boolean array other wise will throw null pointer exception
	private static Boolean isUnique(String input) {
		boolean[] letters =new boolean[128];
		for (int i = 0; i < input.length(); i++) {
			if(letters[input.charAt(i)]) {
				return false;
			}else {
				letters[input.charAt(i)]=true;
			}
			}
		return true;
		
	}

}
