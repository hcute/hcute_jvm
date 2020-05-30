package hoo.hcute.java;

public class StackFrameTest {


    public static void main(String[] args) {
        StackFrameTest test = new StackFrameTest();
        test.method1();
    }

    public void method1(){
        System.out.println("method1 start");

        method2();
        System.out.println("method1 end");
    }

    private int method2() { // 私有方法字节码文件中是看不到的
        System.out.println("method2 start");
        int i = 10;
        int m = (int)method3();
        System.out.println("method2 will be ending");
        return i + m;
    }

    private double method3(){
        System.out.println("method3 start");
        double j = 10.0;
        System.out.println("method3 will be ending");
        return j;
    }


}
