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
		
		myScanner.close();
	}
}	