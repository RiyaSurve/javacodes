/*LinkedList has 2 constructors.
 * 1.Default constructor:LinkedList li = new LinkedList();
 * 2.Passing collection object: LinkedList li = new LinkedList(Collection object)
 * 
 * Second constructor example*/

import java.util.*;

class LinkedListMethods{

	public static void main(String[] args){

		LinkedList<String> li = new LinkedList<String>(); //restricting access to String
		li.add("Microsoft");
		li.add("Google");
		li.add("Amazon");

		System.out.println("LinkedList li: "+li);

		LinkedList<String> li2 = new LinkedList<String>(li);
		li2.add("TCS");
		li2.add("Wipro");
		li2.add("Jio");

		System.out.println("LinkedList li2: "+li2);

		System.out.println("");
		System.out.println("Elements of LinkedList li:");
		Iterator itr = li.iterator();
		while(itr.hasNext()){

			System.out.println(itr.next());   //printing elements one by one

		}
		
		System.out.println("");
		System.out.println("Elements of LinkedList li2:");
		Iterator itr1 = li2.iterator();
		while(itr1.hasNext()){

			System.out.println(itr1.next());   //printing elements one by one

		}

	}


}
