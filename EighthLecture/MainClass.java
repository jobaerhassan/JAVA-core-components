package EighthLecture;

import java.util.Scanner;

public class MainClass {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//-----------------------Learning Thread using Runnable Object.-------------------------------
		CustomRunnableObject firstObject= new CustomRunnableObject("FIRST",0);
		CustomRunnableObject secondObject= new CustomRunnableObject("SECOND",200);
		CustomRunnableObject thirdObject= new CustomRunnableObject("THIRD",10000);
		
		
		Thread firsThread = new Thread(firstObject);
		Thread secondThread=new Thread(secondObject);
		Thread thirdThread=new Thread(thirdObject);
		Thread fourthThread=new Thread(firstObject);
		
		
		//checking system running or not
		firsThread.start();secondThread.start();thirdThread.start();fourthThread.start();
		
		System.out.println("Please write a Command: ");
		String commandString = scanner.nextLine();
		while(!commandString.toLowerCase().equals("exit"))
		{
			if(commandString.equals("1")) {
				System.out.println("Counter in Thread 1:  "+ firstObject.getCounter());
//				threadStatus();
			}
			else if(commandString.equals("2"))
			{
				System.out.println("Counter in Thread 1:  "+ secondObject.getCounter());
//				threadStatus();
			}
			else if(commandString.equals("3"))
			{
				System.out.println("Counter in Thread 1:  "+ thirdObject.getCounter());
//				threadStatus();
			}
			else if(commandString.equals("4"))
			{
				System.out.println("Counter in Thread 1:  "+ firstObject.getCounter());
//				threadStatus();
			}
			else if(commandString.equals("1s"))
			{
				firsThread.interrupt();

				System.out.println("Thread 1 stopped.");
//				threadStatus();
			}
			else if(commandString.equals("2s"))
			{
				secondThread.interrupt();
				
				System.out.println("Thread 2 stopped.");
//				threadStatus();
			}
			else if(commandString.equals("3s"))
			{
				thirdThread.interrupt();
				
				System.out.println("Thread 3 stopped.");
//				threadStatus();
			}
			else if(commandString.equals("4s"))
			{
				fourthThread.interrupt();
				
				System.out.println("Thread 4 stopped.");
//				threadStatus();
			}
			else {
				System.out.println("Please give a proper Command Sir!");
			}
			commandString = scanner.nextLine();
		}
		
		//end of checking system running or not!-------------------------//
	}

}
