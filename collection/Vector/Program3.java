/*In vectors there are 4 constructors.
 * First constructor: Default constructor: Vector v = new Vector();
 * Second constructor:Passing initial capacity: Vector v = new Vector(int initCap)
 * Third constructor:Passing initial Capacity and Capacity Increment
 * Vector v = new Vector(int initCap,int CapacityIncrement)
 * Fourth constructor: Passing collection object as a parameter to Vector
 * Vector v = new Vector(collection object)
 *
 * Third Constructor i.e passing initial capacity and capacity incremet as parameter to Vector's 
 * constructor example  and print even numbers. 
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

		Vector<Integer> v = new Vector<Integer>(11,5);/*This means if 12th element comes
							      then increase capacity by 5 and
							      dont double .*/ 
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
		System.out.println("Capacity: "+v.capacity()); //11+ 5 = 16
							      /*Here also now we can enter 5 
							       * elements as capacity will be 16
							       *And we try to enter more than
							        *16 elements then new capacity
								will again be 16+5 = 21
								*/

		v.addElement(130);
		v.addElement(140);
		v.addElement(150);
		v.addElement(160);

		System.out.println("Size: "+v.size());        //16
		System.out.println("Capacity: "+v.capacity()); // 16

		v.addElement(170); //Adding 17th element
		

		System.out.println("Size: "+v.size());        //17
		System.out.println("Capacity: "+v.capacity()); // 16+5 = 21

		System.out.println("Thus capacity goes on increasing by capacity increment value specified once the limit extends.And the capacity increment value is the second value passed to the constructor after initialCapacity.");

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
