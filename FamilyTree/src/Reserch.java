import java.util.ArrayList;

import javax.management.relation.Relation;

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

    public void getRelation(Person per1, Person per2) {
        for (Node tr : tree) {
            if (tr.p1.getFullName() == per1.getFullName() && tr.p2.getFullName() == per2.getFullName()) {
                System.out.println(Relation);
            }
        }
    }
}
