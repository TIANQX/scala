package com.test.java;

/**
 * @Author tqx
 * @CreateDate 2021/4/23
 * @Description TODO
 */
public class Test {
    public static void main(String[] args) {
        Animal cat=new Cat();
        test(cat);
        test(new Animal() {
            @Override
            public void eat() {
                System.out.println("person is eating food");
            }
        });

        test(()->System.out.println("111 is eating food"));
    }

    public static void test(Animal animal){
        System.out.println("begin");
        animal.eat();
        System.out.println("end");
    }
}

