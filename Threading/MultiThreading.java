package Threading;

public class MultiThreading {
    public static void main(String[] args) {

        // Multithreading = Enables a program to run multiple threads concurrently
        //                               (Thread = A set of instructions that run independently)
        //                               Useful for background tasks or time-consuming operations

        Thread thread1 = new Thread(new MyRunnable("PING"));
        Thread thread2 = new Thread(new MyRunnable("PONG"));

        System.out.println("GAME START!");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        System.out.println("GAME OVER!");
    }
}

class MyRunnable implements Runnable{

    private final String text;

    MyRunnable(String text){
        this.text = text;
    }

    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            try {
                Thread.sleep(1000);
                System.out.println(text);
            }
            catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
    }
}
