package EighthLecture;

public class CustomRunnableObject implements Runnable {
//	private boolean stopFlag = false;
	private int counter;
	private String name;
	
	//--------------------------------------------------------------constructor----------------------------------------------------------//
	
	
	public CustomRunnableObject(String name, int counter) {
		super();
		this.counter = counter;
		this.name = name;
	}
	
	
	
	//----------------------------------------------------------------getter and setters------------------------------------------//
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//-----------------------------------------------------run--------------------------------------------------------------------------//
	@Override
	public void run() {
		
		while(!Thread.currentThread().isInterrupted())
		{
			counter++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				break;
			}
		}
		
	}

}
