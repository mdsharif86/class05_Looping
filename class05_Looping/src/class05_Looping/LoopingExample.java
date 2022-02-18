package class05_Looping;

public class LoopingExample {

	public static void main(String[] args) {
	//Required: Print "New York 5 times
	//print Dallas six times
		/*
		for (int i=1; i<=5; i++)
			System.out.println("New York");
		*/
		for (int i=1; //loop variable declaration and initialization
				i<=6;  //loop condition
				i++)   //loop variable increment
			System.out.println("Dallas");
		/*
		//Requied: print this sequence 1 2 3 4 5 
		for(int=1; i<=5; i++)
			System.out.println("i");
		//Required: print 1 to 5 but not 3.
		*/
		for(int i=1; i<=5; i++) {
			if(i!=3)
				System.out.println(i);
		}
		
		
	}//main

}//class
