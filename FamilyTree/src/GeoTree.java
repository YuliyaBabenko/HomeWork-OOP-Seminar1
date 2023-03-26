import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void appendRelative(Person per1, Person per2, Relationship re) {
        if (re == Relationship.parent) {
            tree.add(new Node(per1, Relationship.parent, per2));
            tree.add(new Node(per2, Relationship.child, per1));
        } else if (re == Relationship.sister) {
            tree.add(new Node(per1, Relationship.sister, per2));
            tree.add(new Node(per2, Relationship.brother, per1));
        } else if (re == Relationship.child) {
            tree.add(new Node(per1, Relationship.child, per2));
            tree.add(new Node(per2, Relationship.parent, per1));
        } else if (re == Relationship.brother) {
            tree.add(new Node(per1, Relationship.brother, per2));
            tree.add(new Node(per2, Relationship.sister, per1));
        }
        
    }
}
