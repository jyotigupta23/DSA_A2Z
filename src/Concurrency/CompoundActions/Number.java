package Concurrency.CompoundActions;

public class Number {
    int x =0;

    public synchronized int getX() {
        return x;
    }

    public synchronized void setX(int x) {
        this.x = x;
    }

    public synchronized void increament(){
        int oldValue = getX();
        setX(oldValue+1);
    }
}
