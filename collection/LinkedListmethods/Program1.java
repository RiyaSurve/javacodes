/*LinkedList has 2 constructors.
 * 1.Default constructor:LinkedList li = new LinkedList();
 * 2.Passing collection object: LinkedList li = new LinkedList(Collection object)
 * 
 * First constructor example*/

import java.util.*;

class LinkedListMethods{

	public static void main(String[] args){

		LinkedList<String> li = new LinkedList<String>(); //restricting access to String
		li.add("Microsoft");
		li.add("Google");
		li.add("Amazon");

		System.out.println(li);

		Iterator itr = li.iterator();
		while(itr.hasNext()){

			System.out.println(itr.next());   //printing elements one by one

		}

	}


}
