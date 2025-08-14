package Set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample
{
    public static void main(String[] args)
    {
        TreeSet<Integer> nums = new TreeSet<>();
        nums.add(5); nums.add(2); nums.add(3); nums.add(4);
        System.out.println(nums);
        NavigableSet<Integer> head = nums.headSet(5, true);
        System.out.println("<= 5: " + head);
        System.out.println("First: " + nums.first());
        System.out.println("Last: " + nums.last());
    }
}
