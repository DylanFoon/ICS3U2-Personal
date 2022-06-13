import java.io.File;
import java.io.IOException;
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
}
