
public class cheapPets extends Pet{
		public cheapPets(String type,String name, String breed, int age, double price,boolean extra) {
			super(type,name,breed,age,price,extra);
		}
		public String toString() {
			return String.format("%-10s%-15s%-20s%-5s$%-10.2f%-15s",getType(),getName(),getBreed(),getAge(),getPrice(), doesExtra()?"is Special":"Is not Special");
	}
}
