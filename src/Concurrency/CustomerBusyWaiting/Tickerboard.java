package Concurrency.CustomerBusyWaiting;

import java.util.*;

public class Tickerboard {

    private final ArrayList<Integer> appointments ;
    private int current;

    Tickerboard(ArrayList<Integer> appointments){
        this.appointments = appointments;
        current =0;
    }


    public boolean isMyTurn(int appointmentId) {
        if(current == appointments.size()){
            throw new RuntimeException("No more appointments");
        }
        if(appointments.get(current) != appointmentId){
            return false;
        }
        current++;
        return true;
    }
}
