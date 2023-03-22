package Narnia;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public String open() {
        return this.name + " opens a wardrobe.";
    }

    public String curious() {
        return this.name + " looks inside the wardrobe";
    }

    public String scream() {
        return this.name + " is so excited and happy!";
    }
}
