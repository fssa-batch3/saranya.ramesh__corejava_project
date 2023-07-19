package day07.practice;
import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
        ArrayList<Integer> numbersWithDuplicates = new ArrayList<>();
        numbersWithDuplicates.add(1);
        numbersWithDuplicates.add(2);
        numbersWithDuplicates.add(3);
        numbersWithDuplicates.add(2);
        numbersWithDuplicates.add(4);
        numbersWithDuplicates.add(1);
        
        System.out.println("Original List with Duplicates: " + numbersWithDuplicates);
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbersWithDuplicates);
        numbersWithDuplicates.clear();
        numbersWithDuplicates.addAll(uniqueNumbers);
        System.out.println("List after removing duplicates: " + numbersWithDuplicates);
    }
}
