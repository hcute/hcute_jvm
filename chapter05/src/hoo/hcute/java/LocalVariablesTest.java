package hoo.hcute.java;

import java.util.Date;

public class LocalVariablesTest {

    private int count = 0;


    public LocalVariablesTest(){
        this.count = 1;
    }

    public static void main(String[] args) {
        LocalVariablesTest test = new LocalVariablesTest();
        int num = 10;
        test.test1();
    }

    public static void testStatic(){
        LocalVariablesTest test = new LocalVariablesTest();
        Date date = new Date();
        int num = 10;
        System.out.println(num);
    }

    public void test1(){

        Date date = new Date();
        String name1 = "atguigu.com";
        String info = test2(date,name1);
        System.out.println(info);
    }

    public String test2(Date dataP,String name2){
        dataP = null;
        name2 = "songhongkang";
        double weight = 130.5;
        char gender = '男';
        return dataP + name2;
    }

    public void test3(){
        count++;
    }

    public void test4(){
        int a = 0;
        {
            int b = 0;
            b  = a + 1;
        }
        int c = a + 1;
    }

    /*
        变量分类
            按照数据类型分为
                基本数据类型
                引用数据类型
            按照在类中申明的位置
                成员变量：在使用前都经历过默认初始化赋值
                    类变量 static 修饰,在Linking的prepare阶段：给类变量默认赋值 ---> initialize 阶段 给类变量和静态代码块赋值
                    实例变量 随着对象的创建会在堆空间中会分配实例变量空间，会进行默认赋值
                局部变量：在使用前必须要显示赋值，否则，编译不通过

     */

    public void testTemp(){
        int num;
//        System.out.println(num); //变量未进行初始化
    }
}
