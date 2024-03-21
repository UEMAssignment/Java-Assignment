class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println("From Thread A: i = " + i);
        System.out.println("Exit form Thread A");
    }
}
class B extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println("From Thread B: i = " + i);
        System.out.println("Exit form Thread B");
    }
}
class C extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println("From Thread C: i = " + i);
        System.out.println("Exit form Thread C");
    }
}

class ThreadTest {

    public static void main(String[] args) {
        System.out.println("Main Thread Started");
        A a = new A();
        a.start();
        B b = new B();
        b.start();
        C c = new C();
        c.start();
        System.out.println("Main Thread Started");
    }
}
