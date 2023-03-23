package FluffyAss;

public class Cat {
    private String model;
    private String ears;
    
    public Cat(String model, String name) {
        this.model = model;
        this.name = name;
    }
    
    public String getModel() {
        return model;
    }
    
    public String getName() {
        return name;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String voice() {
        return this.model + " " + this.name + " урчит";
    }
    
    public String agression() {
        return this.name + " шипит, кусается, царапается.";
    }
    
    public String askForFood() {
        return this.name + " смотрит голодными глазами.";
    }
}
