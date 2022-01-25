/*Constructors of ArrayList in java
 * 1.ArrayList al = new ArrayList();   //normal constructor
 * 2.ArrayList al = new ArrayList(int initilCapacity)  //passing initial capacity to ArrayList
 * 3.ArrayList al = new ArrayList(Collection object //passing Collection object as a parameter*/

/*Example of first constructor
 * size() method gives the count of elements inside ArrayList
 * */

import java.util.*;

class Demo{

	public static void main(String[] args){
	
		ArrayList al = new ArrayList();

		al.add(10);
		System.out.println(al.size()); //1
		
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		System.out.println(al.size()); //5

	
	}


}
