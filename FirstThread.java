
package Thread.com;

public class FirstThread implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i =0 ; i< 10 ; i++)
		{
			System.out.println(" value " + i + " ");
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
		thr.start();

	}

	
	}
