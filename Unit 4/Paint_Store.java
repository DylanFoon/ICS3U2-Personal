import java.util.Scanner;
import java.lang.Math;

public class Paint_Store {
	static boolean op1 = false;
	static boolean op2 = false;
	static boolean op3 = false;
	static boolean op4 = false;
	static boolean op5 = false;
	static boolean op6 = false;
	static int factorial = 1;
	static String oneSpace = " ";
	static String bu1 = "----------";
	static String bu2 = "|        |";
	static String bu3 = "| Paint  |";
	static String bu4 = "\\_______//";
	static String bucket = "----------\n"+
			"|        |\n"+
			"| Paint  |\n"+
			"\\_______//\n" ;
	
	static String nothing = "           ";
	public static void main(String[] args) {
		int r,c;
		int layers;
		int layers2;
		int layers3;
		int fact;
		int length;
		int column;

		Scanner scanner = new Scanner(System.in);

		welcome();
		if (op1) {
			System.out.print("How many rows? ");
			r = scanner.nextInt();
			System.out.print("How many Columns");
			c = scanner.nextInt();
			cans(r,c);
			System.out.println();
		}
		if (op2) {
			System.out.print("How many layers?");
			layers = scanner.nextInt();
			System.out.println("You will need " + (layers*layers) + " cans of paint.");
			pyramid(layers);
			System.out.println();
		}
		if (op3) {
			System.out.print("How many layers?");
			layers2 = scanner.nextInt();
			System.out.println("You will need "+ (layers2*layers2) + " cans of paint.");
			udpyramid(layers2,false);
			System.out.println();
		}
		if (op4) {
			System.out.print("How many layers? ");
			layers3 = scanner.nextInt();
			pyramid((layers3/2)+1);
			udpyramid((layers3/2),true);
			
		}
		if (op5) {
			System.out.println("What number of cans would you like to check for? ");
			fact = scanner.nextInt();
			factorial(fact);
			System.out.println("This can be arranged in " + factorial + " different ways!");
		}
		if (op6) {
			System.out.print("How many rows do you want your X to be? ");
			length = scanner.nextInt();
			System.out.println("");
			myX(length);
			}
	} //End Main

	//Welcome
	public static void welcome() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("  Welcome to Cans of paint!");
		System.out.println("1) Rectangle paint Can display");
		System.out.println("2) Pyramid display");
		System.out.println("3) Upside-down pyramid display");
		System.out.println("4) Diamond display (odd number of rows only)");
		System.out.println("5) Signature row arrangement ways");
		System.out.println("6) Custom X Formation");
		System.out.print("Enter your choice: ");
		int choice = scanner.nextInt();
		if (choice < 1 ^ choice > 6) {
			System.out.println("See you!");
		}
		if (choice == 1) {
			op1 = true;
		}
		if (choice == 2) {
			op2 = true;
		}
		if (choice == 3) {
			op3 = true;
		}
		if (choice == 4) {
			op4 = true;
		}
		if (choice == 5) {
			op5 = true;
		}
		if (choice == 6) {
			op6 = true;
		}

	} // End Welcome

	public static void pyramid(int layers) {
		Scanner scanner = new Scanner(System.in);
		int largestValue = (layers*2)-1;

		for(int i=1;i<=layers;i++)
		{
			int currentValue = (i*2)-1;
			int emptySpace = (largestValue-currentValue)/2;
			System.out.println();
			for(int a=1; a<=largestValue; a++) {
				if (a<=emptySpace || a>largestValue-emptySpace) {
					System.out.print(nothing);
				}else {
					System.out.print(bu1+" ");
				}
			}
				System.out.println();
			for(int b=1; b<=largestValue; b++) {
				if (b<=emptySpace || b>largestValue-emptySpace) {
					System.out.print(nothing);
				}else {
					System.out.print(bu2+" ");
				}
			}
			System.out.println();
			for(int c=1; c<=largestValue; c++) {
				if (c<=emptySpace || c>largestValue-emptySpace) {
					System.out.print(nothing);
				}else {
					System.out.print(bu3+" ");
				}
			}
			System.out.println();
			for(int d=1; d<=largestValue; d++) {
	        		if (d<=emptySpace || d>largestValue-emptySpace) {
	        			System.out.print(nothing);
	        		}else {
	        			System.out.print(bu4+" ");
	        		}
					
			}
		    System.out.println();
		}	
	}// End Pyramid
		




	public static void udpyramid(int layers2,boolean option4) {
		Scanner scanner = new Scanner(System.in);
		int largestValue = (layers2*2)-1;

		for(int i=layers2;i>=0;i--)
		{
			int currentValue = (i*2)-1;
			int emptySpace = (largestValue-currentValue)/2;
			System.out.println(nothing);
			if (option4) {
				System.out.print(nothing);
			}
			for(int a=1; a<=largestValue; a++) {
				if (a<=emptySpace || a>largestValue-emptySpace) {
					System.out.print(nothing);
				}else {
					System.out.print(bu1+" ");
				}
			}
				System.out.println();
				if (option4) {
					System.out.print(nothing);
				}

			for(int b=1; b<=largestValue; b++) {
				if (b<=emptySpace || b>largestValue-emptySpace) {
					System.out.print(nothing);
				}else {
					System.out.print(bu2+" ");
				}
			}
			System.out.println();
			if (option4) {
				System.out.print(nothing);
			}

			for(int c=1; c<=largestValue; c++) {
				if (c<=emptySpace || c>largestValue-emptySpace) {
					System.out.print(nothing);
				}else {
					System.out.print(bu3+" ");
				}
			}
			System.out.println();
			if (option4) {
				System.out.print(nothing);
			}

			for(int d=1; d<=largestValue; d++) {
	        		if (d<=emptySpace || d>largestValue-emptySpace) {
	        			System.out.print(nothing);
	        		}else {
	        			System.out.print(bu4+" ");
	        		}
					
			}
		    System.out.println();
		    
		}	
		}// End udpyramid



	public static void cans(int rows, int columns) {
		for (int i = 0; i < rows; i++) {
			for (int a = 0; a < columns; a++) {
				System.out.print(bu1+ " ");
			}
			System.out.println("");
			for (int b = 0; b < columns; b++) {
				System.out.print(bu2+ " ");
			}
			System.out.println("");
			for (int c = 0; c < columns; c++) {
				System.out.print(bu3+ " ");
			}
			System.out.println("");
			for (int d = 0; d < columns; d++) {
				System.out.print(bu4+ " ");
			}
			System.out.println("");
		}
	} // End cans
	
public static void factorial(int num) {
	for (int i = 1;i <= num; i++) {
		factorial = factorial*i;
	}
}
public static void myX(int len) {
	int k = (len*2)-1;
	for (int i = 1; i < len+1 ; i++) {
		for (int j = 1; j < len+1; j++) {
			if(j==i||j+i == len+1) {
				System.out.print("X");

			} else {
				
				System.out.print(" ");
			}
			}
			
		System.out.println();
		}
	}//End myX
}//End Class


