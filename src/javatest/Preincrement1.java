package javatest;

public class Preincrement1 {

	public static void main(String[] args) {
		int a=25;
		int b=++a + a++;	
		int c=b++;
		int d=c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a);
		System.out.println(a);
	}

}
