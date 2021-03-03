import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Set and map problems from Reges and Stepp's "Building Java Programs"
 * 
 * @author ?
 *
 */
public class SetsAndMapsSolution {
	/** Returns the number of unique elements in the supplied list.
	 * 
	 * 
	 * @param list the list of integers to be examined.
	 * @return the number of unique elements in list.
	 */
	public static int countUnique(ArrayList<Integer> list) {
		// Use a Set as auxiliary storage to solve this problem.

		Set<Integer> unique = new HashSet<Integer>(list);
		// Set<Integer> unique = new HashSet<>()

		// for (int i = 0; i < list.size(); i++){
		// 	unique.add(list.get(i));
		// }

		return unique.size();
	}


	/** Returns true iff a string appears at least three times in a given list.
	 * 
	 * 
	 * @param list the list of strings to be examined.
	 * @return true iff a string appears at least thrice in list
	 */
	public static boolean contains3(ArrayList<String> list) {
		Map<String, Integer> counts = new HashMap<String, Integer>();

		// For each color in "list"...
		// list2.add("Blue");
		// list2.add("Green");
		// list2.add("Red");
		// list2.add("Yellow");
		// list2.add("Red");
		// list2.add("Blue");
		// list2.add("Green");
		// list2.add("Red");
		for(String currentString: list) { // for each string in the list, where the current is the string in each iteration
			if(counts.containsKey(currentString)) {
				int numberBefore = counts.get(currentString);

				// It it was there two times,
				// I'm about to insert for the third time.
				// So, return right away.
				if(numberBefore == 2) {
					return true;
				}

				counts.put(currentString, numberBefore + 1);
			}
			else {
				counts.put(currentString, 1);
			}
		}

		return false; // placeholder for compilation
	}


	/** Returns the symmetric difference of the two input sets.
	 * 
	 * The symmetric difference of two sets s1 and s2 is the set containing
	 * all elements that are either in s1 or in s2, but not both.
	 * 
	 * @param set1 the first set.
	 * @param set2 the second set.
	 * @return a set containing the elements in the symmetric difference of
	 * set1 and set2.
	 */
	public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> symmetricDifference = new HashSet<Integer>();

		symmetricDifference.addAll(set1);

		for(int x : set2){
			if(symmetricDifference.contains(x)){
				symmetricDifference.remove(x);
			}
			else{
				symmetricDifference.add(x);
			}
		}

		return symmetricDifference;
	}

	/** Returns the mode value in a supplied list of integers.
	 * 
	 * The mode is the element in the list that appears most frequently. If
	 * the mode is not unique, then this method returns the smallest value. It
	 * is assumed that the input list is non-empty.
	 * 
	 * @param list a list of integers whose mode we wish to compute.
	 * @return an integer representing the mode of the input list.
	 */
	public static int mode(ArrayList<Integer> list) {
		// Think about your algorithm for solving the problem first. What
		// ADT makes sense here?

		Map<Integer, Integer> valueCount = new HashMap<Integer, Integer>();
		int max = 0; //the max value in list
		for(int x : list){
			if (x > max) max = x;
			if(valueCount.containsKey(x)){
				valueCount.put(x, valueCount.get(x) + 1);
			}
			else{
				valueCount.put(x, 1);
			}
		}

		int quantity = -1;
		int mode = max;

		for(int element: valueCount.keySet()) {
			if(valueCount.get(element) == quantity) {
				if(element < mode){
					mode = element;
				}
			}
			else if(valueCount.get(element) > quantity) {
				quantity = valueCount.get(element); //new mode amount
				mode = element;
			}
		}

		return mode;
	}  

	/** Tester method */
	public static void main(String[] args) {
		// Testing countUnique()
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);        
		list.add(20);
		list.add(10);
		list.add(10);

		System.out.println(countUnique(list)); // should print 3

		// Testing contains3()
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Blue");
		list2.add("Green");
		list2.add("Red");
		list2.add("Yellow");
		list2.add("Red");
		list2.add("Blue");
		list2.add("Green");
		list2.add("Red");

		System.out.println(contains3(list2)); // should print true

		list2.remove(list2.size() - 1); // removes the last element in list
		System.out.println(contains3(list2)); // should now print false

		/* Add your test cases for symmetricDifference and mode here */   

		// Testing symmetricDifference()
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		Set<Integer> symmetricDiff = new HashSet<Integer>();

		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		set1.add(7);

		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(9);
		set2.add(50);
		set2.add(62);
		set2.add(17);
		
		symmetricDiff = symmetricDifference(set1, set2);

		System.out.println(symmetricDiff.toString());
	}
}