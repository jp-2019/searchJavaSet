import java.util.*;

public class Main {

    public static void main(String[] args){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Jack"));
        customers.add(new Customer(2, "Li"));
        customers.add(new Customer(3, "Jane"));

        // creating a new object but not adding it to the list
        // i can still search for it
        Customer James = new Customer(4, "James");
        customers.add(James);
        if(customers.contains(James)) {
            System.out.println("Object does exist");
        } else {
            System.out.println("Object does not exist");
        }
        // -1 is if the element doesnt exist in the list
        if(customers.indexOf(James) != -1) {
            System.out.println("Object does exist");
        } else {
            System.out.println("Object does not exist");
        }
        Customer c = findUsingLoop("Jane", customers);
        System.out.println(c.name);
    }
    public static Customer findUsingLoop(String name, List<Customer> customers){
        // breaking each element in list of cx into customer object
        // figure out if name of customer is equal to what im searching for
        // normally set up getters and setters don't do it this way.
        for (Customer customer: customers) {
            if(customer.name.equals(name)){
                return customer;
            }
        }
        return null;
    }
}
