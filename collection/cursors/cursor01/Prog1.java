/* List is an in interface inside which ArrayList is a class in which we can store diferent 
 * types of objects .Of any type.Ignore the note as it says it is unchecked or unsafe operat
 * ions. It advices us not to do so and store similar types of data in ArrayList to above 
 * further errors if we try to perform a calculation on it.
 *
 * In the output we get all values at once. To get single value and perform operations on the
 * single value of ArrayList we require cursors.*/

import java.util.*;


class Demo{

	public static void main(String[] args){

		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20);
		al.add(30);
		

		System.out.println(al);

	}

}
