/*In vectors there are 4 constructors.
 * First constructor: Default constructor: Vector v = new Vector();
 * Second constructor:Passing initial capacity: Vector v = new Vector(int initCap)
 * Third constructor:Passing initial Capacity and Capacity Increment
 * Vector v = new Vector(int initCap,int CapacityIncrement)
 * Fourth constructor: Passing collection object as a parameter to Vector
 * Vector v = new Vector(collection object)
 *
 * Fourth Constructor i.e passing collection object to Vector's constructor as parameter example
 * and print even numbers. 
 * Lets see 2 methods inside Vector
 * 1.size : gives the count of elements in Vector
 * 2.capacity: gives the capacity of Vector.
 *
 * Bydefault capacity of Vector is 10.
 * If we try to enter elements more than the default capacity i.e here in this case if we try
 * to enter more than 10 elements,then new capacity = old capacity * 2
 * */

import java.util.*;

class VectorDemo{

	public static void main(String[] args){

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(200);

		Vector<Integer> v = new Vector<Integer>(al);  /*Fourth constructor:passing 
								collection object as a param*/
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);

		System.out.println(v);

		System.out.println("Size: "+v.size());        //6
		System.out.println("Capacity: "+v.capacity()); //10

		System.out.println("");
		System.out.println("Elements which are divisible by 4 are:");
		Enumeration e = v.elements();
		while(e.hasMoreElements()){
		
			Integer obj = (Integer)e.nextElement();
			if(obj%4 == 0){
			
				System.out.println(obj);
			}
		
		}
	}


}
