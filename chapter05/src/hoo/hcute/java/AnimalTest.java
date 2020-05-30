package hoo.hcute.java;

import org.omg.PortableInterceptor.AdapterNameHelper;

class Animal{
    public void eat(){
        System.out.println("动物吃东西");
    }
}
interface Huntable{
    void hunt();
}

class Dog extends Animal implements Huntable{

    public Dog() {
        super(); // 早期绑定 - 静态链接
    }

    public Dog(String name){
        this(); // 早期绑定 - 静态链接
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void hunt() {
        System.out.println("狗拿耗子，多管闲事");
    }
}

class Cat extends Animal implements Huntable{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void hunt() {
        System.out.println("猫抓老鼠，天经地义");
    }
}

public class AnimalTest {

    public void testAnimal(Animal animal){
        animal.eat(); // 晚期绑定 - 动态链接
    }

    public void testHunt(Huntable huntable){
        huntable.hunt(); //  晚期绑定 - 动态链接
    }
}
