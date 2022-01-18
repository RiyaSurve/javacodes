import java.util.*;

class EnumCursor{

	public static void main(String[] args){
	
	Vector v = new Vector();
	v.addElement(10);
	v.addElement(20);
	v.addElement(30);
	v.addElement(40);
	v.addElement(50);

	System.out.println(v); //10 20 30 40 50

	Enumeration e = v.elements();

	while(e.hasMoreElements()){
	
	Integer val = (Integer)e.nextElement();
	System.out.println(val);  
	
	}
	

	}

}
