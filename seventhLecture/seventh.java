package seventhLecture;

import java.util.Scanner;

public class seventh {
	static Scanner myScanner=new Scanner(System.in);
	private static OurThread thread1 = new OurThread("child 1", 0, 1, 500, true,null);
	private static OurThread thread2 = new OurThread("child 2", 100, 10, 1000, true,thread1);
	private static OurThread thread3 = new OurThread("child 3", 1000, 100, 2000, true,thread2);
	public static void main(String[] args) {
	
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
		System.out.println("Please write a Command: ");
		String commandString = myScanner.nextLine();
		while(!commandString.toLowerCase().equals("exit"))
		{
			if(commandString.equals("1")) {
				System.out.println("Counter in Thread 1:  "+ thread1.getCounter());
				threadStatus();
			}
			else if(commandString.equals("2"))
			{
				System.out.println("Counter in Thread 1:  "+ thread2.getCounter());
				threadStatus();
			}
			else if(commandString.equals("3"))
			{
				System.out.println("Counter in Thread 1:  "+ thread3.getCounter());
				threadStatus();
			}
			else if(commandString.equals("1s"))
			{
				thread1.stopThread();

				System.out.println("Thread 1 stopped.");
				threadStatus();
			}
			else if(commandString.equals("2s"))
			{
				thread2.stopThread();
				
				System.out.println("Thread 2 stopped.");
				threadStatus();
			}
			else if(commandString.equals("3s"))
			{
				thread3.stopThread();
				
				System.out.println("Thread 3 stopped.");
				threadStatus();
			}
			else {
				System.out.println("Please give a proper Command Sir!");
			}
			commandString = myScanner.nextLine();
		}
	}
	private static void threadStatus()
	{
		System.out.println("Thread 1 is alive : "+ thread1.isAlive() );
		System.out.println("Thread 2 is alive : "+ thread2.isAlive() );
		System.out.println("Thread 3 is alive : "+ thread3.isAlive() );
	}

}
