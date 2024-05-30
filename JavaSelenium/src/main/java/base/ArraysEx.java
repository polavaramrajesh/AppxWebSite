package base;

import java.util.Arrays;

public class ArraysEx {
//	public static void main(String[] args) {
//		int [] a= {5,23,65,77,91,26};
//		
//		for(int i=0;i<a.length-1;i++) {
//			for(int j=1;j<a.length-i;j++) {
//				if(a[j-1]>a[j]) {
//					int temp=a[j-1];
//					a[j-1]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
//		
////    	Arrays.sort(a);
////		
////		System.out.println(Arrays.toString(a));
////		
////		for(int b:a) {
////			System.out.println(b);
////		}
//		
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
//	}
//}
//	public static void main(String[] args) {
//		int start=10;
//		int end=1000;
//		
//		int a=0;
//		int b=1;
//		
//		while((a+b)<=end) {
//			int c=a+b;
//			if(c>=start) {
//				System.out.print(c+" ");
//			}
//			a=b;
//			b=c;
//		}
//	}}
//	public static void main(String[] args) {
//		for (int i = 1; i <= 1000; i++) {
//			if (armstrong(i)) 
//				System.out.println(i);
//		}
//	}
//
//	public static boolean armstrong(int i) {
//		int j=i;
//		int k=j;
//		int count=0;
//		while(i>0) {
//			i=i/10;
//			count++;
//		}
//		int sum=0;
//		while(j>0) {
//			int last=j%10;
//			int prod=1;
//			for(int a=1;a<=count;a++) {
//				prod=prod*last;
//			}
//			sum=sum+prod;
//			j=j/10;
//		}
//		
//		if(k==sum)
//			return true;
//		else
//			return false;
//	}}
	
//	public static void main(String[]args) {
//		int i=9;
//		int j=i*i;
//		int sum=0;
//		while(j>0) {
//			 int k=j%10;
//			 sum=sum+k;
//			 j=j/10;
//		}
//		if(sum==i)
//			System.out.println("given number is a strong");
//		else
//			System.out.println("given number is not a neon number");
//		
//		
//	}
	
	
	public static void number(String one,String two) {
		char [] s1= one.toCharArray();
		char [] s2= two.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		int s=0;
		if(s1.length == s2.length) {
			for(int i=0;i<s1.length;i++) {
				if(s1[i]==s2[i]) {
					s++;
				}
			
		}
			if(s1.length==s) {
				System.out.println(true);
				
			}else {
				System.out.println(false);
			}
	}}
	
	public static void main(String[]args) {
		String one="bal";
		String two ="lab";
		number(one, two);
		
	}
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	