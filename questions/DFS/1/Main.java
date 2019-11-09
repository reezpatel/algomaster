import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Main {

    public static void main(String[] args) {
        Node head = new Node("A");
        head.addChild("B").addChild("C").addChild("D");
        head.children.get(0).addChild("E").addChild("F");
        head.children.get(2).addChild("G").addChild("H");
        head.children.get(0).children.get(1).addChild("I").addChild("J");

        head.children.get(2).children.get(0).addChild("K");

        String[] answer = { "A", "B", "E", "F", "I", "J", "C", "D", "G", "K", "H" };

        List<String> list = Arrays.asList(answer);
        ArrayList<String> correctArray = new ArrayList<>(list);

        ArrayList<String> userArray = new ArrayList<>();
        ;
        head.depthFirstSearch(userArray);

        assert correctArray.equals(userArray) : "Wrong Answer";
        System.out.println("Correct Answer");
    }

    static void printArrayList(ArrayList<String> a) {
        Iterator<String> it = a.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    static class Node {
        String name;
        ArrayList<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public ArrayList<String> depthFirstSearch(ArrayList<String> array) {
            array.add(this.name);
            Iterator<Node> it = this.children.iterator();
            while (it.hasNext()) {
                it.next().depthFirstSearch(array);
            }

            return array;
        }

        public Node addChild(String name) {
            Node node = new Node(name);
            this.children.add(node);

            return this;
        }
    }
}