import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[] { 48, 12, 24, 7, 8, -5, 24, 391, 24, 56, 2, 6, 8, 41 };
        List<Integer> list = Arrays.asList(array);

        MinHeap heap = new MinHeap(list);
        heap.print();
        heap.insert(76);
        heap.print();
        heap.remove();
        heap.print();
        heap.remove();
        heap.print();

    }
}

class MinHeap {
    List<Integer> heap = new ArrayList<Integer>();

    public MinHeap(List<Integer> array) {
        heap = buildHeap(array);
    }

    public List<Integer> buildHeap(List<Integer> array) {
        Iterator<Integer> it = array.iterator();

        while (it.hasNext()) {
            this.insert(it.next());
        }

        return heap;
    }

    public void siftDown(int currentIdx, int endIdx, List<Integer> heap) {
        swap(currentIdx, endIdx, heap);

        int childA = fistChild(currentIdx);
        int childB = secondChild(currentIdx);

        while (!isLeaf(currentIdx, heap)
                && (heap.get(currentIdx) > heap.get(childA) || heap.get(currentIdx) > heap.get(childB))) {

            int childIndex = childA;
            if (heap.get(childA) > heap.get(childB)) {
                childIndex = childB;
            }

            swap(currentIdx, childIndex, heap);
            currentIdx = childIndex;

            childA = fistChild(currentIdx);
            childB = secondChild(currentIdx);
        }

    }

    public void siftUp(int currentIdx, List<Integer> heap) {
        int parent = parentIndex(currentIdx);

        while (heap.get(parent) > heap.get(currentIdx) && currentIdx != 0) {
            swap(parent, currentIdx, heap);

            currentIdx = parent;
            parent = parentIndex(currentIdx);
        }
    }

    public int peek() {
        return heap.get(0);
    }

    public int remove() {
        int num = heap.get(0);
        this.siftDown(0, heap.size() - 1, heap);
        heap.remove(heap.size() - 1);
        return num;
    }

    public void insert(int value) {
        int index = heap.size();
        heap.add(value);
        this.siftUp(index, heap);
    }

    private static int parentIndex(int index) {
        return (int) Math.floor((index - 1) / 2);
    }

    private static int fistChild(int index) {
        return 2 * index + 1;
    }

    private int secondChild(int index) {
        return 2 * index + 2;
    }

    private void swap(int i, int j, List<Integer> heap) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    private boolean isLeaf(int i, List<Integer> heap) {
        return 2 * i + 1 >= heap.size();
    }

    public void print() {
        Iterator<Integer> it = heap.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("");
    }
}