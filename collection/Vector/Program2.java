/*In vectors there are 4 constructors.
 * First constructor: Default constructor: Vector v = new Vector();
 * Second constructor:Passing initial capacity: Vector v = new Vector(int initCap)
 * Third constructor:Passing initial Capacity and Capacity Increment
 * Vector v = new Vector(int initCap,int CapacityIncrement)
 * Fourth constructor: Passing collection object as a parameter to Vector
 * Vector v = new Vector(collection object)
 *
 * Second Constructor i.e passing initial capacity to Vector's constructor example and print
 * even numbers. 
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

		Vector<Integer> v = new Vector<Integer>(11);  //Second constructor passing initcap
		v.addElement(10);
		
		System.out.println("Size: "+v.size());        //1
		System.out.println("Capacity: "+v.capacity()); //11

		
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);
		v.addElement(60);
		v.addElement(70);
		v.addElement(80);
		v.addElement(90);
		v.addElement(100);

		System.out.println("Size: "+v.size());        //10
		System.out.println("Capacity: "+v.capacity()); //11


		v.addElement(110);


		System.out.println("Size: "+v.size());        //11
		System.out.println("Capacity: "+v.capacity()); //11

		v.addElement(120);  //Adding 12th element i.e beyond initialcapacity

		System.out.println("Size: "+v.size());        //12
		System.out.println("Capacity: "+v.capacity()); //22 i.e 11*2 = 22

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
