package Narnia;

public class Wardrobe {
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

    public String showAll() {
        return model + " " + doors + " " + handle;
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

    public String getOpened() {
        return "A " + this.model + " wardrobe with " + this.doors + " doors and a " + this.handle + " handle opens up.";
    }

    public String surprise() {
        return "Behind the " + this.doors + " doors she has found a whole new world!";
    }
}
