public class ExtendThread {
    public static void main(String[] args) {
        new NewThread1();

        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Himanakan patok " + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Himnakan patok@ datarec");
        }

        System.out.println("Himnakan patok@ verchacav");

    }
    
}
