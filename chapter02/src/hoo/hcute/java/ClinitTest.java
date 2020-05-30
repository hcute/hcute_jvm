package hoo.hcute.java;

/**
 * 如果没有静态的变量和静态的代码块不会生成clinit方法
 */
public class ClinitTest {

    private  int a = 1;
    private static int c = 3;

    public ClinitTest() {
        a = 10;
        int d = 20;
    }

    public static void main(String[] args) {
        int b =2;
    }
}
