/**
 * 
 */
package tavant;

import java.util.Stack;

/**
 * @author Saurav Kumar
 *
 */
public class CountOpenAndCloseBraces {

	/**
	 * Count open and closed pair of bracket
	 */
	public CountOpenAndCloseBraces() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		int count=0;
		String input = "{{}}";
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < input.length() ; i++) {
			if (input.charAt(i) == '}' || input.charAt(i) == '{') {
				if(!st.isEmpty() && st.peek()=='{' && input.charAt(i) == '}') {
					
						count++;
						st.pop();
			
				}else {
					st.push(input.charAt(i));
				}
				
			}
		}
		System.out.println(count);

	}

}
