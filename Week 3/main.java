import java.util.ArrayList;
import java.util.List;

class main {
    public static void main(String[] args) {

        Animal myPuppy = new Puppy(); //creating an object myPuppy from Puppy class
        myPuppy.eat();  //does the actions associated in the puppy eat method
        myPuppy.speak();
        myPuppy.fight();

        Animal tom = new Cat();
        tom.eat();
        tom.speak();
        tom.fight();
        tom.myHobby();





                // List<Integer> myIntList = new ArrayList<Integer>();  //interface allows you to use the same standard methods to access different data structures
        // //we are using list methods in this case to use the arraylist data structure
        
        // for(int i=0; i<10; i++){
        //     myIntList.add(i*30);
        // }
    
    
    
        // System.out.println(myIntList.toString());   
        // myIntList.remove(4);
        // System.out.println(myIntList.toString());

        // myIntList.set(4, 200);  
        // System.out.println(myIntList.toString());
        // System.out.println(myIntList.size());   //returns the length of array length

        // System.out.println(myIntList.isEmpty());  //boolean return of whether your list is empty or filled

        // myIntList.clear();
        // System.out.println(myIntList.isEmpty()); // boolean return. Now list is clear

        
        // interface is an abstract class used to group together a bunch of methods that give us a standard method to access different data structures
        
    }

}