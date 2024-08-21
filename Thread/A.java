public class A {
    synchronized void foo(B b){
        String name = Thread.currentThread().getName();

        System.out.println(name + " mtanq metod A.foo()");

        try{
            Thread.sleep(1000);
        }catch(Exception e){
        System.out.println("Klass A kangnav");
        }
        System.out.println(name + " porcuma kanchi metod B.last()");
        b.last();
    }

    synchronized void last(){
        System.out.println("Metodumenq A.last()");
    }
    
}
