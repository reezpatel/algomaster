class Main {
    public static int getClosest(BST node, int target, int min, int value) {
        if (node == null) {
            return value;
        }
        int delta = Math.abs(node.value - target);
        if (delta < min) {
            min = delta;
            value = node.value;
        }

        if (node.value < target) {
            return getClosest(node.right, target, min, value);
        }

        return getClosest(node.left, target, min, value);
    }

    public static int closestNum(BST tree, int target) {
        // {minValue, minDifference}
        int answer = getClosest(tree, target, Integer.MAX_VALUE, -1);
        return answer;
    }

    public static void main(String[] args) {
        BST head = new BST(100);

        head.insert(5).insert(15).insert(5).insert(2).insert(1).insert(22).insert(1).insert(1).insert(3).insert(1)
                .insert(1).insert(502).insert(55000).insert(204).insert(205).insert(207).insert(206).insert(208)
                .insert(203).insert(-51).insert(-403).insert(1001).insert(57).insert(60).insert(4500);

        int answer = closestNum(head, 100);
        assert answer == 100 : "Wrong Answer";
        System.out.println("Correct Answer");

    }

    static class BST {
        public int value;
        public BST right;
        public BST left;

        public BST(int value) {
            this.value = value;
            this.right = null;
            this.left = null;
        }

        public BST insert(int num) {
            BST node = new BST(num);

            BST original = this;
            BST prev = this;
            BST head = this;

            while (head != null) {
                prev = head;
                if (num > head.value) {
                    head = head.right;
                } else {
                    head = head.left;
                }
            }

            if (num > prev.value) {
                prev.right = node;
            } else {
                prev.left = node;
            }

            return original;
        }
    }
}