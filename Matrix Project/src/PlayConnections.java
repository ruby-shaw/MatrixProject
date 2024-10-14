import java.util.Scanner;


public class PlayConnections
	{
		static String [] [] correct1 = new String [4][4];

		static String areaTheme = "Theme : Area of high ground";
					
		correct1  [0][0] = "bank";
		correct1  [0][1] = "dune";
		correct1  [0][2] = "hill";
		correct1  [0][3] = "mound";

		static String significanceTheme = "Theme : Significance";
					
		correct1  [1][0] = "gravity";
		correct1  [1][1] = "import";
		correct1  [1][2] = "substance";
		correct1  [1][3] = "weight";

		static String actionsTheme = "Theme : Actions in fantasy sports";
					
		correct1  [2][0] = "bench";
		correct1  [2][1] = "draft";
		correct1  [2][2] = "start";
		correct1  [2][3] = "trade";

		static String scifiTheme = "Theme : Sci-fi movies with 'The'";
					
		correct1  [3][0] = "abyss";
		correct1  [3][1] = "fly";
		correct1  [3][2] = "matrix";
		correct1  [3][3] = "thing";


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
//			else if(userGuess.equals("A1"))
//				{
//					
//				}
			else if(userGuess.equals("answer"));
				{
					Board.correctBoard1();
				}
		}
		
		

	}
