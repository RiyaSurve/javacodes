/*Using Iterator cursor in Vector*/

import java.util.*;

class IteratorDemo{

	public static void main(String[] args){
	
	Vector v = new Vector();
	v.addElement(10);
	v.addElement(20);
	v.addElement(30);
	v.addElement(40);
	v.addElement(50);

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
