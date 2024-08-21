public class Store {
    private int item;

    public synchronized void put(){
        while (item >= 3) {
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        item++;
        System.out.println("Artadrox@ avelacrela 1 hat apranq, Hima skladum ka " + item);
        notify();
    }

    public synchronized void get(){
        while(item < 1){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            
        }
        item--;
        System.out.println("Gnort@ arav 1 hat apranq, Hima skladum ka " + item);
        notify();
    }
}
