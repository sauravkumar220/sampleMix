package ondataSstem;

public class SearchStringInAnother {

	public SearchStringInAnother() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Boolean  flag=false;
		String a="ft";//String to be searched
		String b="gftrdbjk";//Where to  search the String
		/*int counter=0;
		int matchcount=0;*/
		
		
		//Saurabh code
		for (int i = 0; i <= b.length()-a.length();i++) {
			int count=0;
			int runner=i;
			for (int j = 0; j < a.length(); j++) {
				if((a.charAt(j)==b.charAt(runner))) {
					count++;
					}
				runner++;
			}
			if(count==a.length()) {
				flag=true;
				break;
			}
		}
		//Vikash code
	/*	for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == b.charAt(counter)) {
				if (matchcount == b.length()-1) {
					flag = true;
					break;
				}
				++matchcount;
				++counter;
			}
		}*/
		
		System.out.println(flag);

	}

}
