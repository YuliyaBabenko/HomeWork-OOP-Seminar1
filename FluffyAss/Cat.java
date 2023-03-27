package FluffyAss;

public class Cat extends Animal implements Voice, Hungry, Agression, Game{

    public Cat(String name, String model, Integer age) {
        super(name, model, age);
    }

    @Override
    public void voice() {
        System.out.println("Кот мяукает.");
    }
    
    @Override
    public void askForFood() {
        System.out.println("Кот смотрит голодными глазами.");
    }

    @Override
    public void agress() {
        System.out.println("Кот шипит.");
    }

    @Override
    public void playWithHuman() {
        System.out.println("Кот гоняет клубок шерсти.");;
    }


}
