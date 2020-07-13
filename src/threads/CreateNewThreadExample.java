package threads;

/**
 * this class contains some simple examples of using the Thread class in java
 * remember: only the JVM decides which thread is up for execution, and which have to temporally wait
 */
public class CreateNewThreadExample {

    // create the first job for the thread to execute (requires the Runnable interface)
    protected Runnable myThreadJob = new MyThreadJob();

    // create a new thread and pass it the new thread job
    protected Thread myNewThread = new Thread(myThreadJob);

    public CreateNewThreadExample() {
        // start the new thread (only now it becomes active)
        myNewThread.start();
    }

    /* this is a inner class to help demonstrate the implementation of the Runnable interface */
    private class MyThreadJob implements Runnable {

        @Override
        public void run() {
            System.out.println(String.format("Hello, this is %s speaking.", Thread.currentThread().getName()));
        }

    }

}
