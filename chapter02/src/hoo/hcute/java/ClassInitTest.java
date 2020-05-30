package hoo.hcute.java;

public class ClassInitTest {

    private static int num = 1;

    static {
        num =2;
        number =20;
//        System.out.println(number); // 会报错，非法的前向引用
    }

    private static int number =10; // 可以这样使用，在link的初始化阶段先初始化为0 ，然后赋值为20，最后为10

    public static void main(String[] args) {
        System.out.println(ClassInitTest.num);
        System.out.println(ClassInitTest.number);
    }
}
