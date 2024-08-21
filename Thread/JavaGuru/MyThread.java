public class MyThread implements Runnable{

    private int counter;

    private static int glovalCounter;

    @Override
    public void run(){
        while (counter < 20) {
            counter++;
            glovalCounter++;
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " counter: " + counter 
            + " globalCounter " + glovalCounter);
        }
    }
    

    public static void main(String[] args) {
        new Thread(new MyThread()).start();
        new Thread(new MyThread()).start();
        new Thread(new MyThread()).start();

    }
}
