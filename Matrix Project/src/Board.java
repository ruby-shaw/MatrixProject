import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

public class Board
	{
		public static void makeBoard1()
		{
			String [] [] board1 = new String [4][4];
			
			board1  [0][0] = "Import";
			board1  [0][1] = "Thing";
			board1  [0][2] = "Gravity";
			board1  [0][3] = "Start";
			
			board1  [1][0] = "Bank";
			board1  [1][1] = "Trade";
			board1  [1][2] = "Matrix";
			board1  [1][3] = "Dune";
			
			board1  [2][0] = "Weight";
			board1  [2][1] = "Abyss";
			board1  [2][2] = "Draft";
			board1  [2][3] = "Mound";
			
			board1  [3][0] = "Hill";
			board1  [3][1] = "Bench";
			board1  [3][2] = "Fly";
			board1  [3][3] = "Substance";

			
			
			System.out.println("         1    |    2    |    3    |    4   ");
			System.out.println("____________________________________________");
			System.out.println(" A  |  " + board1 [0][0] + " | " + board1 [0][1] + " | " + board1 [0][2] + " | " + board1 [0][3] + " | " );
			System.out.println(" B  |  " + board1 [1][0] + " | " + board1 [1][1] + " | " + board1 [1][2] + " | " + board1 [1][3] + " | " );
			System.out.println(" C  |  " + board1 [2][0] + " | " + board1 [2][1] + " | " + board1 [2][2] + " | " + board1 [2][3] + " | " );
			System.out.println(" D  |  " + board1 [3][0] + " | " + board1 [3][1] + " | " + board1 [3][2] + " | " + board1 [3][3] + " | " );
			System.out.println("____________________________________________");
			
			
		}
		
		public static void shuffleBoard1()
			{
				String [] [] board1 = new String [4][4]; 
				
				board1  [0][0] = "Import";
				board1  [0][1] = "Thing";
				board1  [0][2] = "Gravity";
				board1  [0][3] = "Start";
				
				board1  [1][0] = "Bank";
				board1  [1][1] = "Trade";
				board1  [1][2] = "Matrix";
				board1  [1][3] = "Dune";
				
				board1  [2][0] = "Weight";
				board1  [2][1] = "Abyss";
				board1  [2][2] = "Draft";
				board1  [2][3] = "Mound";
				
				board1  [3][0] = "Hill";
				board1  [3][1] = "Bench";
				board1  [3][2] = "Fly";
				board1  [3][3] = "Substance";

				
				
				System.out.println("         1    |    2    |    3    |    4   ");
				System.out.println("____________________________________________");
				System.out.println(" A  |  " + board1 [0][0] + " | " + board1 [0][1] + " | " + board1 [0][2] + " | " + board1 [0][3] + " | " );
				System.out.println(" B  |  " + board1 [1][0] + " | " + board1 [1][1] + " | " + board1 [1][2] + " | " + board1 [1][3] + " | " );
				System.out.println(" C  |  " + board1 [2][0] + " | " + board1 [2][1] + " | " + board1 [2][2] + " | " + board1 [2][3] + " | " );
				System.out.println(" D  |  " + board1 [3][0] + " | " + board1 [3][1] + " | " + board1 [3][2] + " | " + board1 [3][3] + " | " );
				System.out.println("____________________________________________");
				
				 ArrayList<String> shuffled = new ArrayList<>();
				 ArrayList<String> shuffledBoard = new ArrayList<>();
				
				//convert matrix into an array
				
				for (int row = 0; row < board1.length; row ++)
					{
						for (int col = 0; col < board1[0].length; col ++)
							{
									shuffled.add( board1[row][col]);
							}
					}
				
				Collections.shuffle(shuffled);
				shuffledBoard = shuffled; 
				
				for (int r = 0; r < 4; r++)
					{
						for (int c = 0; c < 4; c++)
							{
								board1[r][c] = shuffledBoard.get(r * 4 + c);
							}
					}
			
				System.out.println("         1    |    2    |    3    |    4   ");
				System.out.println("____________________________________________");
				System.out.println(" A  |  " + board1 [0][0] + " | " + board1 [0][1] + " | " + board1 [0][2] + " | " + board1 [0][3] + " | " );
				System.out.println(" B  |  " + board1 [1][0] + " | " + board1 [1][1] + " | " + board1 [1][2] + " | " + board1 [1][3] + " | " );
				System.out.println(" C  |  " + board1 [2][0] + " | " + board1 [2][1] + " | " + board1 [2][2] + " | " + board1 [2][3] + " | " );
				System.out.println(" D  |  " + board1 [3][0] + " | " + board1 [3][1] + " | " + board1 [3][2] + " | " + board1 [3][3] + " | " );
				System.out.println("____________________________________________");
				
				PlayConnections.activePlay();
			}
		
		public static void correctBoard1()
			{
				
	String [] [] correct1 = new String [4][4];

	String areaTheme = "Theme : Area of high ground";
				
	correct1  [0][0] = "bank";
	correct1  [0][1] = "dune";
	correct1  [0][2] = "hill";
	correct1  [0][3] = "mound";

	String significanceTheme = "Theme : Significance";
				
	correct1  [1][0] = "gravity";
	correct1  [1][1] = "import";
	correct1  [1][2] = "substance";
	correct1  [1][3] = "weight";

	String actionsTheme = "Theme : Actions in fantasy sports";
				
	correct1  [2][0] = "bench";
	correct1  [2][1] = "draft";
	correct1  [2][2] = "start";
	correct1  [2][3] = "trade";

	String scifiTheme = "Theme : Sci-fi movies with 'The'";
				
	correct1  [3][0] = "abyss";
	correct1  [3][1] = "fly";
	correct1  [3][2] = "matrix";
	correct1  [3][3] = "thing";

				
				
				System.out.println("  1  |  2  |  3  |  4 ");
				System.out.println("__________________________________________________________________________________________________________");
				System.out.println(" A  |  " + correct1 [0][0] + " | " + correct1 [0][1] + " | " + correct1 [0][2] + " | " + correct1 [0][3] + " | " );
				System.out.println(" B  |  " + correct1 [1][0] + "  | " + correct1 [1][1] + " | " + correct1 [1][2] + " | " + correct1 [1][3] + " | " );
				System.out.println(" C  |  " + correct1 [2][0] + " | " + correct1 [2][1] + " | " + correct1 [2][2] + " | " + correct1 [2][3] + " | " );
				System.out.println(" D  |  " + correct1 [3][0] + " | " + correct1 [3][1] + " | " + correct1 [3][2] + " | " + correct1 [3][3] + " | " );
				System.out.println("____________________________________________________________");
				
				
				
				// take userInput and compare to correct answer
				// counter for mistakes
				// compare by row
				//end game if its not right
				// figure out how to call on variables in different classes?
				
				
				Scanner userInput = new Scanner(System.in);
				String userGuess = userInput.nextLine();
				userGuess.toLowerCase();
				
				ArrayList<String> correct = new ArrayList<>();
				ArrayList<String> sortedBoard = new ArrayList<>();
				
				ArrayList<String> sortedBoard1 = new ArrayList<>();
				ArrayList<String> sortedBoard2 = new ArrayList<>();
				ArrayList<String> sortedBoard3 = new ArrayList<>();
				ArrayList<String> sortedBoard4 = new ArrayList<>();
				
				
				for (int r = 0; r < correct1.length; r++)
					{
						for (int c = 0; c < correct1[0].length; c++ )
							{
								correct.add(correct1[r][c]);
							}
					}
				
				
				Collections.sort(correct);
				
//				correct, Comparator.comparingInt(String::length)
				correct = sortedBoard; 
				
				System.out.println(sortedBoard);
				
				
//				for (int i =0; i <= 4; i++)
//					{
////						userBoard.add(userGuess);
//					}
//				
//				for (int r = 0; r < 4; r++)
//					{
//						for (int c = 0; c < 4; c++)
//							{
////								board1[r][c] = shuffledBoard.get(r * 4 + c);
//							}
//					}
				
			}
		
		public static void makeBoard2()
		{
			
String [] [] board2 = new String [4][4];
			
			board2  [0][0] = "Dorothy";
			board2  [0][1] = "Roam";
			board2  [0][2] = "Rose";
			board2  [0][3] = "Steam";
			
			board2  [1][0] = "Vanilla";
			board2  [1][1] = "Sophia";
			board2  [1][2] = "Shaggy";
			board2  [1][3] = "Blanch";
			
			board2  [2][0] = "Charlie";
			board2  [2][1] = "Boil";
			board2  [2][2] = "Keto";
			board2  [2][3] = "Musk";
			
			board2  [3][0] = "Ambergris";
			board2  [3][1] = "Wallace";
			board2  [3][2] = "Soul";
			board2  [3][3] = "Poach";

			
			
			System.out.println("  1  |  2  |  3  |  4 ");
			System.out.println("________________");
			System.out.println(" A  |  " + board2 [0][0] + " | " + board2 [0][1] + " | " + board2 [0][2] + " | " + board2 [0][3] + " | " );
			System.out.println(" B  |  " + board2 [1][0] + " | " + board2 [1][1] + " | " + board2 [1][2] + " | " + board2 [1][3] + " | " );
			System.out.println(" C  |  " + board2 [2][0] + " | " + board2 [2][1] + " | " + board2 [2][2] + " | " + board2 [2][3] + " | " );
			System.out.println(" D  |  " + board2 [3][0] + " | " + board2 [3][1] + " | " + board2 [3][2] + " | " + board2 [3][3] + " | " );
			System.out.println("________________");
			
		}
		
		public static void correctBoard2()
		{
			
			String [] [] correctBoard2 = new String [4][4];

			String cookTheme = "Theme : Cook with heat and water";
						
			correctBoard2  [0][0] = "Blanch";
			correctBoard2  [0][1] = "Boil";
			correctBoard2  [0][2] = "Poach";
			correctBoard2  [0][3] = "Steam";

			String perfumeTheme = "Theme : Common perfume ingredients";
						
			correctBoard2  [1][0] = "Amergris";
			correctBoard2  [1][1] = "Musk";
			correctBoard2  [1][2] = "Rose";
			correctBoard2  [1][3] = "Vanilla";

			String charactersTheme = "Theme : Characters with pet dogs";
						
			correctBoard2  [2][0] = "Charlie";
			correctBoard2  [2][1] = "Dorothy";
			correctBoard2  [2][2] = "Shaggy";
			correctBoard2  [2][3] = "Wallace";

			String capitalTheme = "Theme : Capital city homophones";
						
			correctBoard2  [3][0] = "Keto";
			correctBoard2  [3][1] = "Roam";
			correctBoard2  [3][2] = "Sophia";
			correctBoard2  [3][3] = "Soul";

						
						
						System.out.println("  1  |  2  |  3  |  4 ");
						System.out.println("________________");
						System.out.println(" A  |  " + correctBoard2 [0][0] + " | " + correctBoard2 [0][1] + " | " + correctBoard2 [0][2] + " | " + correctBoard2 [0][3] + " | " );
						System.out.println(" B  |  " + correctBoard2 [1][0] + " | " + correctBoard2 [1][1] + " | " + correctBoard2 [1][2] + " | " + correctBoard2 [1][3] + " | " );
						System.out.println(" C  |  " + correctBoard2 [2][0] + " | " + correctBoard2 [2][1] + " | " + correctBoard2 [2][2] + " | " + correctBoard2 [2][3] + " | " );
						System.out.println(" D  |  " + correctBoard2 [3][0] + " | " + correctBoard2 [3][1] + " | " + correctBoard2 [3][2] + " | " + correctBoard2 [3][3] + " | " );
						System.out.println("________________");
		}
	}
