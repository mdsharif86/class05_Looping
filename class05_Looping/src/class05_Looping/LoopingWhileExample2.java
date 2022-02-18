package class05_Looping;

public class LoopingWhileExample2 {

	public static void main(String[] args) {
		//divide and conquer
		//Required 1 2 4 5 
		for (int i=1; i <=5; i++) {
			if(i==3) 
				continue;
			System.out.println(i);
			}
		System.out.println("===============");
	for (int i=1; i<=5; i++) {
		if(i==3)
			break;
				System.out.println(i);
	}
	
	}//main

}//class
