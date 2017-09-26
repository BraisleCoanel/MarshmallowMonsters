package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;

import monster.view.MonsterDisplay;

public class MonsterController
{
	private MonsterDisplay popup;

	public MonsterController()
	{
		popup = new MonsterDisplay();
	}
	
	public void start()
	{
		int count = 0;
		while(count < 10)
		{
			popup.displayText("am I not friggen coolio!");
//			count+=2;
		}
		
		for(int loop = 0; loop < 10; loop += 1)
		{
			popup.displayText("Thiss a loop # " + (loop + 1) + " of ten!!1!!1");
		}
		
		
		
		
		MarshmallowMonster basic = new MarshmallowMonster();
		// System.out.println(basic);
		popup.displayText(basic.toString());
		MarshmallowMonster endon = new MarshmallowMonster("Endon", 3, 2, .23, true);
		// System.out.println(endon);
		popup.displayText(endon.toString());
		// System.out.println("I am hungry, I'm go eat one of Endon's arms");
		popup.displayText("I am hungry, I'm go eat one of Endon's arms");
		endon.setArmCount(endon.getArmCount() - 1);
		// System.out.println(endon);
		popup.displayText(endon.toString());

		interactWithMonster(endon);

	}

	private void interactWithMonster(MarshmallowMonster currentMonster)
	{
		Scanner myScanner = new Scanner(System.in);
		// System.out.println(currentMonster.getName() + " wants to know how many eyes you want to eat, type how many you want to eat");
		int consumed = 0;
		String response = popup.getResponse(currentMonster.getName() + " wants to know how many eyes you want to eat, type how many you want to eat");
		
		while(!isValidInteger(response))
		{
			popup.displayText("Type in a better answer boo");
			response = popup.getResponse("Type in an integer value");
		}
		
		
//		if (isValidInteger(response))
//		{
			consumed = Integer.parseInt(response);
//		}

		// int consumed = myScanner.nextInt();
		currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
		System.out.println(currentMonster);

		System.out.println("How many arms do you want to eat? I have " + currentMonster.getArmCount() + " right now!");
		// consumed = myScanner.nextInt();
		int armEat = myScanner.nextInt();

		if (armEat == 0)
		{
			System.out.println("Not hungry? Why? Don't you want to eat me?Aw well, looks like you get to starve.");
		}
		else if (armEat < 0)
		{
			System.out.println("I guess physics and math is hard for you, huh?");
		}
		else if (armEat > currentMonster.getArmCount())
		{
			System.out.println("You can't eat more arms than I have!");
		}
		else
		{
			System.out.println("Ok, now I have " + currentMonster.getArmCount());
		}

		System.out.println("I have " + currentMonster.getTentacleAmount() + " right now, how many do you want?");
		// consumed = myScanner.nextInt();
		double tentacleEat = 0.0;
		String tentacleResponse = popup.getResponse("");
		if(isValidDouble(tentacleResponse))
		{
			tentacleEat = Double.parseDouble(tentacleResponse);
		}

		if (tentacleEat == 0)
		{
			System.out.println("Fine, no delicious tentacles for you.");
		}
		else if (tentacleEat < 0)
		{
			System.out.println("You can't eat negative tentacles silly");
		}
		else if (tentacleEat == currentMonster.getTentacleAmount())
		{
			System.out.println("YOU ATE ALL OF MY TENTACLES!!!");
		}
		else if (tentacleEat > currentMonster.getTentacleAmount())
		{
			System.out.println("If I had that many tentacles I would've told you");
		}
		else
		{
			currentMonster.setTentacleAmount(currentMonster.getTentacleAmount() - tentacleEat);
			System.out.println("Aight, because you ate " + tentacleEat + " I now have " + currentMonster.getTentacleAmount() + " tentacles!");
		}

		popup.displayText("Hi there ready to play???");
		String answer = popup.getResponse("What is the air spped of a cocnut laden swallow?");
		System.out.println(answer);

		myScanner.close();
	}

	// Helper Methods
	private boolean isValidInteger(String sample)
	{
		boolean valid = false;

		try
		{
			Integer.parseInt(sample);
			valid = true;
		}
		catch (NumberFormatException error)
		{
			popup.displayText("You need to input an int, " + sample + " is not valid.");
		}
		return valid;
	}
	private boolean isValidDouble(String sampleDouble)
	{
		boolean valid = false;
		
		try
		{
			Double.parseDouble(sampleDouble);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("You need to type in a double -" + sampleDouble + " is not a valid answer.");
		}
		return valid;
	}
//	private boolean 
//
//	{
//		boolean valid = false;
//		
//		try
//		{
//			Boolean.parseBoolean(sampleBoolean);
//			valid = true;
//		}
//		catch(NumberFormatException error)
//		{
//			popup.displayText("Type ina boolean value, " + sampleBoolean + " does not count.");
//		}
//		return valid;
//	}



}
