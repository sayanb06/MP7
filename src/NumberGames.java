import java.util.Scanner;

public class NumberGames {
	
	public static void main(String[] args) {
		
		int inputNumber = 1;
		Scanner reader = new Scanner(System.in); 
		System.out.println("Pick a number game! Type '1' for Collatz Conjecture or type '2' for Guess The Number! ");
		inputNumber = reader.nextInt();
		
		while (inputNumber != 1 && inputNumber != 2) {
			System.out.println("Please pick either '1' or '2'.");
			inputNumber = reader.nextInt();
		}
		
		if (inputNumber == 1) {
			System.out.println("Now pick a positive integer to undergo Collatz Conjecture! ");
			int collatzNumber = reader.nextInt(); 
			System.out.println("Start!");
			collatzConjecture(collatzNumber);
			
		}
		
		if (inputNumber == 2) {
			System.out.println("Choose the upper bound for the game! ");
			int bound = reader.nextInt();
			while (bound <= 1) {
				System.out.println("Please enter a bound greater than 1.");
				System.out.println("Your new bound: ");
				bound = reader.nextInt();
			}
			System.out.println("Can you guess the number I am thinking of between 1 and " + bound + "? ");
			guessTheNumber(bound);
		}
	}
	
	public static void collatzConjecture(final int n) {
		
	}
	
	public static void guessTheNumber(final int bound) {
		
		int correctNumber = (int) (Math.random() * (bound - 1) + 1); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Your guess: ");
		int guess = sc.nextInt(); 
		while (guess != correctNumber) {
			if (guess < 1 || guess > bound) {
				System.out.println("Please guess between the bounds.");
			} else {
				if (guess < correctNumber) {
					System.out.println("That's incorrect. The correct value is greater...");
				}
				if (guess > correctNumber) {
					System.out.println("That's incorrect. The correct value is smaller...");
				}
			}
			System.out.println("Your new guess: ");
			guess = sc.nextInt(); 
		}
		System.out.println("You win!!!");
	}
	
	public static void dealOrNoDeal() {
		
		Scanner howieMandel = new Scanner(System.in);
		System.out.println("Welcome to Deal or No Deal. The goal of the game is to eliminate cases to try and win a million dollars. ");
		System.out.println("To start off, choose the case that you think has the 1 million dollars in it and you will hold on to this for the rest of the game.");
		System.out.println("Choose your case! ");
		int yourCase = howieMandel.nextInt(); 
		
		System.out.println("Now it's time to choose 6 cases to eliminate from the board");
		for (int r = 0; r < 25; r++) {
			if (r % 5 == 0) {
				System.out.println();
			}
			System.out.print(r + "	");
		}
		
		
		
	}
	
	public static int Banker() {
		return 0; 
	}
	
	public static int[] assignCaseValues() {
		
		int[] values = new int[25];
		values[0] = 1;
		values[1] = 5;
		values[2] = 10;
		values[3] = 25;
		values[4] = 50;
		values[5] = 75;
		values[6] = 100;
		values[7] = 200;
		values[8] = 300;
		values[9] = 400;
		values[10] = 500;
		values[11] = 750;
		values[12] = 1000;
		values[13] = 5000;
		values[14] = 10000;
		values[15] = 25000;
		values[16] = 50000;
		values[17] = 75000;
		values[18] = 100000;
		values[19] = 200000;
		values[20] = 300000;
		values[21] = 400000;
		values[22] = 500000;
		values[23] = 750000;
		values[24] = 1000000;

		int[] cases = new int[25];
		for (int row = 0; row < cases.length; row++) {
				
			int r = (int) (Math.random() * 25); 
			while (values[r] == 0) {
				r = (int) (Math.random() * 25); 
			}
			cases[row] = values[r];
			values[r] = 0; 
			}
		return cases; 
	}
	
}