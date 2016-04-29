import java.util.Scanner;
public class Practice
{
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) 
		{
			String letters [][] = new String [3][4];
			
			System.out.println("----------------------");
			for(int i = 0; i < 3; i++)
				{
					for (int x = 0; x < 4; x++) 
						{
							letters[i][x]="|" ;
						}	
					
				}
			
			for(int u = 0; u < 3; u++)
						{
							for (int p = 0; p < 4; p++)
								{
									System.out.print(letters[u][p]+"      ");
									
								}
							System.out.println();
						}
			System.out.println("----------------------");	
		}
}
