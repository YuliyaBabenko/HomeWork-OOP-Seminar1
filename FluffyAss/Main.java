package FluffyAss;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("вислоушка", "Леопольд");
        Person man = new Person("Мужчина", "Иннокентий");
        
        System.out.println(man.pet());
        System.out.println(cat.voice());
        System.out.println(man.agression());
        System.out.println(cat.agression());
        System.out.println(cat.askForFood());
        System.out.println(man.feed());
    }
}
