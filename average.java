package StringFunctions;

public class average {

	public static void main(String[] args) {
		int sum = 0;
		int a[] = new int [2];
		a[0] = 89;
		a[1] = 84;
		
		for(int i = 0; i< a.length; i++) {
			sum = sum + a[i];
		}
		int avg = sum/4;
		System.out.println(avg);
		
		
		String name = "Fayyaz";
		boolean a1 = name.matches("(.*)n");
		System.out.println(a1);
		boolean a2 = name.matches("(.*)n(.*)");
		System.out.println(a2);
		
	}

}
