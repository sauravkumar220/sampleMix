package saurabh.ds.pogram.HashMapImplementation;

public class MyHashTester {

	public static void main(String[] args) {
		Hash<String,String> h = new Hash<String,String>(5);
		h.put("A", "Saurabh");
		System.out.println(h.getSize());
		h.put("B", "Vikash");
		h.put("C", "Vivek");
		h.put("D", "Khatri");
		
		h.put("E", "Saurabh");
		h.put("F", "Vikash");
		h.put("G", "Vivek");
		h.put("H", "Khatri");
		
		System.out.println(h.getSize());
		
		
	    h.remove("D","Khatri");//need to implement only based on key
		System.out.println(h.get("C"));
		System.out.println(h.get("D"));
	

	}

}
