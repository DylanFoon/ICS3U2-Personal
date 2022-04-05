import java.util.Scanner;

public class String_Manipulation {
	public static int cnt = 1;
	public static int cnt2 = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		welcome();
		char space;
		char letter;
		System.out.println("	 Welcome to Change That Message!");
		System.out.println("Enter a phrase (up to 6 words): ");
		String phrase = scanner.nextLine();
		for (int i = 0;i<phrase.length();i++) {
			space = phrase.charAt(i);
			if (space == ' ') {
				cnt++;
			}
		}
		System.out.println("Your message has been converted!");
		System.out.println("	Your phrase in uppercase: " + phrase.toUpperCase());
		System.out.println("	Your phrase in lowercase: " + phrase.toLowerCase());
		System.out.println("	# of Words: " + cnt);
		otherLetter(phrase);
		for (int i = 0;i<phrase.length();i++) {
			letter = phrase.charAt(i);
			if (letter=='a'|| letter=='i'|| letter=='e'|| letter=='o'||letter=='u') {
				cnt2++;
			}
		}
		System.out.println();
		System.out.println("	Number of Vowels: " + cnt2);
		otherLetter2(phrase);
		reverse(phrase);
		System.out.println();
		TheBesandThes(phrase);
		System.out.println();
		System.out.println("        Stack: ");
		stack(phrase);
	}// End main
	
	public static void welcome() {
		System.out.println("           ______              ");
		System.out.println("        .-'      `-.           ");
		System.out.println("      .'            `.         ");
		System.out.println("     /                \\        ");
		System.out.println("    ;                 ;`       ");
		System.out.println("    |         O       |;       ");
		System.out.println("    ;                 ;|		");
		System.out.println("    '\\               / ;       ");
		System.out.println("     \\`.           .' /        ");
		System.out.println("      `.`-._____.-' .'         ");
		System.out.println("        / /`_____.-'          ");
		System.out.println("       / / /                   ");
		System.out.println("      / / /					");
		System.out.println("     / / /						");
		System.out.println("    / / /						");
		System.out.println("   / / /						");
		System.out.println("  / / /						");
		System.out.println("  / / /							");
		System.out.println(" / / /							");
		System.out.println("/ / /							");
		System.out.println("\\/_/ 							");

	} //End Welcome
	
	public static void otherLetter(String a) {
		char isTwo;
		System.out.print("	Mix #1: ");
		for (int i = 0;i<a.length();i++) {
			isTwo = a.charAt(i);
			char upper = Character.toUpperCase(isTwo);
			char lower = Character.toLowerCase(isTwo);
			if (i%2==0) {
				System.out.print(upper);
			} else {
				System.out.print(lower);
			}
		}
	}//End otherLetter
	
	public static void otherLetter2(String a) {
		char isTwo;
		System.out.print("	Mix #2: ");
		for (int i = 0;i<a.length();i++) {
			isTwo = a.charAt(i);
			char upper = Character.toUpperCase(isTwo);
			char lower = Character.toLowerCase(isTwo);
			if (isTwo=='a'|| isTwo=='i'|| isTwo=='e'|| isTwo=='o'||isTwo=='u') {
				System.out.print(upper);
			} else {
				System.out.print(lower);
			}
		}
	}//End otherLetter2
	
	public static void reverse(String a) {
		int cnt3 = a.length()-1;
		System.out.println();
		System.out.print("	Phrase in reverse: ");
			while (cnt3 >= 0) {
				System.out.print(a.charAt(cnt3));
				cnt3--;
			}
		} //ENd reverse
	
	public static void stack(String a) {

		if (cnt > 1) {
			System.out.println("	More than one word");
		} else {
			if (a.length()%2!=0) {
				System.out.println("	This is an odd amount of letters. Word stack unavailable.");
			} else {
				int aHalf = a.length()/2;
				int empty = aHalf+2;
				for (int i = 0; i<=aHalf;i++) {
					String b = "";
					for (int j = empty; j>0;j--) {
						b+=(" ");
					}
					if (!b.equals(a)) {
					b+=(a.substring(aHalf-i,aHalf+i));
					} else {
						b=a;
					}
					System.out.println(b);
					empty--;
				}
					
				
			}
				
		}
	} //End stack
	
	public static void TheBesandThes(String a) {
		int cnt4 = 0;
		int i = 0;
		int j = 0;
		String aLower = a.toLowerCase();
		while (i+2 <= aLower.length()) {
			if (aLower.substring(i,i+2).equals("be")) {
				cnt4++;
			}
			while (j+3<=a.length()) {
				if (aLower.substring(j,j+3).equals("the")) {
					cnt4++;
				}
				j++;
			}
			i++;
		}
		System.out.println("	The number of \"be's\" and \"the's\" in your phrase is: " + (cnt4));
	} // End TheBesandThes
	
		

} //End Class
