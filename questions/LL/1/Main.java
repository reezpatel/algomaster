// Feel free to add new properties and methods to the class.
class Main {

    static class Node {
        public int value;
        public Node prev;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    static class DoublyLinkedList {
        public Node head;
        public Node tail;

        public void setHead(Node node) {
            remove(node);

            node.next = head;

            if (head != null) {
                head.prev = node;
            }

            head = node;

            if (tail == null) {
                tail = head;
            }
        }

        public void setTail(Node node) {
            remove(node);

            node.prev = tail;

            if (tail != null) {
                tail.next = node;
            }
            tail = node;

            if (head == null) {
                head = tail;
            }
        }

        public void insertBefore(Node node, Node nodeToInsert) {
            int position = 1;

            Node point = head;

            while (point != null && point != node) {
                position++;
                point = point.next;
            }

            insertAtPosition(position, nodeToInsert);
        }

        public void insertAfter(Node node, Node nodeToInsert) {
            int position = 1;

            Node point = head;

            while (point != null && point != node) {
                position++;
                point = point.next;
            }

            insertAtPosition(position + 1, nodeToInsert);
        }

        public void insertAtPosition(int position, Node _nodeToInsert) {
            Node nodeToInsert = new Node(_nodeToInsert.value);
            if (head == null && tail == null) {
                head = nodeToInsert;
                tail = nodeToInsert;
                return;
            }

            if (position == 1) {
                nodeToInsert.next = head;
                head.prev = nodeToInsert;
                head = nodeToInsert;
                return;
            }

            Node point = head;
            while (--position != 0 && point != null) {
                point = point.next;
            }

            if (point == null) {
                tail.next = nodeToInsert;
                nodeToInsert.prev = tail;
                tail = nodeToInsert;
            } else {
                nodeToInsert.next = point.next;
                nodeToInsert.prev = point;

                if (point.next != null) {
                    point.next.prev = nodeToInsert;
                }
                point.next = nodeToInsert;
            }
        }

        public void removeNodesWithValue(int value) {
            Node node = head;
            Node next = head;

            while (node != null) {
                next = node.next;

                if (node.value == value) {
                    remove(node);
                }

                node = next;
            }
        }

        public void remove(Node node) {
            if (head == null && tail == null) {
                return;
            }

            if (head.next == null && tail.prev == null) {
                if (head == node) {
                    head = null;
                    tail = null;
                }
                return;
            }

            if (head == node) {
                head = head.next;
                head.prev = null;
                return;
            }

            if (tail == node) {
                tail = tail.prev;
                tail.next = null;
                return;
            }

            Node point = head;
            while (point != null && point != node) {
                point = point.next;
            }

            if (point == null) {
                return;
            }

            Node front = point.prev;
            Node back = point.next;

            front.next = back;
            back.prev = front;
        }

        public boolean containsNodeWithValue(int value) {
            Node point = head;

            while (point != null && point.value != value) {
                point = point.next;
            }

            return point != null;
        }

        public void print() {
            Node node = head;

            System.out.print("List :: ");
            while (node != null) {
                System.out.print(node.value);
                if (node.next != null)
                    System.out.print(" <=> ");

                node = node.next;
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();

        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        linkedList.insertAtPosition(1, fifth);
        linkedList.print();

        linkedList.setHead(first);
        linkedList.insertAfter(first, second);
        linkedList.insertAfter(second, third);
        linkedList.insertAfter(third, fourth);
        linkedList.insertAfter(fourth, fifth);
        linkedList.insertAfter(third, fifth);

        linkedList.print();
    }
}
