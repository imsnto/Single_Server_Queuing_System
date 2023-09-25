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
            customer.add(new Customer());
            customer.get(i).arrivalTime = random.nextInt(10)+1;
            customer.get(i).executionTime = random.nextInt(10)+1;
        }
        customer.sort(new MyComparator());
        for(int i=0; i<n; i++){
            System.out.println(customer.get(i).arrivalTime + " " + customer.get(i).executionTime);
        }
    }
}
