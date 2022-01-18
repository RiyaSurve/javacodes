/*Now in this code we will perform operations on the Vector using Enum Cursor*/

import java.util.*;

class EnumCursor{

	public static void main(String[] args){
	
	Vector<Integer> v = new Vector<Integer>();
	v.addElement(10);
	v.addElement(20);
	v.addElement(30);
	v.addElement(40);
	v.addElement(50);

	System.out.println(v); //10 20 30 40 50

	Enumeration e = v.elements();

	while(e.hasMoreElements()){
	
	Integer val = (Integer)e.nextElement();
	
	if(val%4 == 0){
	
		System.out.println(val);  // 20 40
	
	}
	}
	
	System.out.println(v);  //10 20 30 40 50

	}

}
