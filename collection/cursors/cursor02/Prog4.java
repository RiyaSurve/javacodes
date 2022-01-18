/*Using Iterator cursor in ArrayList*/

import java.util.*;

class IteratorDemo{

	public static void main(String[] args){
	
	ArrayList<Integer> v  = new ArrayList<Integer>(); //Allowing only integer values to be 
							  //inserted in ArrayList and thus 
							  //avoiding the note coming as unsafe.
	v.add(10);
	v.add(20);
	v.add(30);
	v.add(40);
	v.add(50);

	Iterator i = v.iterator();

	while(i.hasNext()){
	
	Integer val = (Integer)i.next();

	if(val%4 == 0){
	
		i.remove();
	
	}
	
	}
	
		System.out.println(v);
	
	}


}
