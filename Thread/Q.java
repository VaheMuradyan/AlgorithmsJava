public class Q {
    int n;
    boolean valueSet = false;
    synchronized int get(){
        while(!valueSet)
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("exception@ brnvec");
            }
            System.out.println("Stacanq " + n);
            valueSet = false;
            notify();
            return n;
        
    }

    synchronized void put(int n){
        while(valueSet)
            try{
                wait();
            } catch(InterruptedException e){
                System.out.println("exception brnvec");
            }
            this.n = n;
            valueSet = true;
            System.out.println("Uxarkecinq " + n); 
            notify();
    }
    
}
