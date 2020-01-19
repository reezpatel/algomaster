public class Main {
    public static void removeKthNodeFromEnd(LinkedList head, int k) {
        int len = 0;
        LinkedList node = head;
        while (node != null) {
            len++;
            node = node.next;
        }

        len -= k;

        node = head;
        LinkedList prev = head;

        while (len-- > 0 && head != null) {
            prev = head;
            head = head.next;
        }

        if (head == null) {
            return;
        }

        if (head.next == null) {
            prev.next = null;
            return;
        }

        while (head.next != null) {
            if (head.next.next == null) {
                head.value = head.next.value;
                head.next = null;
            } else {
                head.value = head.next.value;
                head = head.next;
            }
        }

    }

    public static void main(String[] args) {
        LinkedList list = LinkedList.from(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 });

        removeKthNodeFromEnd(list, 2);

        list.print();
    }
}

class LinkedList {
    int value;
    LinkedList next = null;

    LinkedList(int value) {
        this.value = value;
    }

    public static LinkedList from(int[] array) {
        LinkedList head = null;
        LinkedList tail = null;

        for (int n : array) {
            LinkedList node = new LinkedList(n);
            if (tail == null) {
                head = node;
                tail = head;
            } else {
                tail.next = node;
                tail = node;
            }
        }

        return head;
    }

    public void print() {
        LinkedList head = this;
        while (head != null) {
            System.out.print(head.value + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println("");
    }
}