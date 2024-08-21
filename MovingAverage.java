import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {
    private int size;

    private Queue<Integer> window;

    private double sum;


    public MovingAverage(int size) {

        this.size = size;

        this.window = new LinkedList<>();

        sum = 0.0;

    }


    public double next(int val) {

        if (window.size() == size) {

            sum -= window.remove();

        }

        window.add(val);

        sum += val;

        return sum / window.size();

    }

    public static void main(String[] args) {
        MovingAverage m = new MovingAverage(3);

        System.out.println(m.next(1)); // returns 1.0 (like a single heart rate reading)

        System.out.println(m.next(10)); // returns 5.5 (the average after a short burst of activity)

        System.out.println(m.next(3)); // returns 4.66667 (normalizing after the burst)

        System.out.println(m.next(5));
        System.out.println(0 % 2);

       
    }
}
