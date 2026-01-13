package com.peter;

public class Alien {
    
    private int age;
    private Laptop laptop;

    public Alien() {
        System.out.println("Alien Object Created ..");

    }

    public Laptop getLaptop() {
        return this.laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
    
    public void code(){
        System.out.println("I'm coding..");
        laptop.compile();
    }
    
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        System.out.println("Age Assigned");
        this.age = age;
    }
}

