
public class twoArrays

	{
		static int sum, numberLine;
		public static void main(String[] args)
		{
			columnNumbers ();
			mullenHigh ();
			trackNumbers ();
		}
			public static void columnNumbers()
			{
				int columns[][] = new int [3][2];
				columns [0][0] = 10;
				columns [0][1] = 20;
				columns [1][0] = 30;
				columns [1][1] = 40;
				columns [2][0] = 50;
				columns [2][1] = 60;

				
					for(int i = 0; i < 1; i++)
						{
							for (int x = 0; x < 1; x++) 
								{
									System.out.print(columns [0][0]+ "   ");
									System.out.println(columns[0][1]);
									System.out.print(columns[1][0]+ "   ");
									System.out.println(columns[1][1]);
									System.out.print(columns[2][0]+ "   ");
									System.out.println(columns[2][1]);
									System.out.println(columns[2][1]);
								}
						}
			}
			public static void mullenHigh ()
			{
				String letters [][] = new String [4][3];
				
				for(int i = 0; i < 4; i++)
					{
						for (int x = 0; x < 3; x++) 
							{
								letters[i][x]="MHS";
							}	
					}
							
				for(int i = 0; i < 4; i++)
							{
								for (int x = 0; x < 3; x++)
									{
										System.out.print(letters[i][x]+"   ");
									}
								System.out.println();
							}
			}
			public static void trackNumbers ()
			{
				int numberLine[][] = new int [3][3];
				int counter = 1;
				int line = 0;
				numberLine [0][0] = 1;
			
					for(int i = 0; i < 3; i++)
						{
							for (int x = 0; x < 3; x++) 
								{
									numberLine [i][x] = counter;
									System.out.print(numberLine[i][x] + "    ");
									counter = counter + 1;
								}
									System.out.println();
						}
			
				
				int sum = (numberLine[0][0]) + (numberLine[0][2]) + (numberLine[2][0]) + (numberLine[2][2]);
				
					System.out.println(sum);	
			}
		
	}
	
