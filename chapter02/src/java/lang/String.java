package java.lang;

/**
 * 测试双亲委派机制
 */
public class String {

    static {
        System.out.println("我是自定义的String类的静态代码块");
    }

    public static void main(String[] args) {
        System.out.println("hello，String");
    }
}
