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
    
    public findOldest(Person per1, Person per2) {
        if (per1.compareTo(per2) > 0) {
            return per1 + " старше " + per2;
        } else if (per1.compareTo(per2) < 0) {
            return per2 + " старше " + per1;
        } else {
            return per2 + " и " + per1 + " - ровесники.";
        }
    }
}
