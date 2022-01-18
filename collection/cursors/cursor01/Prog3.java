/*To remove the note we can allow only Strings to be inserted in the ArrayList
 *The need of the cursor comes  if we have to fetch the element or we if we have to perform any
 operations on the element of ArrayList
 * */

import java.util.*;


class Demo{

	public static void main(String[] args){

		ArrayList<String> al = new ArrayList<String>();


		al.add("Riya");
		al.add("Chinu");

	//      a1.add(10);  this will give error
		

		System.out.println(al);  // Riya Chinu

	}

}
