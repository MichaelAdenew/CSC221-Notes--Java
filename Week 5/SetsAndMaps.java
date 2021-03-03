import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

/**
 * Set and map problems from Reges and Stepp's "Building Java Programs"
 * 
 * @author Michael A.
 *
 */
public class SetsAndMaps {
	/** Returns the number of unique elements in the supplied list.
	 * 
	 * 
	 * @param list the list of integers to be examined.
	 * @return the number of unique elements in list.
	 */
	public static int countUnique(ArrayList<Integer> list) {
		// Use a Set as auxiliary storage to solve this problem.
		Set<Integer> UniqueLetterCounter = new HashSet<Integer>();
		for (int i = 0; i < list.size(); i++){
			UniqueLetterCounter.add(list.get(i));
		}

		return UniqueLetterCounter.size(); // placeholder for compilation
	}


	/** Returns true iff a string appears at least three times in a given list.
	 * 
	 * 
	 * @param list the list of strings to be examined.
	 * @return true iff a string appears at least thrice in list
	 */
	public static boolean contains3(ArrayList<String> list) {

		Map<String, Integer> counts = new HashMap<String, Integer>();

		

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
		/* Note: you are returning a *new* set containing the symmetric
		 * difference. You should *not* modify set1 or set2. */

		 Set<Integer> symmetricDifference = new HashSet<Integer>();
		//  symmetricDifference.removes()
		 
		

		return null; // placeholder for compilation
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
       
       return 0; // placeholder for compilation
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
	}
}