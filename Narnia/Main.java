package Narnia;

public class Main {
    public static void main(String[] args) {
        Wardrobe small = new Wardrobe("classic", "wooden", "gold");

        Person kid = new Person("Julia");
        System.out.println(kid.open());
        System.out.println(small.getOpened());
        System.out.println(kid.curious());
        System.out.println(small.surprise());
        System.out.println(kid.scream());
    }
}
