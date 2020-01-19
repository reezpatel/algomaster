import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static AncestralTree getYoungestCommonAncestor(AncestralTree topAncestor, AncestralTree descendantOne,
            AncestralTree descendantTwo) {
        HashSet<AncestralTree> set = new HashSet<>();

        AncestralTree leaf = descendantOne;
        while (leaf != null) {
            set.add(leaf);
            leaf = leaf.ancestor;
        }

        leaf = descendantTwo;

        while(leaf != null) {
            if(set.contains(leaf)) {
                return leaf;
            }
            leaf = leaf.ancestor;
        }

        return null;
    }

    public static void main(String[] args) {
        AncestralTree nodeA = new AncestralTree('A');
        AncestralTree nodeB = new AncestralTree('B');
        AncestralTree nodeC = new AncestralTree('C');
        AncestralTree nodeD = new AncestralTree('D');
        AncestralTree nodeE = new AncestralTree('E');
        AncestralTree nodeF = new AncestralTree('F');
        AncestralTree nodeG = new AncestralTree('G');
        AncestralTree nodeH = new AncestralTree('H');
        AncestralTree nodeI = new AncestralTree('I');

        nodeD.addAsAncestor(nodeH).addAsAncestor(nodeI);
        nodeB.addAsAncestor(nodeD).addAsAncestor(nodeE);
        nodeC.addAsAncestor(nodeF).addAsAncestor(nodeG);
        nodeA.addAsAncestor(nodeB).addAsAncestor(nodeC);

        AncestralTree node = getYoungestCommonAncestor(nodeA, nodeE, nodeI);

        assert node == nodeB : "Wrong Answer";

        System.out.println("Correct Answer");
    }
}

class AncestralTree {
    public char name;
    public AncestralTree ancestor;

    AncestralTree(char name) {
        this.name = name;
    }

    AncestralTree addAsAncestor(AncestralTree descendant) {
        descendant.ancestor = this;
        return this;
    }
}