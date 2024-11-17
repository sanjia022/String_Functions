package StringFunctions;

public class String_function1 {

	public static void main(String[] args) {
		String a = "   My name is David  ";
		String b = "My name is David";
		System.out.println(a.trim());
		System.out.println(b.trim());
		
		String name  = "David";
		String name1 =" savid";
		System.out.println(name.equals(name1));
		System.out.println(name.concat(name1));
		System.out.println(name.equalsIgnoreCase(name1));//answer will false as there is a space in name1 variable
		
		char n1 = name.charAt(0);
		System.out.println(n1);
		char n2 = name.charAt(1);
		System.out.println(n2);
		char n3 = name.charAt(2);
		System.out.println(n3);
		char n4 = name.charAt(3);
		System.out.println(n4);
		char n5 = name.charAt(4);
		System.out.println(n5);
		
		for(int i=0;i<name.length(); i++) {
			char n0 = name.charAt(i);
			System.out.print(n0);
		}
		
		for(int i=name.length()-1; i>=0; i--) {
			char n0 = name.charAt(i);
			System.out.print(n0);
		}
		
	}

}
