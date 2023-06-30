package Inheritance;

public class A {
    A(){
        System.out.println("Object of A got created");
    }
    void doSomething(){
        System.out.println("Hello");
    }
    void doSomething(int i, String s){
        System.out.println("Hi");
    }
    void doSomething(String s, int i){
        System.out.println("bye");
    }
}
