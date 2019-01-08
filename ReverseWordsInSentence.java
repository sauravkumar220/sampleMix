/**
 * 
 */
package tavant;

/**
 * @author Saurav Kumar
 *
 */
public class ReverseWordsInSentence {

	/**
	 * Input : I love u
	 * output : u love I
	 */
	public ReverseWordsInSentence() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 String  input ="live you do where"; //where do you live
	 //String buffer is mutable so string is not used due to space complexity
		StringBuffer sb= new StringBuffer(input);
reverseWords(sb);
	}

	private static void reverseWords(StringBuffer sb) {
		int start=0;
		int end =0;
		
		for (int i = 0; i < sb.length(); i++) {
			end =i;
			//once the end of the String will reach  space will not be there
			if(end==sb.length()-1) {
				reverseSubstring(sb,start, end);
			}
			
			if(sb.charAt(i)==' ') {
		    
		    reverseSubstring(sb,start, end-1);
		    start=end+1;
			}
		}
		
		reverseSubstring(sb, 0,sb.length()-1 );
		
		System.out.println(sb);
		
	}
//generic method to reverse word or String 
	private static void reverseSubstring(StringBuffer sb, int start, int end) {
		for (int i =start; i < end; i++) {
			char tmp = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(end));
			sb.setCharAt(end, tmp);
			end--;
		}
		
	}

	

}
