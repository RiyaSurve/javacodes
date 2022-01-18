import java.util.*;

class ListIteratorDemo{

	public static void main(String[] args){
	
	Vector<Integer> v = new Vector<Integer>(); //allowing only integer values

	v.addElement(10);
	v.addElement(20);
	v.addElement(30);
	v.addElement(40);
	v.addElement(50);

	System.out.println(v);

	ListIterator e = v.listIterator();

	while(e.hasNext()){
	
	Integer val = (Integer)e.next();
	
	System.out.println(val);
	
	}

	System.out.println("Now Reversing");

	while(e.hasPrevious()){
	
	Integer val = (Integer)e.previous();
	
	System.out.println(val);
	
	}


	
	}



}
