package Thread.com;

public class UserThread extends Thread {

    public void run() {
        System.out.println("Print the user defined");
    }
}

 class Threadup {

    public static void main(String[] args) {
        System.out.println("Program Started...");
        int x = 56 + 34;
        System.out.println("Sum is " + x);
        // Thread....
        // Current Thread ...
        Thread t = Thread.currentThread();
        // System.out.println(t);
        String tname = t.getName();
        System.out.println("Current running thread is " + tname);

        // set name ..
        t.setName("My World ");
        System.out.println(t.getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getId());
        UserThread t1 = new UserThread();
        t1.start();
        System.out.println("Program Ended");
    }
}
