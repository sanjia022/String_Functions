package StringFunctions;

public class Matches_method {
	
	// Find out a given string start with r or not 

	public static void main(String[] args) {
		String a = "raiyan";
		System.out.println(a.matches("r(.*)"));
		System.out.println(a.matches("...."));
		System.out.println(a.matches("(.*)u"));
		System.out.println(a.matches("(.*)n(.*)"));
	System.out.println("String");	
	 String t1 = "teacher";
	 boolean t2 = t1.matches("(.*)a(.*)");
	 System.out.println(t2);
		String n = "Hello";
		String b = "World";
		System.out.println(n.concat(b));
		String str = "GroTechMinds";
		System.out.println(str.substring(4, 8));

	}

}
