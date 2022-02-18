package class05_Looping;

public class LoppingExample02 {

	public static void main(String[] args) {
		//print 1 to 5 but not 3
		
		for(int i=1; i<=5; i++)
			if(i!=3)System.out.println(i);  //! not equal sign
		//Required 1 to 5 but not 3 and 4
		
		for(int i=1; i<=5; i++) {
			if(i!=3 && i!=4)System.out.println(i);
		}
		
		//required: print 5 to 1 backwards
		
		for(int i=5; i>=1; i--) {
			System.out.println(i);
		}
	}//main

}//class
