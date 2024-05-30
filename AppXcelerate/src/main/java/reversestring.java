
public class reversestring {

	public static void main(String[] args) {
		// armstrong();
		// fat();
		// fib();
		// reverseString();
		rev();
	}

	public static void reverseString() { // public Static void reverseString() {
		String str = "java Program";// margorp avaj //String str= "java program";
		String rev = ""; // String rev ="";
		for (int i = 0; i < str.length(); i++) { // for loop //fo(int i=0;i<str.length();i++
			char charAt = str.charAt(i);
			rev = charAt + rev;
		}
		System.out.println(rev);
	}

	// for(int i=str.length()-1;i>0;i--);

	public static void rev() {
		String str = "java Program";// avaj mazrgorp
		String[] split = str.split(" ");// {"java","program"}
		String rev = "";
		for (int i = 0; i < split.length; i++) {
			String word = split[i];// java

			rev = rev + " " + reverse(word);
		}

		System.out.println(rev.trim());
	}

	public static String reverse(String str) {
		String rev = "";
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			rev = charAt + rev;
		}
		return rev;
	}

	public static void armstrong() {
		int i = 153;
		int j = i;// 153//0
		int k = j;
		int count = 0;// 3
		while (i > 0) {
			i = i / 10;
			count++;
		}
		int sum = 0;
		while (j > 0) {
			int res = j % 10;// 3
			int prod = 1;
			for (int a = 1; a <= count; a++) {
				prod = prod * res;
			}
			sum = sum + prod;
			j = j / 10;
		}
		if (k == sum)
			System.out.println(k + " is armstrong");
		else
			System.out.println("not armstrong ");
	}

	public static void fat() {
		int i = 5;
		int prod = 1;
		for (int j = 1; j <= i; j++) {
			prod = prod * j;
		}
		System.out.println(prod);
	}

	public static void fib() {
		int a = 0;
		int b = 1;

		System.out.print(a + " " + b);

		while ((a + b) <= 200) {
			int c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
	}

	public static void armstrong1() {
		int i = 301;
		int j = i;
		int k = j;
		int Count = 0;
		while (i > 0) {
			i = i / 10;
			Count++;
		}
		int sum = 0;
		while (j > 0) {
			int res = j % 10;
			int prod = 1;
			for (int a = 1; a <= Count; a++)
				;
			prod = prod * j;
		}
		System.out.println(sum);

	}

	public static void reverseword() {
		String str = "java is a program";
		String[] split = str.split(" ");
		String rev = " ";
		for (int i = 0; i < split.length; i++) {
			String word = split[i];
			rev =rev +"  " + resverse(word); 
			
		}
	}
}
