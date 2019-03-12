package CrazyJava;


import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

// 使用Runnable和Callable接口可以直接用lambda表达式，不需要创建实现他们的类，因为很多余（除非想要在创建对象时传入参数），因为实例变量可以写在重写的方法内
// 因为这和使用的同一对象创建新线程的效果一样，而且想加入的新方法的逻辑也可以写在需要被重写的方法内。只是在需要建立多个对象时麻烦一点。
public class ThirdThread {
    public static void main(String[] args) {
        FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>) () -> {
            int i = 0;
            for ( ; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
            return i;
        });
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                new Thread(task, "新线程1").start();
                new Thread(task, "新线程2").start();
            }
        }
        try {
            System.out.println("子线程的返回值" + " " + task.get());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

 }
