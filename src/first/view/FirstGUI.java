package first.view;

import javax.swing.JOptionPane;
import first.model.Thingy;
import first.model.Friend;
public class FirstGUI
{
	private Thingy myGUIThingy;
	private Friend jordanFriend;
	private Friend shivaFriend;
	private Friend fernandoFriend;
	private Friend meFriend;

	public FirstGUI()
	{
		setMyGUIThingy(new Thingy());
		jordanFriend = new Friend("Jordan", 17, "weird", false, 156.9, "dance");
		shivaFriend = new Friend("Shiva", 17, "fun", false, 130.34, "play volleyball");
		fernandoFriend = new Friend("Fernando", 17, "cool", false, 162.54, "work with computers");
		meFriend = new Friend("Josh", 16, "tired", false, 158.64, "play tennis");
	}
	
	public void start()
	{
		meetMyFriends();
	interact();
		meetTheGUIThingy();
		checkWrapper();
	JOptionPane.showMessageDialog(null, "silly");
	JOptionPane.showMessageDialog(null, "silly");
	JOptionPane.showMessageDialog(null, "silly");
		JOptionPane.showMessageDialog(null, "silly");
		JOptionPane.showMessageDialog(null, "silly");
	}
	
	private void meetMyFriends()
	{
		//Fernando Friend
		String answer;
		JOptionPane.showMessageDialog(null,  "Hey! My name is Josh");
		JOptionPane.showMessageDialog(null,  " I was want to get to know you better.");
		answer = JOptionPane.showInputDialog(null, " What's your name? ");
		JOptionPane.showMessageDialog(null,  " Well its nice to meet you " + answer );
		JOptionPane.showMessageDialog(null, "My first friend's name is " + fernandoFriend.getName());
		String answerAge;
		answerAge = JOptionPane.showInputDialog(null, "What is your age?");
		int testAge = Integer.parseInt(answerAge);
		testAge = Integer.parseInt(answerAge);
		JOptionPane.showMessageDialog(null, "Oh so next year you will be " + (testAge + 1) + " years old! My friend Fernando's age is " + fernandoFriend.getAge());
		JOptionPane.showInputDialog(null, "What is your personality like?");
		JOptionPane.showMessageDialog(null, "Oh cool! My friend Fernando's personality is " + fernandoFriend.getPersonality());
		String answerImaginary;
		answerImaginary = JOptionPane.showInputDialog(null, "Are you imaginary?");
		if(answerImaginary.equalsIgnoreCase("Yes"))
		{
			JOptionPane.showMessageDialog(null,  "Okay you can be imaginary, my friend Fernando is " + fernandoFriend.getIsImaginary());
		}
		else if(answerImaginary.equalsIgnoreCase("No"))
		{
			JOptionPane.showMessageDialog(null, "Okay you are not imaginary, but guess what, my friend Fernando is " + fernandoFriend.getIsImaginary());
		}
		JOptionPane.showInputDialog(null, "How much do you weigh?");
		JOptionPane.showMessageDialog(null, "Nice, my friend Fernando weighs " + fernandoFriend.getWeight());
		JOptionPane.showInputDialog(null, "What is one of your favorite hobbies?");
		JOptionPane.showMessageDialog(null, "Oh cool I love doing that! My friend Fernando likes to " + fernandoFriend.getHobby());
		
		//Shiva Friend
		String answerName;
		JOptionPane.showMessageDialog(null,  "Hey! My name is Josh");
		JOptionPane.showMessageDialog(null,  " I want to get to know you better.");
		answerName = JOptionPane.showInputDialog(null, " What's your name? ");
		JOptionPane.showMessageDialog(null,  " Well its nice to meet you " + answerName );
		JOptionPane.showMessageDialog(null, "My second friend's name is " + shivaFriend.getName());
		String answerAge1;
		answerAge1 = JOptionPane.showInputDialog(null, "What is your age?");
		int testAge1 = Integer.parseInt(answerAge1);
		testAge1 = Integer.parseInt(answerAge1);
		JOptionPane.showMessageDialog(null, "Oh so next year you will be " + (testAge1 + 1) + " years old! My friend Shiva's age is " + shivaFriend.getAge());
		JOptionPane.showInputDialog(null, "What is your personality like?");
		JOptionPane.showMessageDialog(null, "Oh cool! My friend Shiva's personality is " + shivaFriend.getPersonality());
		String answerImaginary1;
		answerImaginary1 = JOptionPane.showInputDialog(null, "Are you imaginary?");
		if(answerImaginary1.equalsIgnoreCase("Yes"))
		{
			JOptionPane.showMessageDialog(null,  "Okay you can be imaginary, my friend Shiva is " + shivaFriend.getIsImaginary());
		}
		else if(answerImaginary1.equalsIgnoreCase("No"))
		{
			JOptionPane.showMessageDialog(null, "Okay you are not imaginary, but guess what, my friend Shiva is " + shivaFriend.getIsImaginary());
		}
		JOptionPane.showInputDialog(null, "How much do you weigh?");
		JOptionPane.showMessageDialog(null, "Nice, my friend Shiva weighs " + shivaFriend.getWeight());
		JOptionPane.showInputDialog(null, "What is one of your favorite hobbies?");
		JOptionPane.showMessageDialog(null, "Oh cool I love doing that! My friend Shiva likes to " + shivaFriend.getHobby());
	
		JOptionPane.showMessageDialog(null,  "Hey! My name is Josh");
		JOptionPane.showMessageDialog(null,  " I was want to get to know you better.");
		JOptionPane.showInputDialog(null, " What's your name? ");
		JOptionPane.showMessageDialog(null,  " Well its nice to meet you " + answer );
		JOptionPane.showMessageDialog(null, "My third friend's name is " + jordanFriend.getName());
		String answerAge2;
		answerAge2 = JOptionPane.showInputDialog(null, "What is your age?");
		int testAge2 = Integer.parseInt(answerAge2);
		testAge2 = Integer.parseInt(answerAge2);
		JOptionPane.showMessageDialog(null, "Oh so next year you will be " + (testAge2 + 1) + " years old! My friend Jordan's age is " + jordanFriend.getAge());
		JOptionPane.showInputDialog(null, "What is your personality like?");
		JOptionPane.showMessageDialog(null, "Oh cool! My friend Jordan's personality is " + jordanFriend.getPersonality());
		String answerImaginary2;
		answerImaginary2 = JOptionPane.showInputDialog(null, "Are you imaginary?");
		if(answerImaginary2.equalsIgnoreCase("Yes"))
		{
			JOptionPane.showMessageDialog(null,  "Okay you can be imaginary, my friend Jordan is " + jordanFriend.getIsImaginary());
		}
		else if(answerImaginary2.equalsIgnoreCase("No"))
		{
			JOptionPane.showMessageDialog(null, "Okay you are not imaginary, but guess what, my friend Jordan is " + jordanFriend.getIsImaginary());
		}
		JOptionPane.showInputDialog(null, "How much do you weigh?");
		JOptionPane.showMessageDialog(null, "Nice, my friend Jordan weighs " + jordanFriend.getWeight());
		JOptionPane.showInputDialog(null, "What is one of your favorite hobbies?");
		JOptionPane.showMessageDialog(null, "Oh cool I love doing that! My friend Jordan likes to " + jordanFriend.getHobby());

		JOptionPane.showMessageDialog(null,  "Hey! My name is Josh");
		JOptionPane.showMessageDialog(null,  " I was want to get to know you better.");
		JOptionPane.showInputDialog(null, " What's your name? ");
		JOptionPane.showMessageDialog(null,  " Well its nice to meet you " + answer );
		JOptionPane.showMessageDialog(null, "My last friend's name is " + meFriend.getName());
		String answerAge3;
		answerAge3 = JOptionPane.showInputDialog(null, "What is your age?");
		int testAge3 = Integer.parseInt(answerAge3);
		testAge3 = Integer.parseInt(answerAge3);
		JOptionPane.showMessageDialog(null, "Oh so next year you will be " + (testAge3 + 1) + " years old! My friend Josh's age is " + meFriend.getAge());
		JOptionPane.showInputDialog(null, "What is your personality like?");
		JOptionPane.showMessageDialog(null, "Oh cool! My friend Josh's personality is " + meFriend.getPersonality());
		answerImaginary = JOptionPane.showInputDialog(null, "Are you imaginary?");
		if(answerImaginary.equalsIgnoreCase("Yes"))
		{
			JOptionPane.showMessageDialog(null,  "Okay you can be imaginary, my friend Josh is " + meFriend.getIsImaginary());
		}
		else if(answerImaginary.equalsIgnoreCase("No"))
		{
			JOptionPane.showMessageDialog(null, "Okay you are not imaginary, but guess what, my friend Josh is " + meFriend.getIsImaginary());
		}
		JOptionPane.showInputDialog(null, "How much do you weigh?");
		JOptionPane.showMessageDialog(null, "Nice, my friend Josh weighs " + meFriend.getWeight());
		JOptionPane.showInputDialog(null, "What is one of your favorite hobbies?");
		JOptionPane.showMessageDialog(null, "Oh cool I love doing that! My friend Josh likes to " + meFriend.getHobby());
		JOptionPane.showMessageDialog(null, "Thank you for letting me get to know you! I will let you go now, bye!");
		
		
		
		
	}
	private void interact()
	{
		String answer;
			JOptionPane.showMessageDialog(null, "Hey let's talk");
		//If you press the Red X or cancel on the input dialog you will return a null value
		answer = JOptionPane.showInputDialog("What's your name?");
		JOptionPane.showMessageDialog(null,  "Hey " + answer + " wassup man!");
		answer = JOptionPane.showInputDialog("What's your favorite food?");
		JOptionPane.showMessageDialog(null, "Oh cool, "+ answer + "? I personally don't like food.");
	}
	
	private void meetTheGUIThingy()
	{
		String answer;
		String answer2;
		String answer3;
		String answer4;
		JOptionPane.showMessageDialog(null, "Let's meet our Thingy object");
		answer = JOptionPane.showInputDialog("Our Thingy object has a name, it is Jared. What's your name?");
		JOptionPane.showMessageDialog(null, "Oh cool my friends name is "+ answer);
		answer2 = JOptionPane.showInputDialog("What do you want to change my name to be?");
		answer3 = JOptionPane.showInputDialog(null, "Really my name should be "+ answer2 + "? Type yes or no.");
		if(answer3.equalsIgnoreCase("yes"))
		{
			JOptionPane.showMessageDialog(null, "Okay my name is going to be " + answer2 + " from now on.");
		}
		else if(answer3.equalsIgnoreCase("no"))
		{
			answer4 = JOptionPane.showInputDialog(null, "Okay then what do you want my name to be?");
			JOptionPane.showMessageDialog(null, "Okay my name is going to be " + answer4 + " from now on.");
		}
		else
			
		{
			JOptionPane.showMessageDialog(null, "I do not like that name, I think it is silly");
		}
	}
	
	private void checkWrapper()
	{
		int age;
		String answer;	
		JOptionPane.showMessageDialog(null, "Let's meet our Thingy object");
		answer = JOptionPane.showInputDialog("How old are you?");
		age = Integer.parseInt(answer);
		//Look in the Integer class to read an int from a String parameter.
		
		JOptionPane.showMessageDialog(null, "So you are " + age + " years old? Next year you will be " + (age + 1) + " years old!");
	}

	public Thingy getMyGUIThingy()
	{
		return myGUIThingy;
	}

	public void setMyGUIThingy(Thingy myGUIThingy)
	{
		this.myGUIThingy = myGUIThingy;
	}

	
}
