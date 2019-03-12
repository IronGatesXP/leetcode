package CrazyJava;

public class SecondThread {
    public static void main(String[] args) {
        Runnable r = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        };
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                new Thread(r, "新线程1").start();
                new Thread(r, "新线程2").start();
            }
        }
    }
}
