package StringFunctions;

public class Contain_String_Method {

	public static void main(String[] args) {
		String a = "David Smith";
		boolean answer = a.contains("Smith");
		
		if(answer == true) {
			System.out.println("The word contain Smith ");
		}
		else{System.out.println("The word does not contain Smith");
		}
		
		String name = "Fayyaz Abrar";
		boolean a1 = name.contains("zaina");
		System.out.println(a1);
		
		if(a1==true) {
			System.out.println("present");
		}
		else {
			System.out.println("not present");
		}
	}
	

}
