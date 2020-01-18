import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Node root = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");
        Node nodeG = new Node("G");
        Node nodeH = new Node("H");
        Node nodeI = new Node("I");
        Node nodeJ = new Node("J");
        Node nodeK = new Node("K");

        nodeG.addChild(nodeK);
        nodeF.addChild(nodeI).addChild(nodeJ);

        nodeD.addChild(nodeG).addChild(nodeH);
        nodeB.addChild(nodeE).addChild(nodeF);

        root.addChild(nodeB).addChild(nodeC).addChild(nodeD);

        List<String> results = new ArrayList<>();
        results = root.breadthFirstSearch(results);

        String[] answer = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K" };

        for (int i = 0; i < answer.length; i++) {
            assert answer[i].equals(results.get(i)) : "Wrong Answer";
        }
        System.out.println("Correct Answer!");
    }
}

class Node {
    String name;
    List<Node> children = new ArrayList<Node>();

    Node(String name) {
        this.name = name;
    }

    public Node addChild(String name) {
        Node child = new Node(name);
        children.add(child);
        return this;
    }

    public Node addChild(Node node) {
        this.children.add(node);
        return this;
    }

    public List<String> breadthFirstSearch(List<String> array) {
        ArrayList<Node> queue = new ArrayList<>();
        queue.add(this);

        while (!queue.isEmpty()) {
            Node node = queue.get(0);
            queue.remove(0);

            array.add(node.name);

            Iterator<Node> it = node.children.iterator();
            while (it.hasNext()) {
                queue.add(it.next());
            }
        }

        return array;
    }
}