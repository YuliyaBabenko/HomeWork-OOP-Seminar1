public class Main {
    public static void main(String[] args) {
        Person irene = new Person("Ирина", 56);
        Person vasil = new Person("Василий", 34);
        Person marie = new Person("Мария", 31);
        Person jane = new Person("Женя", 12);
        Person ivan = new Person("Ваня", 9);
        GeoTree gt = new GeoTree();

        // irene.getFullName();
        // irene.getAge();
        // vasil.getFullName();
        // vasil.getAge();
        // marie.getFullName();
        // marie.getAge();
        // jane.getFullName();
        // jane.getAge();
        // ivan.getFullName();
        // ivan.getAge();

        gt.appendKids(irene, vasil);
        gt.appendKids(irene, marie);
        gt.appendBro(marie, vasil);
        gt.appendKids(vasil, jane);
        gt.appendKids(vasil, ivan);
        gt.appendBro(jane, ivan);

        System.out.println(new Reserch(gt).getRelatives(irene, Relationship.parent));
        System.out.println(new Reserch(gt).getRelatives(marie, Relationship.sister));
        System.out.println(new Reserch(gt).getRelatives(ivan, Relationship.brother));
        System.out.println(new Reserch(gt).getRelatives(vasil, Relationship.parent));
    }

}
