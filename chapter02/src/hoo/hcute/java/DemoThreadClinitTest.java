package hoo.hcute.java;

/**
 * 证明类的clinit 是加锁同步的
 */
public class DemoThreadClinitTest {

    public static void main(String[] args) {

        Runnable r = () -> {
            System.out.println(Thread.currentThread().getName() + "开始");
            DemoThread demoThread = new DemoThread();
            System.out.println(Thread.currentThread().getName() + "结束");
        };
        Thread thread1 = new Thread(r);
        Thread thread2 = new Thread(r);
        thread1.start();
        thread2.start();
    }
}

class DemoThread{
    static {
        if (true){
            System.out.println(Thread.currentThread().getName() + "执行clinit方法");
            while (true) {

            }
        }

    }
}
