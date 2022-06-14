import java.util.ArrayList;
import java.util.Comparator;

public class Fish extends Pet{
	
	boolean saltWater;
	ArrayList<Fish> fishh = new ArrayList<>();
	public Fish(String breed, double price,boolean extra) {
		super(breed,price,extra);
	}
	
	public String toString() {
		return String.format("%-10s%-15s%-20s%-5s$%-10.2f%-15s","Fish"," ",getBreed()," ",getPrice(), doesExtra()?"Salt Water Fish":"Fresh Water Fish");
	}
	public static Comparator<Fish> fishComparator = new Comparator<Fish>() {

		public int compare(Fish f1,Fish f2) {
		   String fishName1 = f1.getBreed().toUpperCase();
		   String fishName2 = f2.getBreed().toUpperCase();


		   return fishName1.compareTo(fishName2);
	    }
	};
	public static Comparator<Fish> fishprice = new Comparator<Fish>() {

		public int compare(Fish f1, Fish f2) {

		   double price1 = f1.getPrice();
		   double price2 = f2.getPrice();

		   /*For ascending order*/
		   return (int) (price1-price2);

	   }};
}
