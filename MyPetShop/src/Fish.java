import java.util.ArrayList;

public class Fish extends Pet{
	
	boolean saltWater;
	ArrayList<Fish> fishh = new ArrayList<>();
	public Fish(String breed, double price,boolean extra) {
		super(breed,price,extra);
	}
	
	public String toString() {
		return String.format("%-10s%-15s%-20s%-5s$%-10.2f%-15s","Fish"," ",getBreed()," ",getPrice(), doesExtra()?"Salt Water Fish":"Fresh Water Fish");
	}
}
