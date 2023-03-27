package FluffyAss;

public class Person implements Action{
    private String sex;
    private String name;
    
    public Person(String sex, String name) {
        this.sex = sex;
        this.name = name;
    }
    
    public String getSex() {
        return sex;
    }
    
    public String getName() {
        return name;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public void setName(String name) {
        this.name = name;
    }
 
    @Override
    public void feedAnimal(Animal animal) {
        System.out.println(this.name + " накладывает питомцу еду.");
    }

    @Override
    public void screamAtAnimal(Animal animal) {
        System.out.println(this.name + " ругается и кричит на питомца.");
    }

    @Override
    public void petAnimal(Animal animal) {
        System.out.println(this.sex + " гладит питомца.");;
    }

    @Override
    public void playWithAnimal(Animal animal) {
        System.out.println(this.name + " играет с питомцем.");;
    }

}
