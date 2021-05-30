package com.claudemir.generics.teste;
public class Box<T> {

    private T t;          

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Box<String> integerBox = new Box<String>();
        integerBox.set("tica");
        integerBox.inspect(1); // error: this is still String!
    }
}