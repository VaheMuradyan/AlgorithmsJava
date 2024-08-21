public class NewThread1 extends Thread{
    
    public NewThread1(){
        super("Cucadrakan patok");
        System.out.println("Dustr patok " + this);
        start();
    }

    public void run(){
        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Dustr patok "  + i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Dustr patok@ datarec");
        }
        System.out.println("Dustr patok@ verchacav");
    }
    
}
