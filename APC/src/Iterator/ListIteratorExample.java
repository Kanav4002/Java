package Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("one", "two", "three"));
        ListIterator<String> it = list.listIterator();
        System.out.print("Forward: ");
        while(it.hasNext()) System.out.print(it.next() + " ");
        System.out.print("\nBackward: ");
        while(it.hasPrevious()) System.out.print(it.previous() + " ");
    }
}
