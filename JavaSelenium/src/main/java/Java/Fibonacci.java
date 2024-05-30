package Java;

public class Fibonacci {
	public static void main(String[] args) {
		int i=0;
		int j=1;
		
		System.out.print(i+" "+j);
		
		while((i+j)<=200) {
			int k=i+j;
			
			System.out.print(" "+k);
			
			i=j;
			j=k;
		}
	}
}
