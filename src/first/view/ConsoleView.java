package first.view;

import first.model.Thingy;
import java.util.Scanner;

public class ConsoleView

{
	//Declare a Scanner object to use in the console.
	/**
	 * Declare a Thingy object for testing purposes
	 */
	private Thingy testThingy;
	
	private Scanner wordScanner;
	
	private Scanner wordScanner2;
	
	public ConsoleView()
	{
		wordScanner = new Scanner(System.in);
		testThingy = new Thingy();
	}
	
	{
		wordScanner2 = new Scanner(System.in);
	}
	
	public void start()
	{	
		meetTheThingy();
	   System.out.println("Computer: Ask me a yes or no question.");
	   getWords();
	   getWords2();
	}
	
	
	
	private void meetTheThingy()
	{
		System.out.println("My name is " + testThingy.getName());
		System.out.println("What do you want my name to be?");
		
		String newName = wordScanner.nextLine();
		
		System.out.print("Are you really sure my name should be: "+ newName);
		System.out.println(" :Type yes or no");

		String answer = wordScanner.nextLine();
		
		if (answer.equalsIgnoreCase("yes"))
			
		{
			System.out.println("I love my new name!");
			testThingy.setName(newName);
			System.out.println("My new name is: " + testThingy.getName());
			
		}
		else if (answer.equalsIgnoreCase("no"))
		{
		 System.out.println("I didn't like that name anyway.");
		 meetTheThingy();
		}
			else
		{
			System.out.println("Stop typing gibberish");
			meetTheThingy();
		}
	}
	
	public void getWords()	
	{
		String test = wordScanner.nextLine();
		System.out.print("you typed this to me: ");
		System.out.println(test);
	}
	public void getWords2()	
	{
		String test = wordScanner2.nextLine();
		System.out.print("you typed this to me: ");
		System.out.println(test);
	}

	public void show()
	{
		System.out.print("show this on my screen");
		System.out.println("show this on my screen too");
		System.out.println("I like apples");
		System.out.println("I like to play soccer");
		System.out.println("I like to watch TV");
	}

}
