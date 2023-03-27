import java.util.ArrayList;

public class Reserch {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> getRelatives(Person per, Relationship re) {
        for (Node tr : tree) {
            if (tr.p1.getFullName() == per.getFullName() && tr.re == re) {
                result.add(tr.p2.getFullName());
            }
        }
        return result;
    }

}
