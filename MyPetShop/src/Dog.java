import java.util.ArrayList;
import java.util.Comparator;

public class Dog extends LegsPet{
	
	ArrayList<Dog> dogs = new ArrayList<>();
	public Dog(String name,String breed,int age,double price, boolean barks) {
		super(name,breed,age,price,barks);
		dogs.add(this);
	}
	
	
	public void setAge(int age) {
		super.adjustAge(age);
	}

	public String toString() {
		return String.format("%-10s%-15s%-20s%-5s$%-10.2f%-15s","Dog",getName(),getBreed(),getAge(),getPrice(), doesExtra()?"Barks":"Does not Bark");
	}
	public static Comparator<Dog> dogComparator = new Comparator<Dog>() {

		public int compare(Dog d1,Dog d2) {
		   String dogName1 = d1.getName().toUpperCase();
		   String dogName2 = d2.getName().toUpperCase();


		   return dogName1.compareTo(dogName2);
	    }
	};
	public static Comparator<Dog> dogprice = new Comparator<Dog>() {

		public int compare(Dog d1, Dog d2) {

		   double price1 = d1.getPrice();
		   double price2 = d2.getPrice();

		   /*For ascending order*/
		   return (int) (price1-price2);

	   }};
}
