package com.springbackendLecture.Head03_OOP.example07;
class Animal {
    public void speak() {
        System.out.println("Animal");
    }
}
class Dog extends Animal {
    public void speak() {
        System.out.println("barking");
    }
}
class Cat extends Animal {
    public void speak() {
        System.out.println("meowing");
    }
}
public class javaexaple {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.speak();
        a = new Cat();
        a.speak();
    }
}
