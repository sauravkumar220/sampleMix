package ondataSstem;

public class PrintDistinctCharFrom2String {

	public PrintDistinctCharFrom2String() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String first="vikash";
		String second="saurabh";
		String third=first+second;
		//we can apply cond  if  main loop is upto first string lenght visit 2nd 
		//for loop only to search from second String and vise -versa
		for (int a=0; a <third.length() ; a++) {
			char x=' ';
			char y=' ';
			for (int i = 0; i < first.length(); i++) {
				if(third.charAt(a)==first.charAt(i)) {
                x=third.charAt(a);
                break;
				}
			}
			for (int j = 0; j < second.length(); j++) {
				if(third.charAt(a)==second.charAt(j)) {
                y=third.charAt(a);
                break;
				}
			}
			if(x!=y) {
				System.out.print(" "+third.charAt(a));
			}
		}
		
		
		

	}

}
