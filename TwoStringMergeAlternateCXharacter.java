package saurabh.veritas.StringAlternate;

public class TwoStringMergeAlternateCXharacter {

	public static void main(String[] args) {
		String a = "saurabh";
		String b = "kumar";

		StringBuffer s = new StringBuffer();
		for (int i = 0; i < (a.length()>b.length()?a.length():b.length()); i++) {
			if (a.length() > i)
				s.append(a.charAt((a.length() - 1) - i)) ;
			if (b.length() > i)
				s = s.append(b.charAt((b.length() - 1) - i));
		}
		System.out.println(s);
	}

}
