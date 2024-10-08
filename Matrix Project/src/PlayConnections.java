import java.util.Scanner;


public class PlayConnections
	{

		public static void main(String[] args)
			{
				Board.makeBoard1();
				instructions();
				
				// create Board -> 4x4 Matrix
				// fillBoard - two + separate boards
				//has to have shuffle  function at any time
				// user selects space by letter and number??
				//make sure shuffle does not fill filled spaces
				
				//Next step: allow user to input guess + evaluate guess
			}
		
		public static void instructions()
		{
			Scanner userInput = new Scanner(System.in); 
			
			System.out.println("Welcome to Connections! The board of words is above. Do you want instructions before you play?");
			
			String instructionsChoice = userInput.nextLine();
			
			if (instructionsChoice.equals("yes"))
				{
					System.out.println("Select 4 words that you think have something in common. Type 'submit' to see if the words you chose are related. Find the 4 groups of words in less than 4 mistakes. Type 'shuffle' to mix up the board.");
					activePlay();
				}
			else
				{
					System.out.println("Let's play!");
					activePlay();
				}
		}
		
		public static void activePlay()
		{
			Scanner userInput = new Scanner(System.in); 		
			String userGuess = userInput.nextLine();
			userGuess.toLowerCase();
			
			boolean isWon = false; 

			
			if (userGuess.equals("shuffle"))
				{
					Board.shuffleBoard1();
				}
			else if(userGuess.equals("A1"))
				{
					
				}
		}
		
		

	}
