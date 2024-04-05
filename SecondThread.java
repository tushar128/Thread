package Thread.com;

public class SecondThread extends Thread
{
	public void run()
	{
	for(int i =0 ; i< 10 ; i++)
	{
		System.out.println(" Second Thread " + i + " ");
		try {
			Thread.sleep(100);
		}catch (Exception e)
		{
			
		}
		
	}
}
	public static void main(String[] args) {
		
		FirstThread  t1 = new FirstThread();
		Thread thr = new Thread(t1);
		SecondThread t2 = new SecondThread();
		t2.start();
		thr.start();

	}

}
