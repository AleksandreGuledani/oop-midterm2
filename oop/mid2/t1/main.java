package oop.mid2.t1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ListTransformer
 * 
 * This program:
 * 1) Constructs list3 from list1 and list2 using the formula:
 *    index = (value * 2) - 1
 * 2) Deletes every second element from list3 by removing all elements at even indices.
 */
public class ListTransformer {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(9, 7, 5, 9, 8, 3, 3, 9, 9, 6, 4, 6, 9);

        List<String> list2 = Arrays.asList(
            "UEIG4", "wQgx", "13rw", "Ojg", "Fqmw", "Ugs", "Jjlnl", "uGr4", "tXu",
            "lpuz", "M4s9Q", "Wh8x", "0Q9c", "Me9w", "q9iI0", "SZ3", "kGp", "OwY"
        );

        List<String> list3 = new ArrayList<>();
        for (Integer value : list1) {
            int index = (value * 2) - 1;
            String element = list2.get(index);
            list3.add(element);
        }

        System.out.println("Original list3:");
        System.out.println(list3);

        // Delete every second element (all even indices)
        for (int i = list3.size() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.println("Removing element at index " + i + ": " + list3.get(i));
                list3.remove(i);
            }
        }

        System.out.println("\nlist3 after removing every second element:");
        System.out.println(list3);
    }
}
