package FluffyAss;

public class Person {
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
    
    public String pet() {
        return this.sex + " гладит питомца.";
    }
    
    public String agression() {
        return this.name + " ругаекется и кричит на питомца.";
    }
    
    public String feedCat() {
        return this.name + " накладывает питомцу еду.";
    }
}
