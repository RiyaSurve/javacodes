/*Parent child relationship is also allowed here.As List is parent of ArrayList
 *The need of the cursor comes  if we have to fetch the element or we if we have to perform any
 operations on the element of ArrayList
 * */

import java.util.*;


class Demo{

	public static void main(String[] args){

		List al = new ArrayList();

		//LinkedList l = new ArrayList(); This is not allowed because LinkedList is not
		//a parent of ArrayList.They both are brothers and are child of List.

		al.add("Riya");
		al.add("Chinu");

	 	  al.add(10);  
		

		System.out.println(al);  // Riya Chinu 10

	}

}
