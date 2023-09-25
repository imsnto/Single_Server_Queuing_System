import java.util.*;


public class Main  {
    private static final Scanner sc = new Scanner(System.in);
    private static final Random random = new Random();
    private static final List<Customer> customer = new ArrayList<>();

    public Main(){

    }

    public static void main(String[] args) {
        int n = random.nextInt(20);
        for(int i=0; i<n; i++){
            customer.add(new Customer(random.nextInt(10)+1, random.nextInt(10)+1) );
        }
        customer.sort(new MyComparator());

        int prev = 0;
        for(int i=0; i<n; i++){
            customer.get(i).setStartTime( Math.max(prev, customer.get(i).getArrivalTime()));
            customer.get(i).setDepartureTime( customer.get(i).getStartTime() + customer.get(i).getExecutionTime());
            customer.get(i).setWaitingTime(customer.get(i).getStartTime() - customer.get(i).getArrivalTime());
            prev = customer.get(i).getDepartureTime();
        }
        for(int i=0; i<n; i++){
            System.out.println(i+1 + " arrival time: " + customer.get(i).getArrivalTime() + " waiting time: " +
                    customer.get(i).getWaitingTime() + " start time " + customer.get(i).getStartTime() + " execution time " +
                    customer.get(i).getExecutionTime() + " departure time " + customer.get(i).getDepartureTime());
        }
    }
}