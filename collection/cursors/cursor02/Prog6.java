/*Operations Performed on Vector using ListIterator cursor's methods.
 * 1.hasNext()
 * 2.next()
 * 3.hasPrevious()
 * 4.previous()
 * 5.add
 * 6.set
 * 7.remove.
 * 8.previousIndex()
 * 9.nextIndex()
 * */

import java.util.*;

class ListIteratorDemo{

	public static void main(String[] args){

		Vector<Integer> v = new Vector<Integer>(); //allowing only integer values

		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);


		ListIterator e = v.listIterator();

		System.out.println("PreviousIndex = " + e.previousIndex());
		System.out.println("NextIndex = " + e.nextIndex());

		System.out.println("");
		System.out.println("Taking the index position upto further 2 positions and then check previous and next indexes");

		e.next();
		e.next();

		System.out.println("PreviousIndex = " + e.previousIndex());
		System.out.println("NextIndex = " + e.nextIndex());

		System.out.println("");
		System.out.println("All entered elements");
		System.out.println(v);

		System.out.println("");
		System.out.println("IF value is 20 change it to 60");

		//Using hasNext(),next(),set()

		while(e.hasNext()){

			Integer val = (Integer)e.next();

			if(val == 20){

				e.set(60);                  //set to  60

			}

		}
		System.out.println(v);


		System.out.println("");
		System.out.println("If any value is 40 then add one more element i.e 90");

		//Using hasPrevious(),previous(),add()
		while(e.hasPrevious()){

			Integer val = (Integer)e.previous();

			if(val == 40){   //add element 90

				e.add(90);
			}

		}


		System.out.println(v);

		System.out.println("");
		System.out.println("If any value is 50 then remove that particular element");

		//Using hasNext(),next(),remove()
		while(e.hasNext()){

			Integer val = (Integer)e.next();

			if(val==50){


				e.remove();
			}

		}

		System.out.println(v);

		System.out.println("");
		System.out.println("PreviousIndex = " + e.previousIndex());
		System.out.println("NextIndex = " + e.nextIndex());

	}




}
