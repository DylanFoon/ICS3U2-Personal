import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class petShopMain {
	String name;
	private static ArrayList<Dog> dogs = new ArrayList<>();
	private static ArrayList<Cat> cats = new ArrayList<>();
	private static ArrayList<Fish> fishh = new ArrayList<>();
	private static ArrayList<Turtle> turtles = new ArrayList<>();
	private static ArrayList<Integer> ages = new ArrayList<>();
	private static ArrayList<Double> prices = new ArrayList<>();
	private static int dogQty =0;
	private static int catQty =0;
	private static int fishQty =0;
	private static int turtleQty =0;
	private static int mosExpense;
	public petShopMain(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		petShopMain PetShop = new petShopMain("PetShop!! !!");
		
		loadPets();
		PetShop.welcome();
		
	}
	public static void loadPets() {
		String fileNa = "src/Pets.csv";
		String line="";
		String name;
		String type;
		double price;
		String breed;
		boolean misc;
		String values[];
		int age;
		try {
			Scanner input = new Scanner(new File(fileNa));
			while(input.hasNext()) {
				line = input.nextLine();
				// Split into an Array of Values based on Comma
				values = line.split(",");
				// Print the Line
				type = values[0];
				name = values[1]!= ""?values[1]:"null";
				breed = values[2];
				age = (!"".equals(values[3])?Integer.parseInt(values[3]):0);
				ages.add(age);
				price = Double.parseDouble(values[4]);
				prices.add(price);
				misc = Boolean.parseBoolean(values[5].toLowerCase());
				switch(type) {
					case "Dog":
						dogs.add(new Dog(name,breed,age,price,misc));
						dogQty++;
						break;
					case "Cat":
						cats.add(new Cat(name,breed,age,price,misc));
						catQty++;
						break;
					case "Fish":
						fishh.add(new Fish(breed,price,misc));
						fishQty++;
						break;
					case "Turtle":
						turtles.add(new Turtle(name,breed,age,price,misc));
						turtleQty++;
						break;
					default:
						break;
				}
			}
		}catch(IOException e) {
			System.out.println("Error Reading File: ");
		}
	}
	
	public static int getDogQty() {
		return dogQty;
	}
	
	public static int getCatQty() {
		return catQty;
	}
	
	public static int getFishQty() {
		return fishQty;
	}
	
	public static int getTurtleQty() {
		return turtleQty;
	}
	
	public static void printInv() {
		for(Dog d : dogs) {
			System.out.println(d);
		}
		System.out.println();
		for(Fish f:fishh) {
			System.out.println(f);
		}
		System.out.println();
		for(Cat c:cats) {
			System.out.println(c);
		}
		System.out.println();
		for(Turtle t:turtles) {
			System.out.println(t);
		}
	}
	
	public void welcome() {
		System.out.println("                               .-.	");
		System.out.println("\"(___________________________()6 `-,\"				Welcome to the Pet Store!! !!");
		System.out.println("(   ______________________   /''\"`");
		System.out.println(" //\\                      //\\");
		System.out.println("'' ''                     '' ''");
		selection();
				
		}
	
	public static String showMenu(){
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        Object[] players = {"Display Full Animal Inventory","Display One Type of Animal","Display the 3 most expensive animals","Display the three Cheapest Animals","Display the 3 Oldest Animals"};
        Object selectionObject = JOptionPane.showInputDialog(frame, "Your Choice", "What would you like to see?", JOptionPane.PLAIN_MESSAGE, null, players, players[0]);
        String selectionString = selectionObject.toString();
        return selectionString;
    }//end ShowMenu	
	
	public static String showPets(){
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        Object[] players = {"Dogs","Cats","Fish","Turtles"};
        Object selectionObject = JOptionPane.showInputDialog(frame, "Your Choice", "What would you like to see?", JOptionPane.PLAIN_MESSAGE, null, players, players[0]);
        String selectionString = selectionObject.toString();
        return selectionString;
    }//end ShowPets	
	
	
	public static void selection() {
		String choice = showMenu();
		switch(choice) {
			case"Display Full Animal Inventory":
				menu();
				printInv();
				break;
			case"Display One Type of Animal":
				String petShowCase = showPets();
				switch(petShowCase) {
					case"Dogs":
						menu();
						for(Dog d:dogs) {
							System.out.println(d);
						}
						break;
					case"Cats":
						menu();
						for(Cat c:cats) {
							System.out.println(c);
						}
						break;
					case"Fish":
						menu();
						for(Fish f:fishh) {
							System.out.println(f);
						}
						break;
					case"Turtles":
						menu();
						for(Turtle t:turtles) {
							System.out.println(t);
						}
						break;
					default:
						JOptionPane.showMessageDialog(null, "Invalid", "Not a valid Input. Try agaim", JOptionPane.ERROR_MESSAGE);
						
				}
				break;
			case"Display the 3 most expensive animals":
				threeExpensive();
				break;
		}
	}
	public static void menu() {
		System.out.printf("%-10s%-15s%-20s%-5s%-12s%-15s","Animal","Name","Breed","Age","Price","Extra");
		System.out.println();
		System.out.printf("%-10s%-15s%-20s%-5s%-12s%-15s","=======","====","=====","===","=====","=====");
		System.out.println();
	}
	
	public static void threeExpensive() {
		Collections.sort(prices);
		for(Double d:prices) {
			System.out.println(d);
		}
	}
}
