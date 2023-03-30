package FluffyAss;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", "Кот", 3);
        Dog dog = new Dog("Бобик", "Пёс", 2);
        Person man = new Person("Мужчина", "Иннокентий");
        
        man.petAnimal(cat);
        cat.voice();
        dog.voice();
        man.screamAtAnimal(dog);
        cat.agress();
        dog.agress();
        man.feedAnimal(cat);
        cat.askForFood(man);
        dog.askForFood(man);
        man.playWithAnimal(dog);
        cat.playWithHuman(man);
        dog.playWithHuman(man);
        cat.fightWith(dog);
        dog.fightWith(cat);

    }
}
