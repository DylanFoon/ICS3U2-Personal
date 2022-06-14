import java.util.Comparator;

public class Cat extends LegsPet{
	boolean isHouseCat;
	
	public Cat(String name,String breed, int age, double price, boolean isHouseCat) {
		super(name,breed,age,price,isHouseCat);
	}
	
	public String toString() {
		return String.format("%-10s%-15s%-20s%-5s$%-10.2f%-15s","Cat",getName(),getBreed(),getAge(),getPrice(), doesExtra()?"House Cat":"Outdoor Cat");
	}
	public static Comparator<Cat> catComparator = new Comparator<Cat>() {

		public int compare(Cat c1,Cat c2) {
		   String catName1 = c1.getName().toUpperCase();
		   String catName2 = c2.getName().toUpperCase();


		   return catName1.compareTo(catName2);
	    }
	};
	public static Comparator<Cat> catprice = new Comparator<Cat>() {

		public int compare(Cat c1, Cat c2) {

		   double price1 = c1.getPrice();
		   double price2 = c2.getPrice();

		   /*For ascending order*/
		   return (int) (price1-price2);

	   }};
}
