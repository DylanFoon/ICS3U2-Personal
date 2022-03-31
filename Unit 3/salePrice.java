import java.util.Scanner;
import java.lang.String;
public class salePrice {


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Variable Declaration
		String item1 = "";
		String item1Val;
		String item2 = "";
		String item2Val;
		String item3 = "";
		String item3Val;
		double val1=0;
		double val2=0;
		double val3=0;
		boolean dis1 = false;
		boolean dis2 = false;
		boolean nodis = false;
		boolean sort1 = false;
		boolean sort2 = false;
		boolean sort3 = false;
		boolean sort4 = false;
		boolean sort5 = false;
		boolean sort6 = false;
		boolean sort7 = false;
		boolean nosort = false;
		welcome();
		
		//Inputs
		System.out.print("What is your first Item?: ");
		item1 = scanner.nextLine();
		System.out.print("How much does it cost?: ");
		item1Val = scanner.nextLine();
		System.out.print("What is your second Item?: ");
		item2 = scanner.nextLine();
		System.out.print("How much does it cost?: ");
		item2Val = scanner.nextLine();
		System.out.print("What is your third Item?: ");
		item3 = scanner.nextLine();
		System.out.print("How much does it cost?: ");
		item3Val = scanner.nextLine();
		val1 = Integer.parseInt(item1Val);
		val2 = Integer.parseInt(item2Val);
		val3 = Integer.parseInt(item3Val);
		double sum = (val1 + val2 + val3);
		System.out.println("");
		// Discount Declare
		if(val1 > 50 || val1 > 50 || val1 > 50 || sum >= 75) {
			dis1 = true;
			System.out.println("Your discount today is 30% off!");
		}
		else if(val1 > 20 || val2 >20 || val3 > 20 || ((sum > 30) && (sum<75))) {
			dis2 = true;
			System.out.println("Your discount today is 20% off!");
		}else {
			System.out.println("no discount :(");
			nodis = true;
		}
		//sorting values
		if(val1 <= val2 && val2 <= val3) {
			sort1 = true;
		}
		else if(val2 <= val1 && val1 < val3) {
			sort2 = true;
		}
		else if(val3 <= val2 && val2 < val1) {
			sort3 = true;
		}
		else if(val1 <= val3 && val3 < val2) {
			sort4 = true;
		}
		else if(val3 <= val1 && val1 < val2) {
			sort5 = true;
		}

		else if(val2 < val3 && val3 < val1) {
			sort6 = true;
		} 
		else if(val3 < val2 && val2 == val1) {
			sort7 = true;

		}
		else {
			nosort = true;
		}
		//discounts
		float dis1A = (float) (val1*0.3);
		float dis1B = (float) (val2*0.3);
		float dis1C = (float) (val3*0.3);
		float dis2A = (float) (val1*0.2);
		float dis2B = (float) (val2*0.2);
		float dis2C = (float) (val3*0.2);
		//Table of Values
		System.out.println("");
		System.out.println("");
		System.out.printf("\n%-15s%-10s%-15s%-10s%n","Item","Cost","Discount","Final Price");
		System.out.println("===================================================");
		//no sort = true
		if(dis1 && nosort) {
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item1,"$",val1,"$",(dis1A),"$",(val1-(dis1A)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item2,"$",val2,"$",(dis1B),"$",(val2-(dis1B)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item3,"$",val3,"$",(dis1B),"$",(val3-(dis1C)));
			System.out.println("");
			System.out.printf("%-40s%-1s%-9.2f","Total Price","$",((val1-(dis1A))+(val2-(dis1B))+(val3-(dis1C))));
			System.out.println("");
			System.out.println("");
			System.out.println("Thank you for your purchase!");
		}
		else if(dis2 && nosort) {
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item1,"$",val1,"$",(dis2A),"$",(val1-(dis2A)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item2,"$",val2,"$",(dis2B),"$",(val2-(dis2B)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item3,"$",val3,"$",(dis2B),"$",(val3-(dis2C)));
			System.out.println("");
			System.out.printf("%-40s%-1s%-9.2f","Total Price","$",((val1-(dis2A))+(val2-(dis2B))+(val3-(dis2C))));
			System.out.println("");
			System.out.println("");
			System.out.println("Thank you for your purchase!");
		}
		else if(nodis && nosort) {
			System.out.printf("%-15s%-1s%-9.2f%-15.6s%-1s%-9.2f",item1,"$",val1,"$0.00","$",val1);
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-15.6s%-1s%-9.2f",item2,"$",val2,"$0.00","$",val2);
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-15.6s%-1s%-9.2f",item3,"$",val3,"$0.00","$",val3);
			System.out.println("");
			System.out.printf("%-40s%-1s%-9.2f","Total Price","$",(sum));
			System.out.println("");
			System.out.println("");
			System.out.println("Thank you for your purchase!");
		}
		//sort1 = true
		if(dis1 && sort1) {
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item1,"$",val1,"$",(dis1A),"$",(val1-(dis1A)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item2,"$",val2,"$",(dis1B),"$",(val2-(dis1B)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item3,"$",val3,"$",(dis1C),"$",(val3-(dis1C)));
			System.out.println();
			System.out.printf("%-40s%-1s%-9.2f","Total Price","$",((val1-(dis1A))+(val2-(dis1B))+(val3-(dis1C))));
			System.out.println("");
			System.out.println("");
			System.out.println("Thank you for your purchase!");
		}
		else if(dis2 && sort1) {
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15s.2%-1s%-9.2f",item1,"$",val1,"$",(dis2A),"$",(val1-(dis2A)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item2,"$",val2,"$",(dis2B),"$",(val2-(dis2B)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item3,"$",val3,"$",(dis2C),"$",(val3-(dis2C)));
			System.out.println("");
			System.out.printf("%-40s%-1s%-9.2f","Total Price","$",((val1-(dis2A))+(val2-(dis2B))+(val3-(dis2C))));
			System.out.println("");
			System.out.println("");
			System.out.println("Thank you for your purchase!");
		}
		else if(nodis && sort1) {
			System.out.printf("%-15s%-1s%-9.2f%-15.6s%-1s%-9.2f",item1,"$",val1,"$0.00","$",val1);
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-15.6s%-1s%-9.2f",item2,"$",val2,"$0.00","$",val2);
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-15.6s%-1s%-9.2f",item3,"$",val3,"$0.00","$",val3);
			System.out.println("");
			System.out.printf("%-40s%-1s%-9.2f","Total Price","$",(sum));
			System.out.println("");
			System.out.println("");
			System.out.println("Thank you for your purchase!");
		}
		//sort2 = true
		if(dis1 && sort2) {
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item2,"$",val2,"$",(dis1B),"$",(val2-(dis1B)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item1,"$",val1,"$",(dis1A),"$",(val1-(dis1A)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item3,"$",val3,"$",(dis1C),"$",(val3-(dis1C)));
			System.out.println("");
			System.out.printf("%-40s%-1s%-9.2f","Total Price","$",((val1-(dis1A))+(val2-(dis1B))+(val3-(dis1C))));
			System.out.println("");
			System.out.println("");
			System.out.println("Thank you for your purchase!");
		}
		else if(dis2 && sort2) {
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item2,"$",val2,"$",(dis2B),"$",(val2-(dis2B)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item1,"$",val1,"$",(dis2A),"$",(val1-(dis2A)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item3,"$",val3,"$",(dis2C),"$",(val3-(dis2C)));
			System.out.println("");
			System.out.printf("%-40s%-1s%-9.2f","Total Price","$",((val1-(dis2A))+(val2-(dis2B))+(val3-(dis2C))));
			System.out.println("");
			System.out.println("");
			System.out.println("Thank you for your purchase!");
		}
		else if(nodis && sort2) {
			System.out.printf("%-15s%-1s%-9.2f%-15.6s%-1s%-9.2f",item2,"$",val2,"$0.00","$",val2);
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-15.6s%-1s%-9.2f",item1,"$",val1,"$0.00","$",val1);
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-15.6s%-1s%-9.2f",item3,"$",val3,"$0.00","$",val3);
			System.out.println("");
			System.out.printf("%-40s%-1s%-9.2f","Total Price","$",(sum));
			System.out.println("");
			System.out.println("");
			System.out.println("Thank you for your purchase!");
		}
		//sort3 = true
		if(dis1 && sort3) {
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item3,"$",val3,"$",(dis1C),"$",(val3-(dis1C)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item2,"$",val2,"$",(dis1B),"$",(val2-(dis1B)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item1,"$",val1,"$",(dis1A),"$",(val1-(dis1A)));
			System.out.println("");
			System.out.printf("%-40s%-1s%-9.2f","Total Price","$",((val1-(dis1A))+(val2-(dis1B))+(val3-(dis1C))));
			System.out.println("");
			System.out.println("");
			System.out.println("Thank you for your purchase!");
		}
		else if(dis2 && sort3) {
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item3,"$",val3,"$",(dis2C),"$",(val3-(dis2C)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item2,"$",val2,"$",(dis2B),"$",(val2-(dis2B)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item1,"$",val1,"$",(dis2A),"$",(val1-(dis2A)));
			System.out.println("");
			System.out.printf("%-40s%-1s%-9.2f","Total Price","$",((val1-(dis2A))+(val2-(dis2B))+(val3-(dis2C))));
			System.out.println("");
			System.out.println("");
			System.out.println("Thank you for your purchase!");
		}
		else if(nodis && sort3) {
			System.out.printf("%-15s%-1s%-9.2f%-15.6s%-1s%-9.2f",item3,"$",val3,"$0.00","$",val3);
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-15.6s%-1s%-9.2f",item2,"$",val2,"$0.00","$",val2);
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-15.6s%-1s%-9.2f",item1,"$",val1,"$0.00","$",val1);
			System.out.println("");
			System.out.printf("%-40s%-1s%-9.2f","Total Price","$",(sum));
			System.out.println("");
			System.out.println("");
			System.out.println("Thank you for your purchase!");
		}
		//sort4 = true
		if(dis1 && sort4) {
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15s.2%-1s%-9.2f",item1,"$",val1,"$",(dis1A),"$",(val1-(dis1A)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item3,"$",val3,"$",(dis1C),"$",(val3-(dis1C)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item2,"$",val2,"$",(dis1B),"$",(val2-(dis1B)));
			System.out.println("");
			System.out.printf("%-40s%-1s%-9.2f","Total Price","$",((val1-(dis1A))+(val2-(dis1B))+(val3-(dis1C))));
			System.out.println("");
			System.out.println("");
			System.out.println("Thank you for your purchase!");
		}
		else if(dis2 && sort4) {
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item1,"$",val1,"$",(dis2A),"$",(val1-(dis2A)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item3,"$",val3,"$",(dis2C),"$",(val3-(dis2C)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item2,"$",val2,"$",(dis2B),"$",(val2-(dis2B)));
			System.out.println("");
			System.out.printf("%-40s%-1s%-9.2f","Total Price","$",((val1-(dis2A))+(val2-(dis2B))+(val3-(dis2C))));
			System.out.println("");
			System.out.println("");
			System.out.println("Thank you for your purchase!");
		}
		else if(nodis && sort4) {
			System.out.printf("%-15s%-1s%-9.2f%-15.6s%-1s%-9.2f",item1,"$",val1,"$0.00","$",val1);
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-15.6s%-1s%-9.2f",item3,"$",val3,"$0.00","$",val3);
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-15.6s%-1s%-9.2f",item2,"$",val2,"$0.00","$",val2);
			System.out.println("");
			System.out.printf("%-40s%-1s%-9.2f","Total Price","$",(sum));
			System.out.println("");
			System.out.println("");
			System.out.println("Thank you for your purchase!");
		}
		//sort5 = true
		if(dis1 && sort5) {
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item3,"$",val3,"$",(dis1C),"$",(val3-(dis1C)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item1,"$",val1,"$",(dis1A),"$",(val1-(dis1A)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item2,"$",val2,"$",(dis1B),"$",(val2-(dis1B)));
			System.out.println("");
			System.out.printf("%-40s%-1s%-9.2f","Total Price","$",((val1-(dis1A))+(val2-(dis1B))+(val3-(dis1C))));
			System.out.println("");
			System.out.println("");
			System.out.println("Thank you for your purchase!");
		}
		else if(dis2 && sort5) {
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item3,"$",val3,"$",(dis2C),"$",(val3-(dis2C)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item1,"$",val1,"$",(dis2A),"$",(val1-(dis2A)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item2,"$",val2,"$",(dis2B),"$",(val2-(dis2B)));
			System.out.println("");
			System.out.printf("%-42s%-1s%-9.2f","Total Price","$",((val1-(dis2A))+(val2-(dis2B))+(val3-(dis2C))));
			System.out.println("");
			System.out.println("");
			System.out.println("Thank you for your purchase!");
		}
		else if(nodis && sort5) {
			System.out.printf("%-15s%-1s%-9.2f%-15.6s%-1s%-9.2f",item3,"$",val3,"$0.00","$",val3);
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-15.6s%-1s%-9.2f",item1,"$",val1,"$0.00","$",val1);
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-15.6s%-1s%-9.2f",item2,"$",val2,"$0.00","$",val2);
			System.out.println("");
			System.out.printf("%-40s%-1s%-9.2f","Total Price","$",(sum));
			System.out.println("");
			System.out.println("");
			System.out.println("Thank you for your purchase!");
		}
		//sort6 = true
		if(dis1 && sort6) {
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item2,"$",val2,"$",(dis1B),"$",(val2-(dis1B)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item3,"$",val3,"$",(dis1C),"$",(val3-(dis1C)));
			System.out.println();
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item1,"$",val1,"$",(dis1A),"$",(val1-(dis1A)));
			System.out.println("");
			System.out.printf("%-40s%-1s%-9.2f","Total Price","$",((val1-(dis1A))+(val2-(dis1B))+(val3-(dis1C))));
			System.out.println("");
			System.out.println("");
			System.out.println("Thank you for your purchase!");
		}
		else if(dis2 && sort6) {
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item2,"$",val2,"$",(dis2B),"$",(val2-(dis2B)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item3,"$",val3,"$",(dis2C),"$",(val3-(dis2C)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item1,"$",val1,"$",(dis2A),"$",(val1-(dis2A)));
			System.out.println("");
			System.out.printf("%-40s%-1s%-9.2f","Total Price","$",((val1-(dis2A))+(val2-(dis2B))+(val3-(dis2C))));
			System.out.println("");
			System.out.println("");
			System.out.println("Thank you for your purchase!");
		}
		else if(nodis && sort6) {
			System.out.printf("%-15s%-1s%-9.2f%-15.6s%-1s%-9.2f",item2,"$",val2,"$0.00","$",val2);
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-15.6s%-1s%-9.2f",item3,"$",val3,"$0.00","$",val3);
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-15.6s%-1s%-9.2f",item1,"$",val1,"$0.00","$",val1);
			System.out.println("");
			System.out.printf("%-40s%-1s%-9.2f","Total Price","$",(sum));
			System.out.println("");
			System.out.println("");
			System.out.println("Thank you for your purchase!");
		}
		//sort7 = true
		if(dis1 && sort7) {
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item3,"$",val3,"$",(dis1C),"$",(val3-(dis1C)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item2,"$",val2,"$",(dis1B),"$",(val2-(dis1B)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item1,"$",val1,"$",(dis1A),"$",(val1-(dis1A)));
			System.out.println("");
			System.out.printf("%-40s%-1s%-9.2f","Total Price","$",((val1-(dis1A))+(val2-(dis1B))+(val3-(dis1C))));
			System.out.println("");
			System.out.println("");
			System.out.println("Thank you for your purchase!");
		}
		else if(dis2 && sort7) {
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item3,"$",val3,"$",(dis2C),"$",(val3-(dis2C)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item2,"$",val2,"$",(dis2B),"$",(val2-(dis2B)));
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-1s%-15.6s%-1s%-9.2f",item1,"$",val1,"$",(dis2A),"$",(val1-(dis2A)));
			System.out.println("");
			System.out.printf("%-40s%-1s%-9.2f","Total Price","$",((val1-(dis2A))+(val2-(dis2B))+(val3-(dis2C))));
			System.out.println("");
			System.out.println("");
			System.out.println("Thank you for your purchase!");
		}
		else if(nodis && sort7) {
			System.out.printf("%-15s%-1s%-9.2f%-15.6s%-1s%-9.2f",item3,"$",val3,"$0.00","$",val3);
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-15.6s%-1s%-9.2f",item2,"$",val2,"$0.00","$",val2);
			System.out.println("");
			System.out.printf("%-15s%-1s%-9.2f%-15.6s%-1s%-9.2f",item1,"$",val1,"$0.00","$",val1);
			System.out.println("");
			System.out.printf("%-40s%-1s%-9.2f","Total Price","$",(sum));
			System.out.println("");
			System.out.println("");
			System.out.println("Thank you for your purchase!");
		}
	} // End Main
	
	public static void welcome() {
		System.out.println("  _        ,"); 
		System.out.println("(_\\______/________");
		System.out.println("    \\-|-|/|-|-|-|-|/");
		System.out.println("     \\==/-|-|-|-|-/");
		System.out.println("      \\/|-|-|-|,-'");
		System.out.println("       \\--|-'''");
		System.out.println("        \\_j________");
		System.out.println("        (_)     (_)");
		System.out.println(">===================================<");
		System.out.println(">> Welcome to Dylan's convenience! <<");
		System.out.println(">===================================<");
	} //end welcome





} // End Class

