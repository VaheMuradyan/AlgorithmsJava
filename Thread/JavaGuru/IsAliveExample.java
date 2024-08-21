public class IsAliveExample{
    public static void main(String[] args) throws InterruptedException{
        RunnableExample myRunnable = new RunnableExample("1");

        Thread thread = new Thread(myRunnable);
        System.out.println("Beafor starting " + thread.isAlive());
        thread.start();
        System.out.println("After stating " + thread.isAlive());
        thread.join();
        System.out.println("After thread completed " + thread.isAlive());
    }

    
}
