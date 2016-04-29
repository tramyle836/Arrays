import java.util.Scanner;

public class ArrayTwo
{
	static Scanner userInput = new Scanner(System.in);
	static int randomNumbers;
	public static void main(String[] args) 
		{
		printNumber();
		monthNumbers();
		pickingCards ();
		}
	public static void printNumber()
		{
			int [] randomNumbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
				{
					for(int i = 0; i < 10; i++)
						{
							System.out.println(randomNumbers [i] * randomNumbers[i]);
							
						}
				}
		}
	public static void monthNumbers()
		{
			System.out.println("Plug in a number of your favorite month of the year!");
			
			String [] monthNames = new String [12];
			
				monthNames[0] = "January";
				monthNames[1] = "February";
				monthNames[2] = "March";
				monthNames[3] = "April";
				monthNames[4] = "May";
				monthNames[5] = "June";
				monthNames[6] = "July";
				monthNames[7] = "August";
				monthNames[8] = "September";
				monthNames[9] = "October";
				monthNames[10] = "November";
				monthNames[11] = "December";
				
					int month = userInput.nextInt();
					
					month = month - 1;
					
						System.out.println(monthNames[month]);
		}
	public static void pickingCards ()
		{
			String [] cards = new String [4];
			cards [0] = "hearts";
			cards [1] = "spades"; 
			cards [2] = "clubs";
			cards [3] = "diamonds";
			
			String [] ranks = new String [4];
			ranks [0] = "king";
			ranks [1] = "queen"; 
			ranks [2] = "ace";
			ranks [3] = "jack";
			
			int randomNumber=(int)(Math.random()*4);
			int random=(int)(Math.random()*4);

			System.out.println(ranks[random]+" of " + cards[randomNumber]);
		}			
}
