package class05_Looping;

public class Looping {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("print five time");
		}

//		int i = 1;
//		while (i <= 5) {
//			System.out.println("print five time");
//			i++;
//		}
//		int a = 1;
//		do{
//			System.out.println("print");
//			a++;
//		}while(a<=5);
//			
		//1+3+5+7+9=25
//		int sum=0;
//		for(int i=1; i<=9; i+=2) {
//			sum=sum+i;
//			if(i !=9) {
//				System.out.print(i + "+");
//			}
//			else 
//				System.out.print(i);
//		}
//			
//			System.out.print(" ="+sum);
////			int age=34;
//			age=34;
			for (int i = 1; i <= 10; i++) {
				if(i==4) {
					continue;
				}
				System.out.println(i);
			}
			
			for (int i = 1; i <= 10; i++) {
				if(i==4) {
					break;
				}
				System.out.println(i);
			}
	}//main

}//class
