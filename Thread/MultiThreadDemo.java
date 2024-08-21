public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread("Mek");
        new NewThread("Erku");
        new NewThread("Ereq");

        try{
            Thread.sleep(10000);
        }catch(InterruptedException e){
            System.out.println("Himnakan patok@ datarec");
        }

        System.out.println("Himnakan patok@ verchacav");

    }
    
}
