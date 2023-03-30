package FluffyAss;

public class Dog extends Animal implements Voice, Hungry, Agression, Game{

    public Dog(String name, String model, Integer age) {
        super(name, model, age);
    }

    @Override
    public void voice() {
        System.out.println("Собака лает.");
    }
    
    @Override
    public void askForFood(Person per) {
        System.out.println("Собака просит кусок колбасы.");
    }

    @Override
    public void agress() {
        System.out.println("Собака скалится.");
    }

    @Override
    public void playWithHuman(Person per) {
        System.out.println("Собака ловит палку.");
    }

}
