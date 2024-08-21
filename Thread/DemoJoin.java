public class DemoJoin {

    public static void main(String[] args) {
        NewThread ob1 = new NewThread("Mek");
        NewThread ob2 = new NewThread("Erku");
        NewThread ob3 = new NewThread("Ereq");

        System.out.println("Patok 1-@ miacav " + ob1.t.isAlive());
        System.out.println("Patok 2-@ miacav " + ob2.t.isAlive());
        System.out.println("Patok 3-@ miacav " + ob3.t.isAlive());

        try{
            System.out.println("Spasumenq patokner@ verchanan");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch(InterruptedException e){
            System.out.println("Himnakan patok@ pchacav");
        }

        System.out.println("Patok 1-@ miacav " + ob1.t.isAlive());
        System.out.println("Patok 2-@ miacav " + ob2.t.isAlive());
        System.out.println("Patok 3-@ miacav " + ob3.t.isAlive());

        System.out.println("Himanakan patok@ verhcacav");
    }
    
}
