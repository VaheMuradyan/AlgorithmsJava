public class Main {
    public static void main(String[] args) {

        Thread myThread1 = new Thread(new MyThread());
        Thread myThread2 = new Thread(new MyThread());
        myThread1.start();
        myThread2.start();
    }
    
}
