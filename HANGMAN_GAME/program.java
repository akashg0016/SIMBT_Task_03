import java.util.Scanner;
public class java_hangman
{   
	private static String[] words = {"terminator", "banana", "computer", "cow", "rain", "water" };
	private static String word = words[(int) (Math.random() * words.length)];
	private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
	private static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (count < 7 && asterisk.contains("*")) {
			System.out.println("Guess any letter in the word from alphabet [A-Za-z]");
			System.out.println(asterisk);
			String guess = sc.next();
			hang(guess.toLowerCase());
		}
		sc.close();
	}

	public static void hang(String guess) {
		String newasterisk = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == guess.charAt(0)) {
				newasterisk += guess.charAt(0);
			} else if (asterisk.charAt(i) != '*') {
				newasterisk += word.charAt(i);
			} else {
				newasterisk += "*";
			}
		}

		if (asterisk.equals(newasterisk)) {
			count++;
			hangmanImage();
		} else {
			asterisk = newasterisk;
		}
		if (asterisk.equals(word)) {
			System.out.println("Correct! You win! The word was " + word);
		}
	}

		public static void hangmanImage() {
		if (count == 1) {
			System.out.println("Wrong guess, try again");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
		    System.out.println(" |");
			System.out.println();
			
			System.out.println("Guesses left -> 6");
		}
		if (count == 2) {
			System.out.println("Wrong guess, try again");
			System.out.println("  |  ");
		    System.out.println("    .  ");
		    System.out.println("   /|\\  ");
		    
		    System.out.println("Guesses left -> 5");
		}
		if (count == 3) {
			System.out.println("Wrong guess, try again");
			System.out.println(" .----------.");
    		System.out.println(" |");
    		System.out.println(" |");
    		System.out.println(" |");
    		System.out.println(" |");
    		System.out.println(" |");
    		System.out.println(" |");
    		System.out.println(" |");
    		System.out.println(" |");
    		System.out.println(" .");
    		System.out.println("/|\\");
    		
    		System.out.println("Guesses left -> 4");
		}
		if (count == 4) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |             ");
    		System.out.println("   |             ");
    		System.out.println("   |             ");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
			
			System.out.println("Guesses left -> 3");
		}
		if (count == 5) {
			System.out.println("Wrong guess, try again");
			System.out.println(" .-------------.");
    		System.out.println(" |             |");
    		System.out.println(" |            _|_");
    		System.out.println(" |           /    \\");
    		System.out.println(" |          |      |");
    		System.out.println(" |           \\_ _ /");
    		System.out.println(" |             ");
    		System.out.println(" |             ");
    		System.out.println(" |             ");
    		System.out.println(" |             ");
    		System.out.println(" |             ");
    		System.out.println(" |             ");
    		System.out.println(" |             ");
    		System.out.println(" |             ");
    		System.out.println(" |");
    		System.out.println(" |");
    		System.out.println(" |");
    		System.out.println(" .");
    		System.out.println("/|\\");
    		
    		System.out.println("Guesses left -> 2");
    		
		}
		if (count == 6) {
			System.out.println("Wrong guess, try again");
			System.out.println(" .-------------.");
    		System.out.println(" |             |");
    		System.out.println(" |            _|_");
    		System.out.println(" |           /    \\");
    		System.out.println(" |          |      |");
    		System.out.println(" |           \\_ _ /");
    		System.out.println(" |             |");
    		System.out.println(" |             |");
    		System.out.println(" |             .");
    		System.out.println(" |          --- ---");
    		System.out.println(" |             |");
    		System.out.println(" |             |");
    		System.out.println(" |             ");
    		System.out.println(" |             ");
    		System.out.println(" |");
    		System.out.println(" |");
    		System.out.println(" |");
    		System.out.println(" .");
    		System.out.println("/|\\");
    		
    		System.out.println("Guesses left -> 1");
		}
		if (count == 7) {
			System.out.println("GAME OVER!");
			System.out.println(" .----------------.");
    		System.out.println(" |                |");
    		System.out.println(" |              _ | _");
    		System.out.println(" |             /      \\");
    		System.out.println(" |            |  ~  ~  |");
    		System.out.println(" |            |   /\\   |");
    		System.out.println(" |             \\ _ _ _/");
    		System.out.println(" |                |");
    		System.out.println(" |                |");
    		System.out.println(" |                .");
    		System.out.println(" |             --- ---");
    		System.out.println(" |                |");
    		System.out.println(" |                |");
    		System.out.println(" |               / \\");
    		System.out.println(" |              /   \\");
    		System.out.println(" |");
    		System.out.println(" |");
    		System.out.println(" |");
    		System.out.println(" .");
    		System.out.println("/|\\");
    		System.out.println(" No Guesses left ");
			System.out.println("GAME OVER! The word was " + word);
		}
	
	}
}

