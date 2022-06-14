import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class petShopMain {
	String name;
	private static ArrayList<Dog> dogs = new ArrayList<>();
	private static ArrayList<Cat> cats = new ArrayList<>();
	private static ArrayList<Fish> fishh = new ArrayList<>();
	private static ArrayList<Turtle> turtles = new ArrayList<>();
	private static ArrayList<Integer> ages = new ArrayList<>();
	private static ArrayList<Integer> threeOldest;
	private static ArrayList<Double> prices = new ArrayList<>();
	private static ArrayList<Pet> pets = new ArrayList<>();
	private static ArrayList<Pet> oldest = new ArrayList<>();
	private static ArrayList<mostExpensive> mostExpensives = new ArrayList<>();
	private static ArrayList<cheapPets> cheap = new ArrayList<>();
	private static ArrayList<Double> expensivePrices;
	private static ArrayList<Double> cheapPrices;
	private static int dogQty =0;
	private static int catQty =0;
	private static int fishQty =0;
	private static int turtleQty =0;
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
				pets.add(new Pet(type,name,breed,age,price,misc));
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
		System.out.println("There are " + dogQty + " dogs.");
		System.out.println();
		for(Fish f:fishh) {
			System.out.println(f);
		}
		System.out.println();
		System.out.println("There are " +fishQty + " fish.");
		System.out.println();
		for(Cat c:cats) {
			System.out.println(c);
		}
		System.out.println();
		System.out.println("There are " + catQty + " cats.");
		System.out.println();
		for(Turtle t:turtles) {
			System.out.println(t);
		}
		System.out.println();
		System.out.println("There are " + turtleQty + " turtles.");
	}

	public void welcome() {
		System.out.println("                               .-.	");
		System.out.println("\"(___________________________()6 `-,\"				Welcome to the Pet Store!! !!");
		System.out.println("(   ______________________   /''\"`");
		System.out.println(" //\\                      //\\");
		System.out.println("'' ''                     '' ''");
		System.out.println();
		selection();

	}

	public static String showMenu(){
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);

		Object[] players = {"Display Full Animal Inventory","Display One Type of Animal","Display the 3 most expensive animals","Display the 3 Cheapest Animals","Display the Oldest Animals","View All Animals Sorted by Price","View All Animals Sorted in Alphabetical Order"};
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
	
	public static String showPetsPrice(){
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);

		Object[] players = {"All","Dogs","Cats","Fish","Turtles"};
		Object selectionObject = JOptionPane.showInputDialog(frame, "Your Choice", "What would you like to see?", JOptionPane.PLAIN_MESSAGE, null, players, players[0]);
		String selectionString = selectionObject.toString();
		return selectionString;
	}//end ShowPetsPrice

	public static String showPetsNames(){
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);

		Object[] players = {"All","Dogs","Cats","Fish","Turtles"};
		Object selectionObject = JOptionPane.showInputDialog(frame, "Your Choice", "What would you like to see?", JOptionPane.PLAIN_MESSAGE, null, players, players[0]);
		String selectionString = selectionObject.toString();
		return selectionString;
	}//end ShowPetsNames
	
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
				}System.out.println();
				System.out.println("There are " + dogQty + " dogs.");
				break;
			case"Cats":
				menu();
				for(Cat c:cats) {
					System.out.println(c);
				}
				System.out.println();
				System.out.println("There are " + catQty + " cats.");
				break;
			case"Fish":
				menu();
				for(Fish f:fishh) {
					System.out.println(f);
				}
				System.out.println();
				System.out.println("There are " + fishQty + " fish.");
				break;
			case"Turtles":
				menu();
				for(Turtle t:turtles) {
					System.out.println(t);
				}
				System.out.println();
				System.out.println("There are " + turtleQty + " turtles.");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Invalid", "Not a valid Input. Try again", JOptionPane.ERROR_MESSAGE);

			}
			break;
		case"Display the 3 most expensive animals":
			petsSort();
			menu();
			threeExpensive();
			break;
		case "Display the 3 Cheapest Animals":
			petsSort();
			menu();
			threeCheapest();
			break;
		case "Display the 3 Oldest Animals":
			agesSort();
			menu();
			printOldest();
			break;
		case"View All Animals Sorted by Price":
			petPrice();
			petPrices();
			break;
		case"View All Animals Sorted in Alphabetical Order":
			petLetter();
			alphabetical();
		}
			
	}
	
	public static void menu() {
		System.out.printf("%-10s%-15s%-20s%-5s%-12s%-15s","Animal","Name","Breed","Age","Price","Extra");
		System.out.println();
		System.out.printf("%-10s%-15s%-20s%-5s%-12s%-15s","=======","====","=====","===","=====","=====");
		System.out.println();
	}

	public static ArrayList<Double> pricesSort() {
		Collections.sort(prices);
		return prices;
	}
	
	public static void threePrices() {
		pricesSort();
		expensivePrices = new ArrayList<Double>(prices.subList(prices.size() -3, prices.size()));
		cheapPrices = new ArrayList<Double>(prices.subList(prices.size()-prices.size(), prices.size()-prices.size()+3));
	}

	public static void threeExpensive() {
		for(mostExpensive m:mostExpensives) {
			System.out.println(m);
		}
	}

	public static void threeCheapest() {
		for(cheapPets c:cheap) {
			System.out.println(c);
		}
	}
	
	public static void petsSort() {
		threePrices();
		for(Pet p:pets) {
			for(Double e:expensivePrices) {
				if(p.getPrice()==e) {

					mostExpensives.add(new mostExpensive(p.getType(),p.getName(),p.getBreed(),p.getAge(),p.getPrice(),p.doesExtra()));
				}
			}
			for(Double c:cheapPrices) {
				if(p.getPrice()==c) {

					cheap.add(new cheapPets(p.getType(),p.getName(),p.getBreed(),p.getAge(),p.getPrice(),p.doesExtra()));
				}
			}
		}
	}

	public static void petLetter() {
		Collections.sort(pets,Pet.petComparator);
	}
	
	public static void petPrice() {
		Collections.sort(pets,Pet.petprice);
	}
	
	public static void agesSort() {
		Collections.sort(ages);
		threeOldest = new ArrayList<Integer>(ages.subList(ages.size() -3, ages.size()));
		for(Pet p:pets) {
			for(Integer t:threeOldest) {
				if(p.getAge()==t) {	
					if(oldest.size()!=0) {
						if(!p.getName().equals(oldest.get((oldest.size()-1)).getName())) {
							oldest.add(new mostExpensive(p.getType(),p.getName(),p.getBreed(),p.getAge(),p.getPrice(),p.doesExtra()));
						} 
					}
					else {
						oldest.add(new mostExpensive(p.getType(),p.getName(),p.getBreed(),p.getAge(),p.getPrice(),p.doesExtra()));
					}
				}

			}
		}
	}

	public static void printOldest() {
		for(Pet o:oldest) {
			System.out.println(o);
		}
	}
	
	public static void petPrices() {
		Collections.sort(dogs,Dog.dogprice);
		Collections.sort(cats,Cat.catprice);
		Collections.sort(fishh,Fish.fishprice);
		Collections.sort(turtles,Turtle.turtleprice);
		String petPrices = showPetsPrice();
		menu();
		switch(petPrices) {
		case"All":
		for(Pet p:pets) {
			System.out.println(p);
		}
		break;
		case"Dogs":
			for(Dog d:dogs) {
				System.out.println(d);
			}
			break;
		case"Cats":
			for(Cat c:cats) {
				System.out.println(c);
			}
			break;
		case"Fish":
			for(Fish f:fishh) {
				System.out.println(f);
			}
			break;
		case"Turtles":
			for(Turtle t:turtles) {
				System.out.println(t);
			}
			break;
		}
	}

	public static void alphabetical() {
		Collections.sort(dogs,Dog.dogComparator);
		Collections.sort(cats,Cat.catComparator);
		Collections.sort(fishh,Fish.fishComparator);
		Collections.sort(turtles,Turtle.turtleComparator);
		String petNames = showPetsNames();
		menu();
		switch(petNames) {
		case"All":
		for(Pet p:pets) {
			System.out.println(p);
		}
		break;
		case"Dogs":
			for(Dog d:dogs) {
				System.out.println(d);
			}
			break;
		case"Cats":
			for(Cat c:cats) {
				System.out.println(c);
			}
			break;
		case"Fish":
			for(Fish f:fishh) {
				System.out.println(f);
			}
			break;
		case"Turtles":
			for(Turtle t:turtles) {
				System.out.println(t);
			}
			break;
		}
	}
}
