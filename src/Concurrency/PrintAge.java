package Concurrency;

import java.util.concurrent.Callable;

public class PrintAge implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("Say hi to callable");
        return 28;
    }
}
