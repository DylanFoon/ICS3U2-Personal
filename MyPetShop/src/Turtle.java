import java.util.ArrayList;
import java.util.Comparator;

public class Turtle extends LegsPet{
	ArrayList<Turtle> turtles = new ArrayList<>();
	public Turtle(String name,String breed,int age,double price,boolean isFast) {
		super(name,breed,age,price,isFast);
	}
	
	public String toString() {
		return String.format("%-10s%-15s%-20s%-5s$%-10.2f%-15s","Turtle",getName(),getBreed(),getAge(),getPrice(), doesExtra()?"Is Fast":"Is Slow");
	}
	public static Comparator<Turtle> turtleComparator = new Comparator<Turtle>() {

		public int compare(Turtle t1,Turtle t2) {
		   String turtleName1 = t1.getName().toUpperCase();
		   String turtleName2 = t2.getName().toUpperCase();


		   return turtleName1.compareTo(turtleName2);
	    }
	};
	public static Comparator<Turtle> turtleprice = new Comparator<Turtle>() {

		public int compare(Turtle t1, Turtle t2) {

		   double price1 = t1.getPrice();
		   double price2 = t2.getPrice();

		   /*For ascending order*/
		   return (int) (price1-price2);

	   }};
}
