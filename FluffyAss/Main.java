package FluffyAss;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", "Кот", 3);
        Dog dog = new Dog("Бобик", "Пёс", 2);
        Person man = new Person("Мужчина", "Иннокентий");
        
        System.out.println(man.pet());
        cat.voice();
        dog.voice();
        System.out.println(man.agression());
        cat.agress();
        dog.agress();
        cat.askForFood();
        dog.askForFood();
        System.out.println(man.feedCat());
        cat.play();
        dog.play();

    }
}
