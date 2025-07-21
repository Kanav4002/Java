package ArrayL;

import java.util.ArrayList;

public class AL {
    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<>();
//        ArrayList<Integer> number = new ArrayList<>(20);
//        names.add("Kanav");
//        number.addFirst(1);
//        number.add(2);
//        number.add(3);
//        number.add(4);
//        number.addLast(5);
//        System.out.println(names);
//        System.out.println(number);

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        System.out.println(fruits);
        fruits.add(1, "orange");
        System.out.println(fruits);

//        get(index) : Retrieves the element at the specified index. Remember that indexing
        String fruit = fruits.get(1);
        String fruit1 = fruits.getFirst();
        System.out.println(fruit);
        System.out.println(fruit1);

//        size() : Returns the number of elements currently in the ArrayList.
        int numberOfFruits = fruits.size();
        System.out.println(numberOfFruits);

//        remove(index) : Removes the element at the specified index.
//        Elements after the removed element are shifted to the left. Returns the removed element.
        String removeElement = fruits.remove(2);
        System.out.println(removeElement);
        System.out.println(fruits);


    }
}
