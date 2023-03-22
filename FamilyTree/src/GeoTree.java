import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void appendKids(Person parent, Person child) {
        tree.add(new Node(parent, Relationship.parent, child));
        tree.add(new Node(child, Relationship.child, parent));
    }

    public void appendBro(Person sister, Person brother) {
        tree.add(new Node(sister, Relationship.sister, brother));
        tree.add(new Node(brother, Relationship.brother, sister));
    }
}
