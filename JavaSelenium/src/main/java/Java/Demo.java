package Java;

public class Demo {

	public static void main(String[] args) {
		reverse();
		reverseWord();
		armstrong();
	}
	
	public static void reverse() {
		String str="java program";//margorp avaj
		
		String rev="";
		for(int i=0;i<str.length();i++) {
		char charAt = str.charAt(i);//j
		
		rev=charAt+rev;
	}
		
		for(int i=str.length()-1;i>=0;i--) {
			char charAt = str.charAt(i);
			
			rev=rev+charAt;
		}
	}
	
	public static void reverseWord() {
		String str="we are running java program";//ew era gninnur...
		String[] split = str.split(" ");//{"we","are"...}
		
		String rev="";
		for(int i=0;i<split.length;i++) {
			rev=rev+" "+revrse(split[i]);
		}
		System.out.println(rev.trim());
	}
	
	public static String revrse(String str) {
		
		String rev="";//ew
		for(int i=0;i<str.length();i++) {
			rev=str.charAt(i)+rev;
		}
		
		return rev;
	}

	
	public static void armstrong() {      //153//370//371//407   
		int i=153;//15//1//0
		int j=i;//
		int k=i;
		int count=0;//3
		while(i>0) {
			i=i/10;
			count++;
		}
		
		int sum=0;//27
		while(j>0) {
			int res=j%10;//3
			int prod=1;
			for(int a=1;a<=count;a++) {
				prod=prod*res;
			}
			sum=sum+prod;
			j=j/10;
		}
		if(k==sum)
			System.out.println("armstrong");
		else
			System.out.println("not armstrong");
	}
}
