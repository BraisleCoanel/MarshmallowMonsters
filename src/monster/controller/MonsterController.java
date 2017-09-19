package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController
{

	public void start()
	{
		MarshmallowMonster basic = new MarshmallowMonster();
		System.out.println(basic);
		MarshmallowMonster endon = new MarshmallowMonster("Endon", 3, 2, .5, true);
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
		
		
		myScanner.close();
	}
}	