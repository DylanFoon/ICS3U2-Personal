
public class Cat extends LegsPet{
	boolean isHouseCat;
	
	public Cat(String name,String breed, int age, double price, boolean isHouseCat) {
		super(name,breed,age,price,isHouseCat);
	}
	
	public String toString() {
		return String.format("%-10s%-15s%-20s%-5s$%-10.2f%-15s","Cat",getName(),getBreed(),getAge(),getPrice(), doesExtra()?"House Cat":"Outdoor Cat");
	}
}
