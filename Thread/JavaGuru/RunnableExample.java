public class RunnableExample implements Runnable{
    private String localName;

    public RunnableExample(String localName){
        this.localName = localName;
    }

    @Override
    public void run() {
        System.out.println("run() " + localName + " running");
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableExample("1"));
        Thread thread2 = new Thread(new RunnableExample("2"));
        Thread thread3 = new Thread(new RunnableExample("3"));

        thread1.start();
        thread2.start();
        thread3.start();
        
    }

    
}
