import java.util.*;

public class Main {

    public static void main(String[] args){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Jack", "IBM"));
        customers.add(new Customer(2, "Li", "Spotify"));
        customers.add(new Customer(3, "Jane", "Gov"));

        // creating a new object but not adding it to the list
        // i can still search for it
        Customer James = new Customer(4, "James", "Amazon");
        customers.add(James);
        Customer customer = findUsingIterator("Li", customers);
        //System.out.println(customer.companyName);

        // search using stream api
        Customer Jack = customers.stream()
                .filter(customer1 -> "Jack".equals(customer1.name))
                .findAny()
                .orElse(null);
        if(Jack != null) {
            System.out.println(Jack.companyName);
        }else {
            System.out.println("Nothing is here!");
        }
       // traverse a list of items using iterator
        // iterates through elements to find the one you need
    }
    // find a name of cx using iterator
    public static Customer findUsingIterator(String name, List<Customer> customers){
        // create an iterator that runs through list of objects and selects the one it needs
        Iterator<Customer> iterator = customers.iterator();
        while(iterator.hasNext()){
            Customer customer = iterator.next();
            if(customer.name.equals(name)){
                return customer;
            }
        }
        return null;
    }
}
