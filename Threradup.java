package Thread.com;

public class Threradup {

	public static void main(String[] args) {
		System.out.println("Program Started...");
		int x = 56 + 34 ;
		System.out.println("sum is " +x);
		//Thread....
		// Current Thread ...
		Thread t = Thread.currentThread();
		//System.out.println(t);
		String tname  = t.getName();
		System.out.println("Curent running  thread  is" + tname);
		
		//set name ..
		t.setName("My World ");
		System.out.println(t.getName());
		try {
			Thread.sleep(5000);
		}
		catch (Exception e)
		{
				}
	System.out.println(t.getId());
	
	System.out.println("Programme Ended");
	}
	

}
