package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        /*
            Purpose: Provides a uniform way to traverse collections, element by element, regardless of type
            Common Methods:
                'hasNext()': Returns true if there is a next element
                'next()': Returns next element
                'remove()': Removes last returned item by 'next()'
            Iterators are especially useful for removing items while iterating
         */

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
