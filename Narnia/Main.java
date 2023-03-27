package Narnia;

public class Main {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe("Classical wardrobe", "wooden", "gold");
        Person kid = new Person("Julia");

        kid.cleanWardrobe();
        wardrobe.shinesAfterCleaning();
        kid.openWardrobe();
        wardrobe.opensNewWorldToHuman();
        kid.hideInWardrobe();
        wardrobe.squeal();
    }
}
