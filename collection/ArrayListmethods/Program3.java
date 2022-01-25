/*Constructors of ArrayList in java
 * 1.ArrayList al = new ArrayList();   //normal constructor
 * 2.ArrayList al = new ArrayList(int initilCapacity)  //passing initial capacity to ArrayList
 * 3.ArrayList al = new ArrayList(Collection object //passing Collection object as a parameter*/

/*Example of third constructor in ArrayList
 * We can also pass one collection object to another collection as  a parameter.
 * size() method gives the count of elements inside ArrayList
 * */

import java.util.*;

class Demo{

	public static void main(String[] args){

		ArrayList<Integer> al1 = new ArrayList<Integer>();

		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);

		System.out.println(al1); //10 20 30 40 50

		ArrayList al2 = new ArrayList(al1);
		al2.add(60);
		al2.add(70);

		System.out.println(al2); //10 20 30 40 50 60 70




	}


}
