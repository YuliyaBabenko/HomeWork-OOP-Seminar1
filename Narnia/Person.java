package Narnia;

public class Person implements Action{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void openWardrobe() {
        System.out.println(this.name + " opens the wardrobe.");;
    }

    @Override
    public void hideInWardrobe() {
        System.out.println(this.name + " hides inside the wardrobe.");;
    }

    @Override
    public void cleanWardrobe() {
        System.out.println(this.name + " cleans the wardrobe.");;
    }

}
