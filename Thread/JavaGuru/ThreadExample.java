public class ThreadExample extends Thread{
    public ThreadExample(String name){
        super(name);
    }

    @Override
    public void run(){
        System.out.println("Thread name is " + this.getName());
    }

    public static void main(String[] args) {
        ThreadExample threadExample1 = new ThreadExample("Patok 1");
        threadExample1.start();
        ThreadExample threadExample2 = new ThreadExample("Patok 2");
        threadExample2.start();
        ThreadExample threadExample3 = new ThreadExample("Patok 3");
        threadExample3.start();

    }
}