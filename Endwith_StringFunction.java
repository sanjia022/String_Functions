package StringFunctions;

public class Endwith_StringFunction {

	public static void main(String[] args) {
		String name = "David Smith";
		boolean n = name.endsWith("f");
		System.out.println(n);
		
		boolean n1 = name.endsWith("h");
		System.out.println(n1);
		
		String name2 ="Fayyaz Abrar";
		boolean f = name2.endsWith("df");
		System.out.println(f);
		String name5= name2.replace("Fayyaz", "Zaina");
		System.out.println(name5);
		String newold = name2.replaceAll(name2, name5);
		System.out.println(newold);
		
	}

}
