package seventhLecture;

public class OurThread extends Thread {
	//--------------------------------variable------------------------------------------//
	private String threadName;
	private int startingPoint;
	private int counter;
	private int adder;
	private int timeDifference;
	private OurThread dependentThread;
	
	private boolean threadAliveFlag;

	//--------------------------------constructor-----------------------------------------------------------//
	public OurThread(String threadName, int startingPoint,  int adder, int timeDifference,
			boolean threadAliveFlag,OurThread dependentThread) {
		super();
		this.threadName = threadName;
		this.startingPoint = startingPoint;
		this.adder = adder;
		this.timeDifference = timeDifference;
		this.threadAliveFlag = threadAliveFlag;
		this.dependentThread = dependentThread;
	}
	
	
	
	//--------------------------------------run----------------------------------------//
	@Override
	public void run() {
		counter = startingPoint;
		if(dependentThread!=null)//join fuction of thread,
		{
			try {
				dependentThread.join();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
			while(threadAliveFlag)
			{
				counter+=adder;
				try {
					sleep(timeDifference);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
	}
	//-----------------------------------------------------stop thread method----------------------------------------------------------------------//
	public void stopThread()
	{
		threadAliveFlag = false;
	}
	
	
	
	
	//---------------------getters and setters-----------------------------------//
	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	public int getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(int startingPoint) {
		this.startingPoint = startingPoint;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int getAdder() {
		return adder;
	}

	public void setAdder(int adder) {
		this.adder = adder;
	}

	public int getTimeDifference() {
		return timeDifference;
	}

	public void setTimeDifference(int timeDifference) {
		this.timeDifference = timeDifference;
	}

	public boolean isThreadAliveFlag() {
		return threadAliveFlag;
	}

	public void setThreadAliveFlag(boolean threadAliveFlag) {
		this.threadAliveFlag = threadAliveFlag;
	}


	
	
}
