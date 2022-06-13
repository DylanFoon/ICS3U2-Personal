import java.util.ArrayList;

public class Turtle extends LegsPet{
	ArrayList<Turtle> turtles = new ArrayList<>();
	public Turtle(String name,String breed,int age,double price,boolean isFast) {
		super(name,breed,age,price,isFast);
	}
	
	public String toString() {
		return String.format("%-10s%-15s%-20s%-5s$%-10.2f%-15s","Turtle",getName(),getBreed(),getAge(),getPrice(), doesExtra()?"Is Fast":"Is Slow");
	}
}
