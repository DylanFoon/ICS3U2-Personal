import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;

public class Pet {
	
	private String name;
	private String breed;
	private int age;
	private double price;
	private String type;
	private boolean extra;
	
	
	public Pet(String name, String breed, int age, double price,boolean extra) {
		this.name = name;
		this.breed =  breed;
		this.age = age;
		this.price = price;
		this.extra = extra;
	}
	public Pet(String type,String name, String breed, int age, double price,boolean extra) {
		this.type = type;
		this.name = name;
		this.breed =  breed;
		this.age = age;
		this.price = price;
		this.extra = extra;
	}
	public Pet(String type, String breed, double price,boolean extra) {
		this.type = type;
		this.breed = breed;
		this.price = price;
		this.extra = extra;
	}
	public Pet(String breed, double price,boolean extra) {
		this.breed = breed;
		this.price = price;
		this.extra = extra;
	}
	public String getName() {
		return name;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getPrice() {
		return price;
	}
	public boolean doesExtra() {
		return extra;
	}
	public void adjustAge(int age) {
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public String toString() {
		return String.format("%-10s%-15s%-20s%-5s$%-10.2f%-15s",getType(),getName(),getBreed(),getAge(),getPrice(), doesExtra()?"is Special":"Is not Special");
}
	public static Comparator<Pet> petComparator = new Comparator<Pet>() {

		public int compare(Pet p1,Pet p2) {
		   String petName1 = p1.getName().toUpperCase();
		   String petName2 = p2.getName().toUpperCase();


		   return petName1.compareTo(petName2);
	    }
	};
	public static Comparator<Pet> petprice = new Comparator<Pet>() {

		public int compare(Pet p1, Pet p2) {

		   double price1 = p1.getPrice();
		   double price2 = p2.getPrice();

		   /*For ascending order*/
		   return (int) (price1-price2);

	   }};
}
