public class B {
    synchronized void bar(A a){
        String name = Thread.currentThread().getName();
        System.out.println(name + " Mtanq metod B.bar()");

        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println("Klass B kangnav");
        }

        System.out.println(name +  " porcuma kanchi metod A.last()");
        a.last();
    }

    synchronized void last(){
        System.out.println("Metodumenq A.last()");
    }
    
}
