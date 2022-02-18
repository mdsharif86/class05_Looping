package class05_Looping;

public class LoopingrRevisedSequence {

	public static void main(String[] args) {
		//1 1 2 3 5 8 13 21 34 55 89 = 1 1 2 3
		int n1=1, n2=1, count=10,sum;
			System.out.println(" "+n1 + "\n " + n2);
		
		
		for (int i=0; i<count; i++) {
			sum=n1+n2;//sum=1+1=2//sum=1+2=3//summ=2+3
			System.out.println(" "+ sum);//2//3//5
			n1= n2;//n1=1//n1=2//n1=3
			n2=sum;//n2=2//n2=3//n2=5
	    }
		
	
	
	}//main

}//class
