public class Main {
    public static void main(String[] args) {
        Person irene = new Person("Ирина", 56);
        Person vasil = new Person("Василий", 34);
        Person marie = new Person("Мария", 31);
        Person jane = new Person("Женя", 12);
        Person ivan = new Person("Ваня", 9);
        GeoTree gt = new GeoTree();

        gt.appendRelative(irene, vasil, Relationship.parent);
        gt.appendRelative(irene, marie, Relationship.parent);
        gt.appendRelative(marie, vasil, Relationship.sister);
        gt.appendRelative(vasil, jane, Relationship.parent);
        gt.appendRelative(vasil, ivan, Relationship.parent);
        gt.appendRelative(jane, ivan, Relationship.sister);

        System.out.println(new Reserch(gt).getRelatives(irene, Relationship.parent));
        System.out.println(new Reserch(gt).getRelatives(marie, Relationship.sister));
        System.out.println(new Reserch(gt).getRelatives(ivan, Relationship.brother));
        System.out.println(new Reserch(gt).getRelatives(vasil, Relationship.parent));
        
        System.out.println(findOldest(vasil, marie));
        System.out.println(findOldest(ivan, irene));
    }

}
