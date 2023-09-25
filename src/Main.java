import java.util.*;

class Customer {
    int arrivalTime;
    private int departureTime;
    int executionTime;
    private int waitingTime;

    public Customer(){
    }
}
class MyComparator implements Comparator<Customer>{
    @Override
    public int compare(Customer c, Customer c2) {
        if( c.arrivalTime < c2.arrivalTime) return -1;
        else if(c.arrivalTime > c2. arrivalTime) return 1;
        else return 0;
    }
}
public class Main  {
    private static Scanner sc = new Scanner(System.in);
    private static Random random = new Random();
    private static List<Customer> customer = new ArrayList<>();

    public Main(){
    }

    public static void main(String[] args) {
        int n = random.nextInt(20);
        for(int i=0; i<n; i++){
            customer.add(new Customer());
            customer.get(i).arrivalTime = random.nextInt(10)+1;
            customer.get(i).executionTime = random.nextInt(10)+1;
        }
        Collections.sort(customer, new MyComparator());
        for(int i=0; i<n; i++){
            System.out.println(customer.get(i).arrivalTime + " " + customer.get(i).executionTime);
        }
    }
}
