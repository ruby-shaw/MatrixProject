
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
		
		public static void shuffleBoard()
			{
				String [] [] board1 = new String [4][4]; 
				
				
				for (int r = 0; r < board1.length; r++)
					{
						for (int c = 0; c < board1[0].length; c++)
							{
								int row = (int)((Math.random( )*4 ) );
								int col = (int)((Math.random()*4) );
							}
					}
				
				
				
//				board1  [row][col] = "Import";
//				board1  [row][col] = "Thing";
//				board1  [row][col] = "Gravity";
//				board1  [row][col] = "Start";
//				
//				board1  [row][col] = "Bank";
//				board1  [row][col] = "Trade";
//				board1  [row][col] = "Matrix";
//				board1  [row][col] = "Dune";
//				
//				board1  [row][col] = "Weight";
//				board1  [row][col] = "Abyss";
//				board1  [row][col] = "Draft";
//				board1  [row][col] = "Mound";
//				
//				board1  [row][col] = "Hill";
//				board1   [row][col] = "Bench";
//				board1  [row][col] = "Fly";
//				board1  [row][col] = "Substance";
//				
//				System.out.println("         1    |    2    |    3    |    4   ");
//				System.out.println("____________________________________________");
//				System.out.println(" A  |  " + board1  [row][col] + " | " + board1  [row][col] + " | " +board1  [row][col] + " | " + board1  [row][col] + " | " );
//				System.out.println(" B  |  " + board1  [row][col] + " | " +board1  [row][col] + " | " +board1  [row][col] + " | " +board1  [row][col] + " | " );
//				System.out.println(" C  |  " + board1  [row][col] + " | " +board1  [row][col] + " | " +board1  [row][col] + " | " +board1  [row][col] + " | " );
//				System.out.println(" D  |  " +board1  [row][col]+ " | " +board1  [row][col] + " | " + board1  [row][col] + " | " +board1  [row][col] + " | " );
//				System.out.println("____________________________________________");
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
		
		public static void correctBoard1()
		{
			
String [] [] correctBoard1 = new String [4][4];

String areaTheme = "Theme : Area of high ground";
			
correctBoard1  [0][0] = "Bank";
correctBoard1  [0][1] = "Dune";
correctBoard1  [0][2] = "Hill";
correctBoard1  [0][3] = "Mound";

String significanceTheme = "Theme : Significance";
			
correctBoard1  [1][0] = "Gravity";
correctBoard1  [1][1] = "Import";
correctBoard1  [1][2] = "Substance";
correctBoard1  [1][3] = "Weight";

String actionsTheme = "Theme : Actions in fantasy sports";
			
correctBoard1  [2][0] = "Bench";
correctBoard1  [2][1] = "Draft";
correctBoard1  [2][2] = "Start";
correctBoard1  [2][3] = "Trade";

String scifiTheme = "Theme : Sci-fi movies with 'The'";
			
correctBoard1  [3][0] = "Abyss";
correctBoard1  [3][1] = "Fly";
correctBoard1  [3][2] = "Matrix";
correctBoard1  [3][3] = "Thing";

			
			
			System.out.println("  1  |  2  |  3  |  4 ");
			System.out.println("__________________________________________________________________________________________________________");
			System.out.println(" A  |  " + correctBoard1 [0][0] + " | " + correctBoard1 [0][1] + " | " + correctBoard1 [0][2] + " | " + correctBoard1 [0][3] + " | " );
			System.out.println(" B  |  " + correctBoard1 [1][0] + "    | " + correctBoard1 [1][1] + " | " + correctBoard1 [1][2] + " | " + correctBoard1 [1][3] + " | " );
			System.out.println(" C  |  " + correctBoard1 [2][0] + " | " + correctBoard1 [2][1] + " | " + correctBoard1 [2][2] + " | " + correctBoard1 [2][3] + " | " );
			System.out.println(" D  |  " + correctBoard1 [3][0] + " | " + correctBoard1 [3][1] + " | " + correctBoard1 [3][2] + " | " + correctBoard1 [3][3] + " | " );
			System.out.println("____________________________________________________________");
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
