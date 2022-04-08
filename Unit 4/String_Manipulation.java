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
		phrase = phrase.trim();
		for (int i = 0;i<phrase.length();i++) {
			space = phrase.charAt(i);
			if (space == ' ') {
				cnt++;
			}
			if (phrase.charAt(i)==' ' && phrase.charAt(i+1)==' ') {
				cnt--;
			}
		}
		System.out.println("Your message has been converted!");
		System.out.println("	Your phrase in uppercase: " + phrase.toUpperCase());
		System.out.println();
		System.out.println("	Your phrase in lowercase: " + phrase.toLowerCase());
		System.out.println();
		System.out.println("	# of Words: " + cnt);
		System.out.println();
		System.out.println("	Mix #1: " + otherLetter(phrase));
		for (int i = 0;i<phrase.length();i++) {
			letter = phrase.charAt(i);
			if (letter=='a'|| letter=='i'|| letter=='e'|| letter=='o'||letter=='u') {
				cnt2++;
			}
		}
		System.out.println();
		System.out.println("	Number of Vowels: " + cnt2);
		System.out.println();
		System.out.println("	Mix #2 (Vowels are uppercase): " + otherLetter2(phrase));
		System.out.println();
		System.out.print("        Phrase in reverse: " + reverse(phrase));
		System.out.println();
		System.out.println();
		System.out.println("	The number of \"be's\" and \"the's\" in your statement is: " + TheBesandThes(phrase));
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
	
	public static String otherLetter(String a) {
		StringBuilder sb = new StringBuilder(a.length());
		char isTwo;
		for (int i = 0;i<a.length();i++) {
			isTwo = a.charAt(i);
			char upper = Character.toUpperCase(isTwo);
			char lower = Character.toLowerCase(isTwo);
			if (i%2==0) {
				sb.append(upper);
			} else {
				sb.append(lower);
			}
		}
		return sb.toString();
	}//End otherLetter
	
	public static String otherLetter2(String a) {
		StringBuilder sb = new StringBuilder(a.length());
		char isTwo;
		for (int i = 0;i<a.length();i++) {
			isTwo = a.charAt(i);
			char upper = Character.toUpperCase(isTwo);
			char lower = Character.toLowerCase(isTwo);
			if (isTwo=='a'|| isTwo=='i'|| isTwo=='e'|| isTwo=='o'||isTwo=='u') {
				sb.append(upper);
			} else {
				sb.append(lower);
			}
		}
		return sb.toString();
	}//End otherLetter2
	
	public static String reverse(String a) {
		StringBuilder sb = new StringBuilder(a.length());
		int cnt3 = a.length()-1;
			while (cnt3 >= 0) {
				sb.append(a.charAt(cnt3));
				cnt3--;
			}
		return sb.toString();
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
	
	public static int TheBesandThes(String a) {
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
		return cnt4;
	} // End TheBesandThes
	
		

} //End Class
