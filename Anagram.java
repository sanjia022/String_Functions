package StringFunctions;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String n1 = "face";
		int a1 = n1.length();
		String n2 = "cafe";
		int a2 = n2.length();
		
		if(a1 != a2) {
			System.out.println("it is not anagram");
		}
		else {
			char[] n3 = n1.toCharArray();
			char[] n4 = n2.toCharArray();
		
		Arrays.sort(n3);
		Arrays.sort(n4);
		boolean b1 = Arrays.equals(n3, n4);
		System.out.println(b1);
		
		}
	}

}
