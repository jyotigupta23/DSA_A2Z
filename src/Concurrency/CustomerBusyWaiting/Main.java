package Concurrency.CustomerBusyWaiting;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        ArrayList<Integer> appointments = new ArrayList<>();

        for(int i=0; i<10; i++){
            appointments.add(i);
        }

        Tickerboard tickerboard = new Tickerboard(appointments);
        for(int i=9; i>=0; i--){
            customers.add( new Customer(appointments.get(i), tickerboard));
        }

        for(Customer customer : customers){
             new Thread(customer).start();
        }
    }
}
