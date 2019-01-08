package ondataSstem;

import java.util.ArrayList;
import java.util.TreeSet;

public class FindUniquePair {

	public FindUniquePair() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String[] str = {"A,B","B,A","B,A","C,D","D,C","F,K","Z,X"};
		TreeSet<String>  result= new TreeSet<String>();
		boolean flag=true;

			
			for (int j = 0; j < str.length; j++) {
				String[] a=str[j].split(",");

				flag=result.add(str[j]);
				flag=result.add(a[1]+","+a[0]);
				if(!flag) {
					str[j]=null;
				}
		

	}
		
			for(String s:str) {
				if(null!=s) {
					System.out.println(s);
				}
			}

}
	}
