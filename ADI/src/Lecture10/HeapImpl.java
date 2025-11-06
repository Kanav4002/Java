package Lecture10;

import java.util.*;

public class HeapImpl {
    List<Integer> heap = new ArrayList<>();
    public int parent(int ci) {
        return (ci - 1) / 2;
    }

    private void swap(int ci, int pi) {
        int v1 = heap.get(ci);
        int v2 = heap.get(pi);
        heap.set(pi, v1);
        heap.set(ci, v2);
        // or using Collections.swap(heap, ci, pi);
    }

    public void Insert(int data) {
        heap.add(data);
        int ci = heap.size() - 1;

        while (ci > 0 && heap.get(ci) < heap.get(parent(ci))) {
            swap(ci, parent(ci));
            ci = parent(ci);
        }
    }

    /*
        Returns the smallest element and maintains the heap
     */
    public int get() {
        int ans = heap.get(0);                  // smallest element
        int last = heap.remove(heap.size() - 1);

        if (heap.size() > 0) {
            heap.set(0, last);
            int pi = 0;

            while (true) {
                int lc = 2 * pi + 1;
                int rc = 2 * pi + 2;
                int min = pi;

                if (lc < heap.size() && heap.get(lc) < heap.get(min)) {
                    min = lc;
                }

                if (rc < heap.size() && heap.get(rc) < heap.get(min)) {
                    min = rc;
                }

                if (min == pi) break;

                swap(pi, min);
                pi = min;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        HeapImpl h = new HeapImpl();
        h.Insert(50);
        h.Insert(40);
        h.Insert(30);
        h.Insert(20);
        h.Insert(10);

        System.out.println("Internal heap array = " + h.heap);

        System.out.println("Extracting elements:");
        while (!h.heap.isEmpty()) {
            System.out.print(h.get() + " ");
        }
    }
}
