package class05_Looping;

public class TracingForLoop {

	public static void main(String[] args) {
	int a;
	int b;
	int r;
	a = 1;
	b =	2;
	r = 3;
	for (int i=1; i<=3; i ++) {
		a= r + 2;
		b = a +2;
		r = 3 + a + b;
		System.out.println(r);
		
	}//tracing
	}//main

}//class
