package Programs.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collection_Interface {

    public static void main(String[] args) {

        // ArrayList is used for providing dynamic arrays with indexed access.

        System.out.println("---------------------");
        System.out.println("Collection ArrayList..");
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);

        // System.out.println(nums);
        for (int n : nums) {
            System.out.println(n);
        }

        // TreeSet is used for to ensuring elements are stored in sorted order.
        System.out.println();
        System.out.println("---------------------");
        System.out.println("Collection TreeSet..");
        Collection<Integer> nums_collection = new TreeSet<Integer>();
        nums_collection.add(29);
        nums_collection.add(25);
        nums_collection.add(9);
        nums_collection.add(2);

        System.out.println(nums_collection);

        // ArrayList is used for providing dynamic arrays with indexed access.
        System.out.println();
        System.out.println("---------------------");
        System.out.println("List ArrayList..");
        List<Integer> num_list = new ArrayList<Integer>();
        num_list.add(29);
        num_list.add(25);
        num_list.add(9);
        num_list.add(2);
        System.out.println(num_list);
        System.out.println("element 9 on index " + num_list.indexOf(9));

        // HashSet is used for offering fast access and ensuring uniqueness of elements.
        System.out.println();
        System.out.println("---------------------");
        System.out.println("Set HashSet..");
        Set<Integer> num_set = new HashSet<Integer>();
        num_set.add(29);
        num_set.add(25);
        num_set.add(9);
        num_set.add(2);
        num_set.add(29);
        System.out.println(num_set);

        // Iterator is used for iterate value
        System.out.println();
        System.out.println("---------------------");
        Iterator<Integer> values = num_set.iterator();
        values.hasNext();// hasNext and next both are used for print next element..

        while (values.hasNext()) {
            System.out.println(values.next());
        }

        // MAP
        // Map is working on key and value pair..
        System.out.println();
        System.out.println("---------------------");
        System.out.println("Map..");
        Map<String, Integer> student = new HashMap<>();
        student.put("Om", 76);
        student.put("Het", 29);
        student.put("Mahesh", 30);
        student.put("Babu", 50);

        System.out.println(student);
        System.out.println("Key is Om and value is " + student.get("Om"));
        System.out.println("All the keys in MAP " + student.keySet());
        System.out.println("All the values in MAP " + student.values());
        System.out.println("Remove value on key Mahesh " + student.remove("Mahesh"));

        for (String name : student.keySet()) {
            System.out.println(name + " : " + student.get(name));
        }
    }
}
