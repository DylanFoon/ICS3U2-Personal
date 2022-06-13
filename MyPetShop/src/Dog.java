import java.util.ArrayList;

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
}
