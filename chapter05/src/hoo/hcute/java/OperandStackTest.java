package hoo.hcute.java;

public class OperandStackTest {

    public void testAddOperator(){
        byte i = 35;
        int j = 8;
        int k = i + j;

    }

    public int sum(){
        int m = 10;
        int n = 20;
        int k = m +n;
        return k;
    }

    public void testSum(){
        int i = sum();
        int j = 20;
    }

    public void test(){
        // 第一类问题
        int i1 = 10;
        i1++;
        int i2 = 10;
        ++i2;

        // 第二类问题
        int i3= 10;
        int i4 = i3++;
        int i5 = 10;
        int i6 = ++i5;

        // 第三类问题
        int i7 = 10;
        i7 = i7++;
        int i8 =10;
        i8 = ++i8;

        //第四类问题
        int i9 =10;
        int i10 = i9++ + ++i9;
        System.out.println(i10);
    }

    public static void main(String[] args) {
        OperandStackTest test = new OperandStackTest();
        test.test();
    }
}
