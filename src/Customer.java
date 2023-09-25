import java.util.Comparator;

public class Customer {
    private int arrivalTime;
    private int departureTime;
    private int startTime;
    private int executionTime;

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(int executionTime) {
        this.executionTime = executionTime;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    private int waitingTime;

    public Customer(int arrivalTime, int executionTime) {
        this.arrivalTime = arrivalTime;
        this.executionTime = executionTime;
    }
}
class MyComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer c, Customer c2) {
        return Integer.compare(c.getArrivalTime(), c2.getArrivalTime());
    }
}
