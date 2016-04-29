import java.util.Scanner;
public class ArrayOne
{
	static Scanner userInput = new Scanner(System.in);
	static int randomNumbers;
	static double average;
	static String listPeople; 
	public static void main(String[] args) 
		{
		printElements();
		printNumber();
		verticalNumbers();
		evaluateAverage();
		}
	public static void printElements()
		{
		String [] listPeople = {"Ashley", "Charlie", "Talia", "Ron"};
				System.out.println(listPeople[2]);
		}
	public static void printNumber()
		{
		int [] randomNumbers = {1, 6, 8, 20, 122};
				System.out.println(randomNumbers [4]);
		}
	public static void verticalNumbers()
		{
		int [] randomNumbers = {1, 6, 8, 20, 122};
				for (int i = 0; i<randomNumbers.length; i++)
			{
				System.out.println(randomNumbers[i] = i);
			}
		}
	public static void evaluateAverage()
	{
		int [] randomNumbers = {1, 6, 8, 20, 122};
				int sum = 0;
				int average = 0; 
				for (int i = 1; i<randomNumbers.length; i++)
			{
				sum = sum + randomNumbers[i];
			}
				average = sum/randomNumbers.length;
				System.out.println(average);
		}
}

