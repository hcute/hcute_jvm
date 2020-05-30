package hoo.hcute.java;

class Father{

    public Father() {
        System.out.println("father的构造方法");
    }

    public static void showStatic(String string){
        System.out.println("father" + string);
    }

    public final void showFinal(){
        System.out.println("father show final");
    }

    public void showCommon(){
        System.out.println("father 的普通方法");
    }
}
public class Son extends Father{

    public Son() {
        super();
    }

    public Son(int age){
        this();
    }

    public static void showStatic(String name){
        System.out.println("son " +  name);
    }

    private void showPrivate(String pri){
        System.out.println("son private " + pri);
    }

    public void show(){
        showStatic("atguigu.com");
        super.showStatic("good!");
        showPrivate("hello");
        super.showCommon();
        showFinal();

    }
}
