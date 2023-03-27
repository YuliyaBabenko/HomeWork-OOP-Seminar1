package Narnia;

public class Wardrobe implements NewWorld{
    private String model;
    private String doors;
    private String handle;

    public Wardrobe(String model, String doors, String handle) {
        this.model = model;
        this.doors = doors;
        this.handle = handle;
    }

    public String getModel() {
        return model;
    }

    public String getDoors() {
        return doors;
    }

    public String getHandle() {
        return handle;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    @Override
    public void opensNewWorldToHuman() {
        System.out.println(this.model + " opens up a whole new world!");;
    }

    @Override
    public void squeal() {
        System.out.println(this.model + " squeals while opening.");;
    }

    @Override
    public void shinesAfterCleaning() {
        System.out.println(this.model + " looks very clean!");;
    }
}
