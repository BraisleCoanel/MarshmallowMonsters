package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;
import monster.view.MonsterDisplay;


public class MonsterController
{

	public void start()
	{
		MarshmallowMonster basic = new MarshmallowMonster();
		System.out.println(basic);
		MarshmallowMonster endon = new MarshmallowMonster("Endon", 3, 2, 999999.999, true);
		System.out.println(endon); 
		System.out.println("I am hungry, I'm go eat one of Endon's arms");
		endon.setArmCount(endon.getArmCount() - 1);
		System.out.println(endon);
		
		interactWithMonster(endon);
		
	}
	
	private void interactWithMonster(MarshmallowMonster currentMonster)
	{
		Scanner myScanner = new Scanner(System.in);
		System.out.println(currentMonster.getName() + " wants to know how many eyes you want to eat, type how many you want to eat");
		int consumed = myScanner.nextInt();
		currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
		System.out.println(currentMonster);
		
		System.out.println("How many arms do you want to eat? I have " + currentMonster.getArmCount() + " right now!");
		//consumed = myScanner.nextInt();
		int armEat = myScanner.nextInt();
		
		if(armEat == 0)
		{
			System.out.println("Not hungry? Why? Don't you want to eat me?Aw well, looks like you get to starve.");
		}
		else if(armEat < 0)
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
		//consumed = myScanner.nextInt();
		double tentacleEat = myScanner.nextDouble();
		
		if(tentacleEat == 0)
		{
			System.out.println("Fine, no delicious tentacles for you.");
		}
		else if(tentacleEat < 0)
		{
			System.out.println("You can't eat negative tentacles silly");
		}
		else if(tentacleEat == currentMonster.getTentacleAmount())
		{
			System.out.println("YOU ATE ALL OF MY TENTACLES!!!");
		}
		else if(tentacleEat > currentMonster.getTentacleAmount())
		{
			System.out.println("If I had that many tentacles I would've told you");
		}
		else
		{
			currentMonster.setTentacleAmount(currentMonster.getTentacleAmount() - tentacleEat);
			System.out.println("Aight, because you ate " + tentacleEat + " I now have " + currentMonster.getTentacleAmount() + " tentacles!");
		}
		
//		popup.displayText("Hi there ready to play???");
//		String answer = popup.getResponse("What is the air spped of a cocnut laden swallow?");
//		System.out.println(answer);
		
		myScanner.close();
	}
}	