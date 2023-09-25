import java.util.Comparator;

public class Customer {
    int arrivalTime;
    private int departureTime;
    int executionTime;
    private int waitingTime;

    public Customer(){
    }
}
class MyComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer c, Customer c2) {
        return Integer.compare(c.arrivalTime, c2.arrivalTime);
    }
}