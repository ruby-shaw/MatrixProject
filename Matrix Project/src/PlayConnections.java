import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class PlayConnections
	{
		public static String [] [] correct1 = new String [4][4];

		static String areaTheme = "Theme : Area of high ground";

		 static String significanceTheme = "Theme : Significance";		

		 static String actionsTheme = "Theme : Actions in fantasy sports";

		 static String scifiTheme = "Theme : Sci-fi movies with 'The'";
		 
		 static int mistakes = 0; 
		 
		 static 	ArrayList<String> sortedBoard = new ArrayList<>();// is the correct sorted items in list form 
		 
		 static  ArrayList<String> sortedBoard1 = new ArrayList<>(); // has stuff from 1st category
		 static ArrayList<String> sortedBoard2 = new ArrayList<>();
		 static ArrayList<String> sortedBoard3 = new ArrayList<>();
		 static ArrayList<String> sortedBoard4 = new ArrayList<>();
		 
		 

					
//		 public static void correctBoard1()
//				{
//					
//		
//				}

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
					System.out.println("Select 4 words that you think have something in common. Type 'submit' to see if the words you chose are related. Find the 4 groups of words in less than 4 mistakes. Type 'shuffle' to mix up the board. Type 'answer' to see the correct answers. ");
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
			
			correct1  [0][0] = "bank";
			correct1  [0][1] = "dune";
			correct1  [0][2] = "hill";
			correct1  [0][3] = "mound";
						
			correct1  [1][0] = "gravity";
			correct1  [1][1] = "import";
			correct1  [1][2] = "substance";
			correct1  [1][3] = "weight";

			correct1  [2][0] = "bench";
			correct1  [2][1] = "draft";
			correct1  [2][2] = "start";
			correct1  [2][3] = "trade";
						
			correct1  [3][0] = "abyss";
			correct1  [3][1] = "fly";
			correct1  [3][2] = "matrix";
			correct1  [3][3] = "thing";

						System.out.println("  1  |  2  |  3  |  4 ");
						System.out.println("_____________________________________________________________");
						System.out.println(" A  |  " + correct1 [0][0] + " | " + correct1 [0][1] + " | " + correct1 [0][2] + " | " + correct1 [0][3] + " | " );
						System.out.println(" B  |  " + correct1 [1][0] + "  | " + correct1 [1][1] + " | " + correct1 [1][2] + " | " + correct1 [1][3] + " | " );
						System.out.println(" C  |  " + correct1 [2][0] + " | " + correct1 [2][1] + " | " + correct1 [2][2] + " | " + correct1 [2][3] + " | " );
						System.out.println(" D  |  " + correct1 [3][0] + " | " + correct1 [3][1] + " | " + correct1 [3][2] + " | " + correct1 [3][3] + " | " );
						System.out.println("____________________________________________________________");
						
						ArrayList<String> correct = new ArrayList<>(); // has stuff from correct matrix
						ArrayList<String> sortedBoard = new ArrayList<>();// is the sorted items in list form 
						
						for (int r = 0; r < correct1.length; r++)
							{
								for (int c = 0; c < correct1[0].length; c++ )
									{
										correct.add(correct1[r][c]);
									}
							}
						
						Collections.sort(correct);
						correct = sortedBoard; 
						
								sortedBoard1.add(correct.get(0));
								sortedBoard1.add(correct.get(1));
								sortedBoard1.add(correct.get(2));
								sortedBoard1.add(correct.get(3));
								
								sortedBoard2.add(correct.get(4));
								sortedBoard2.add(correct.get(5));
								sortedBoard2.add(correct.get(6));
								sortedBoard2.add(correct.get(7));
								
								sortedBoard3.add(correct.get(8));
								sortedBoard3.add(correct.get(9));
								sortedBoard3.add(correct.get(10));
								sortedBoard3.add(correct.get(11));
								
								sortedBoard4.add(correct.get(12));
								sortedBoard4.add(correct.get(13));
								sortedBoard4.add(correct.get(14));
								sortedBoard4.add(correct.get(15));
								
			
			ArrayList<String> userGuessList = new ArrayList<>();
			ArrayList<String> userGuessListSorted = new ArrayList<>();
			
			ArrayList<String> user1RowGuess = new ArrayList<>();
			ArrayList<String> user2RowGuess = new ArrayList<>();
			ArrayList<String> user3RowGuess = new ArrayList<>();
			ArrayList<String> user4RowGuess = new ArrayList<>();
			
			if (userGuess.equals("shuffle"))
				{
					Board.shuffleBoard1();
				}
			else if(userGuess.equals("answer"))
				{
					System.out.println(sortedBoard);
				}
			else if (mistakes < 4)
				{
					userGuessList.add(userGuess);
									
					Collections.sort(userGuessList);
					
					if (userGuessList == sortedBoard)
						{
							System.out.println("You got it! Congrats!");
						}
					else 
						{
							for (int i = 0; i <= 4; i++)
								{
									user1RowGuess.add(userGuessList.get(0));
									user1RowGuess.add(userGuessList.get(1));
									user1RowGuess.add(userGuessList.get(2));
									user1RowGuess.add(userGuessList.get(3));
									
									if (user1RowGuess == sortedBoard1)
										{
											System.out.println("That's right! The theme is " + areaTheme);
										}
									else
										{
											mistakes++;
											System.out.println("That's not right. You have made " + mistakes);
										}
								}
							
							for (int i = 0; i <= 4; i++)
								{
							user2RowGuess.add(userGuessList.get(4));
							user2RowGuess.add(userGuessList.get(5));
							user2RowGuess.add(userGuessList.get(6));
							user2RowGuess.add(userGuessList.get(7));
							
							if(user2RowGuess == sortedBoard2)
								{
									System.out.println("That's right! The theme is " + significanceTheme);
								}
							else
								{
									mistakes++;
									System.out.println("That's not right. You have made " + mistakes);
								}
								}
							
							for (int i = 0; i <= 4; i++)
								{
							user3RowGuess.add(userGuessList.get(8));
							user3RowGuess.add(userGuessList.get(9));
							user3RowGuess.add(userGuessList.get(10));
							user3RowGuess.add(userGuessList.get(11));
							
							if(user3RowGuess == sortedBoard3)
								{
									System.out.println("That's right! The theme is " + actionsTheme);
								}
							else
								{
									mistakes++;
									System.out.println("That's not right. You have made " + mistakes);
								}
								}
							
							for (int i = 0; i <= 4; i++)
								{
							user4RowGuess.add(userGuessList.get(12));
							user4RowGuess.add(userGuessList.get(13));
							user4RowGuess.add(userGuessList.get(14));
							user4RowGuess.add(userGuessList.get(15));

							if(user4RowGuess == sortedBoard4)
								{
									System.out.println("That's right! The theme is " + scifiTheme);
								}
							else
								{
									mistakes++;
									System.out.println("That's not right. You have made " + mistakes);
								}
							}
							
						}
				}
				
				
				
				
		}
		
		

	}
