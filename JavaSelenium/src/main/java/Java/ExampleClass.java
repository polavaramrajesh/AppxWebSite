package Java;

public class ExampleClass {

	
	 /* public static void main(String[]args) {
	 
	  String str ="dhanunjay"; 
	  String rev =" "; 
	  int len = str.length(); 
	  for(int i=len-1;i>=0;i--) {
	  
	  rev = rev+str.charAt(i); }
	  
	  System.out.println("reversed string is:"+rev);
	  
	 }*/
	 

	/*
	 * public static void main(String[]args) { String str = "dhanunjaya"; String rev
	 * =" "; char a[] = str.toCharArray(); int len = a.length; for
	 * (inti=len-1;i>=0;i--) { rev=rev+a[i]; }
	 * System.out.println("reversed string is:"+rev); }
	 */

	/*
	 * public static void main(String[] args) { String str = "dhanunjay"; String rev
	 * = ""; for (int i =0;i<str.length();i++) { rev = str.charAt(i)+rev;' } if
	 * (rev.equals(str)) { System.out.println("entered string is a polindrome ");
	 * }else { System.out.println("entered string is not a polindrome "); } }
	 */

	/*
	 * public static void main(String[] args) { int i=153;//0 int j=i;//153//0 int
	 * l=j; int count=0;//3 while(i>0) { i=i/10; count++; }
	 * 
	 * int sum=0;//27//125//1//153 while(j>0) { int k=j%10;//5 int prod=1;// for(int
	 * a=1;a<=count;a++) { prod=prod*k; }
	 * 
	 * sum=sum+prod; j=j/10; }
	 * 
	 * if(sum==l) { System.out.println("armstrong"); }else {
	 * System.out.println("not armstrong"); } }
	 */

	
	 
	 
	public static void main(String[] args) { 
		int i=5 ; 
		int prod=1; 
		for(int j=1;j<=i;j++) 
		{ 
			prod=prod*j;
			} 
		System.out.println(prod); }
		}

	
//   public static void main(String[]args) {
//	   String str="wow" ;
//	   String rev="";
//	   for(int i=0;i<str.length();i++) {
//		   char charAt = str.charAt(i);
//		   rev=charAt+rev;
//	   }
////	   System.out.println("reversed string is :"+rev);
////   }
//	   if(rev.equals(str)) {
//	   System.out.println("given string is a polindrome :"+rev);
//   }else {
//	   System.out.println("given string is not a polindrome :"+rev);
//	   
//	   
//   }}
//	
//	public static void main(String[]args) {
//		String str="jaffer got a job in automation with 60 lpa salary";
//		String[] split = str.split(" ");
//		String rev =" ";
//		for (int i=0;i<split.length;i++) {
//			rev=rev+" "+reverse(split[i]);
//		}
//		System.out.println(rev.trim());
//	}
//	public static String reverse(String str) {
//		String rev="";
//		for(int i=0;i<str.length();i++) {
//			rev=str.charAt(i)+rev;
//			
//		}
//		return rev;
//	}
//     public static void main(String[]args) {
//		int i=9;
//		int j=i;
//		int k=i;
//		int count =0;
//		while (i>0) {
//			i=i/10;
//			count++;
//		}
//		int sum=0;
//		while(j>0) {
//			int res=j%10;
//			int prod=1;
//			for(int a=1;a<=count;a++) {
//				prod=prod*res;
//			}
//			sum=sum+prod;
//			j=j/10;
//	}
//    	if(k==sum)
//			System.out.println("armstrong");
//		else
//			System.out.println("not armstrong");
//	}
//	
//}




