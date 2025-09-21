package Concurrency.CustomerBusyWaiting;

public class Customer implements Runnable{
    private final int appointmentId;
    private final Tickerboard tickerboard;

    public Customer(int appointmentId, Tickerboard tickerboard) {
        this.appointmentId = appointmentId;
        this.tickerboard = tickerboard;
    }

    @Override
    public void run() {
        synchronized (tickerboard){
            while(!tickerboard.isMyTurn(appointmentId)){
                System.out.println("Entry is denied - " + appointmentId);
                try {
                    tickerboard.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Entry success - " + appointmentId);
            tickerboard.notifyAll();
        }

      /*  while(!tickerboard.isMyTurn(appointmentId)){
            System.out.println("Entry is denied - " + appointmentId);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Entry success - " + appointmentId);
      */

    }
}
