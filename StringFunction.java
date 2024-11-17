package StringFunctions;

public class StringFunction {

	public static void main(String[] args) {
		String name = "     ldjlajldsaj    jdsjdj    " ;
		System.out.println(name.trim());
		
		String name1 = "sanjia";
		String name2 = "Sanjia";
		System.out.println(name1.equals(name));
		System.out.println(name1.equalsIgnoreCase(name2));
		
		System.out.println(name1.concat(name));
		
		String a1 = "ratul";
		String a2 = "";


	    for(int i=a1.length()-1; i>=0 ; i--) {
		char value = a1.charAt(i);
		a2 = a2 + value;
		
	}System.out.println(a2);
//	String n1 = "Selenium";
//	String n2 = "";
//	
//	for(int i= n1.length()-1; i>=0;i--) {
//		char word = n1.charAt(i);
//		n2 = n2 + word;
//		
//	}System.out.println(n2);
	
	//Palindom
	
	String n1 = "mom";
	String n2 = "";
	 for(int i=n1.length()-1; i>=0; i--) {
		 char n3 = n1.charAt(i);
		 n2 = n2 + n3;
		 
	 }
	 System.out.println(n2);
	 if (n1.equals(n2)) {
		System.out.println("it is a palingdrom"); 
	 }
	 else {
		 System.out.println("it is not");
	 }
	
	
	}
	
	
	

}
