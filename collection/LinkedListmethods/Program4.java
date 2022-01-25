/*LinkedList Methods*/

import java.util.*;
class LinkedListMethods{

public static void main(String[] args){

	LinkedList li = new LinkedList();
	
	li.add("Microsoft");
	li.add("Google");
	li.add("Amazon");
	li.add("Apple");
	li.add("Microsoft");	
	
	System.out.println(li);

	//add
	li.add(5,"Tesla");
	System.out.println(li);

	//getFirst
	System.out.println(li.getFirst()); // returns first element: Microsoft

	//getLast
	System.out.println(li.getLast());  //returns last element: Microsoft

	//remove
	li.remove("Microsoft");
	System.out.println(li);            //removes Microsoft

	//remove(index)
	li.remove(1);                      //Amazon will be removed
	System.out.println(li); 

	//removeFirst
	li.removeFirst();                  //Google will be removed
	System.out.println(li); 

	//removeLast
	li.removeLast();                   //Tesla will be removed
	System.out.println(li); 
	
	//size
	System.out.println("Size: "+li.size());    //count of elements:2
	
	//set                    
	li.set(0,"Google");               //setting a new value  at that index
	System.out.println(li); 

	//indexOf
	System.out.println("Index of Google: "+li.indexOf("Google"));
	
	//lastIndexOf
	System.out.println("Index of Microsoft: "+li.indexOf("Microsoft"));

	//clone
	LinkedList li2 = (LinkedList)li.clone();
	System.out.println("LinkedList l2: " + li2);
	
	//clear
	li2.clear();
	System.out.println("LinkedList l2: " + li2);
		

}

}
