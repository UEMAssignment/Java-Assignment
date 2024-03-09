public class ThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread: " + t);

        t.setName("My Thread");

        System.out.println("After Change: " + t);

        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(2000);
            }
        } catch(InterruptedException e) {
            System.out.println("Main Tread Interuppted: " + e);
        }
    }
}