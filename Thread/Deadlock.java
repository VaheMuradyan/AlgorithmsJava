public class Deadlock implements Runnable{
    A a = new A();
    B b = new B();

    Deadlock(){
        Thread.currentThread().setName("Himnakan  patok");
        Thread t = new Thread(this, "Kankurent patok");
        t.start();
        a.foo(b);
        System.out.println("het himnakan patok");
    }

    public void run(){
        b.bar(a);
        System.out.println("Het urish patok");
    }

    public static void main(String[] args) {
        new Deadlock();
    }
    
}
