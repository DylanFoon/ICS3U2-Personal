import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.util.Arrays;
import java.util.Scanner;
public class Whos_A_Winner {
		public static void main(String[] args) {
			Welcome();
			System.out.println();
			Scanner scanner = new Scanner(System.in);
			int oneWin = 0;
			int players = showMenu();
			while (true){
			try {
			oneWin = Integer.parseInt(JOptionPane.showInputDialog("Player: Miller " + "How many wins?"));
			break;
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Not a valid input. Try again","Hey!", JOptionPane.ERROR_MESSAGE);
			}
			}
			
			//PlayerInfo
			String[] playerInfo;
			playerInfo = new String[players];
			int[] playerWins;
			playerWins = new int[players];
			for(int i = 0;i<players;i++) {
				while (true){
					try {
					playerInfo[(int)i]=JOptionPane.showInputDialog("Player " + ((int)i+1) + " name");
					playerWins[(int)i] = Integer.parseInt(JOptionPane.showInputDialog("Player "+ ((int)i+1) + " Number of Wins"));
					break;
					} catch(Exception e) {
						JOptionPane.showMessageDialog(null, "Not a valid input. Try again","Hey!", JOptionPane.ERROR_MESSAGE);
					}
					}
								
				
			}
			//new array with MillerWin in it
			int[] a = new int[playerWins.length+1];
			for(int i = 0;i<a.length-1;i++) {
				a[i] = playerWins[i];
			}
			a[a.length-1] = oneWin;
			String[] b = new String[playerWins.length+1];
			for(int i = 0;i<b.length-1;i++) {
				b[i] = playerInfo[i];
			}
			b[b.length-1] = "Miller";
			printWins(playerInfo,playerWins,oneWin,players);
			System.out.println();
			System.out.println();
			System.out.println("----Statistics----");
			System.out.print("Wins Displayed: " + oneWin + ",");
			for(int i = 0;i<playerWins.length;i++) {
				System.out.print(playerWins[i] + (i!=playerWins.length-1? ",":" "));
			}
			System.out.println();
	        System.out.println("The maximum number of wins is: " + (oneWin<maxValue(playerWins.clone())?maxValue(playerWins.clone()):oneWin));
	        System.out.println("The minimum number of wins is: " + (oneWin>minValue(playerWins.clone())?minValue(playerWins.clone()):oneWin));
		    System.out.printf("The average number of wins is: %-3.2f" , avgValue(a.clone()));
		    System.out.println();
		    System.out.print("Wins sorted from Lowest to Highest: ");
	//	    System.out.println("Wins sorted from low to High: " + sortArrayLow(a.clone()));
		    for(int i = 0;i<=sortArrayLow(a.clone()).length-1;i++) {
		    	System.out.print(sortArrayLow(a.clone())[i] + (i!=sortArrayLow(a.clone()).length-1?",":" "));
		    }
		    System.out.println();
		    System.out.print("Wins Sorted from High to Low: ");
		//    System.out.println("Wins sorted from High to Low: " + sortArrayHigh(a.clone()));
		    for(int i = 0;i<=sortArrayHigh(a.clone()).length-1;i++) {
		    	System.out.print(sortArrayHigh(a.clone())[i] + (i!=sortArrayHigh(a.clone()).length-1?",":" "));
		    }
		    System.out.println();
		    System.out.printf("The median of these wins is: %-3.2f" , median(sortArrayLow(a.clone())));
		    System.out.println();
		    System.out.println("The longest name in the Game is: " + longestWord(b.clone()));
		    System.out.println();
		    comparedToAvg(b.clone(),a.clone(),oneWin);
		}
		
		public static void Welcome() {
System.out.println("            .-=========-.");
System.out.println("            \'-=======-'/");
		System.out.println("            _|   .=.   |_");
				System.out.println("           ((|  {{1}}  |))");
				System.out.println("            \\|   /|\\   |/");
				System.out.println("             \\__ '`' __/");
				System.out.println("               _`) (`_");
				System.out.println("             _/_______\\_");
				System.out.println("            /___________\\");
				System.out.println();
				System.out.println();
				System.out.println("-<>-<>-<>-<>-<>-WELCOME TO WHO'S A WINNER-<>-<>-<>-<>-<>");
		}
		
		public static void printWins(String[] a,int[] b,int MillerWins,int player) {
			System.out.printf(" Player#	 %-17s%-17s","Player Name","Wins");
			System.out.println();
			System.out.printf("=========	 %-16s%-16s","=============", "======");
			System.out.println();
			System.out.printf("Player 0: 	 %-18s%-3d","Miller",MillerWins);
			for(int i = 0;i<player;i++) {
					System.out.println();
					System.out.printf("Player "+ ((int)i+1) +": 	  %-17s%-3d" , a[i],b[i]);
				}	        
	        
	        System.out.println();

	        
		}
		
		public static int showMenu(){
	        JFrame frame = new JFrame();
	        frame.setAlwaysOnTop(true);

	        Object[] players = {1,2,3,4,5,6};
	        Object selectionObject = JOptionPane.showInputDialog(frame, "Player number", "How many players (excluding Miller)?", JOptionPane.PLAIN_MESSAGE, null, players, players[0]);
	        String selectionString = selectionObject.toString();
	        int a = Integer.parseInt(selectionString);
	        return a;
	    }//end ShowMenu		
		
		public static double avgValue(int wins[]) {
			double total = 0;

			for(int i=0; i<wins.length; i++){
	        	total += wins[i];
	        }
			double avg = total/wins.length;
			return avg;
		} // end avgValue
		
		public static int maxValue(int wins[]) {
			int max = wins[0];
			for(int i = 0;i<wins.length;i++) {
				max =Math.max(max,wins[i]);
			}
			return max;
		}//end maxValue
		
		public static int minValue(int wins[]) {
			int min = wins[0];
			for(int i = 0;i<wins.length;i++) {
				min =Math.min(min,wins[i]);
			}
			return min;
		}//end minValue
		
		public static int[] sortArrayLow(int[] wins) {

			int temp =0;
			for(int i=0;i<wins.length-1;i++){
                for(int j=0;j<wins.length-1;j++){
                    if(wins[j] >= wins[j+1]){
                        temp = wins[j+1];
                        wins[j+1] = wins[j];
                        wins[j]=temp;
                    }
                }
            }

			return wins;
		}//end sortArrayLow
		
		public static int[] sortArrayHigh(int[] wins) {
			int temp =0;
            for(int i=0;i<wins.length-1;i++){
                for(int j=0;j<wins.length-1;j++){
                    if(wins[j] < wins[j+1]){
                        temp = wins[j+1];
                        wins[j+1] = wins[j];
                        wins[j]=temp;
                    }
                }
            }

			return wins;
			
		}//end sortArrayHigh

		public static double median(int[] wins) {
			if(wins.length%2==1) {
				return wins[wins.length/2];
			} else {
				return avgValue(new int[] {wins[(wins.length/2)-1],wins[(wins.length/2)]});
			}
		}//end median
		
		public static String longestWord(String[] names) {
			String longest = "";
			String word;
			String Miller = "miller";
			for(int i = 0;i<names.length-1;i++) {
				word = names[i];
				if(longest.equals("") || word.length() > longest.length()) {
					longest = word;
				}
			}
			if (longest.length() < Miller.length()){
				longest = "Miller";
			}
			return longest;
		}//end longestWord
		
		public static void comparedToAvg(String[] names,int[] wins,int MillerWins) {
			String[] c = new String[names.length+1];
			int[] d = new int[wins.length+1];
			c[c.length-1] = "Miller";
			for(int i = 0;i<d.length-1;i++) {
				d[i] = wins[i];
			}
			for(int i = 0;i<c.length-1;i++) {
				c[i] = names[i];
			}
			d[d.length-1] = MillerWins;
			String[] X = new String[c.length];
			double[] avg = new double[d.length];
			int winf = maxValue(wins.clone())+3;
			if(winf < 12) {
				winf = 12;
			}
			int namef = longestWord(names.clone()).length()+3;
			if (namef<14) {
				namef = 14;
			}
			System.out.println();
			System.out.printf("%"+-namef+"s%"+-winf+"s%s\n","Player","Wins ","Compared to Average");
			System.out.printf("%"+-namef+"s%"+-winf+"s%s\n","====== ","==== ","===================");
			for(int i = 0;i<X.length-1;i++) {
				int a = d[i];
				String b = "";
				for(int j = 0;j<a;j++) {
					b += "X";
				}
				String sign = d[i] > avgValue(wins.clone())? "+":"";
					avg[i] = a-avgValue(wins.clone());
				System.out.printf("%"+-namef+"s%"+-winf+"s%s%.1f\n",c[i],b,sign,avg[i]);
			}
		}
}
