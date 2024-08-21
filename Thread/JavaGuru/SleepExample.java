public class SleepExample implements Runnable{
    public void run(){
        for (int i = 1; i < 4; i++) {
            System.out.println("Run by " 
            + Thread.currentThread().getName()
            + ", i is " + i);

            // try{
            //     Thread.sleep(1000);
            // }catch(InterruptedException e){
            //     e.printStackTrace();
            // }
        }
    }

    public static void main(String[] args) {
        SleepExample sleepRunnable = new SleepExample();

        Thread one = new Thread(sleepRunnable);
        one.setName("Fred");
        Thread two = new Thread(sleepRunnable);
        two.setName("Lucy");
        Thread three = new Thread(sleepRunnable);
        three.setName("Ricky");

        one.start();
        two.start();
        three.start();
    }
    
}
