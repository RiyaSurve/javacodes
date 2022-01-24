/*Thus with the help of addAll() method we could send one complete arrayList object as a 
 * parameter or as a whole different element to ArrayList2 */

import java.util.*;

class Prog1{

	public static void main(String[] args){

		ArrayList<Integer> al1 = new ArrayList<Integer>();

		al1.add(10);
		al1.add(20);
		al1.add(30);

		System.out.println(al1);

		ArrayList<Integer> al2 = new ArrayList<Integer>();

		//Using the addAll() method of List Interface

		al2.add(40);
		al2.add(50);
		al2.add(60);

		al2.addAll(al1); //All the elements of ArrayList al1 will also be added in al2

		System.out.println(al2);

	}


}
