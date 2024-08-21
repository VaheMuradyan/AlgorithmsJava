public class SuspendResume {
    public static void main(String[] args) {
        NewThread3 ob1 = new NewThread3("Mek");
        NewThread3 ob2 = new NewThread3("Erku");

        try{
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Kangnacrinq patok mek@");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Noric miacrinq patok mek@");
            ob2.mysuspend();
            System.out.println("kangnacrinq patok erkus@");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Noric miacrinq patok erkus@");
        }catch(InterruptedException e){
            System.out.println("HImanakan paotk@ kaynav");
        }

        try{
            System.out.println("Spasumenq patokner@ verchanan");
            ob1.t.join();
            ob2.t.join();
        }catch(InterruptedException e){
            System.out.println("himnakan patok@ kaynav");
        }

        System.out.println("HImnakan patok@ prcav");
    }    
}
