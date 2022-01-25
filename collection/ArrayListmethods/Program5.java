/*Practice of all methods of ArrayList*/

import java.util.*;
class ArrayListPractice{

public static void main(String[] args){


	ArrayList<String> al = new ArrayList<String>();  //restricting it to String type
	al.add("Riya");
	al.add("Shruti");
	al.add("Riya");

	System.out.println(al);

	//add(index,object)
	al.add(2,"Priyanshu");
	System.out.println(al);

	//indexOf(object)
	System.out.println(al.indexOf("Riya"));  //0

	//lastIndexOf(object)
	System.out.println(al.lastIndexOf("Riya")); //2

	//size
	System.out.println("Size of ArrayList:" + al.size());  //4

	//remove(index)
	System.out.println("Removed element: " + al.remove(3));
	System.out.println(al);


	//remove(object)
	al.remove("Priyanshu");
	System.out.println(al); 

	//clone
	ArrayList al2 = (ArrayList)al.clone();
	System.out.println("ArrayList al2 : " + al2);	

	//clear
	 al2.clear();
	 System.out.println("ArrayList a2 after clear() :" +al2);
}

}

/*Output:
 *[Riya, Shruti, Riya]
[Riya, Shruti, Priyanshu, Riya]
0
3
Size of ArrayList:4
Removed element: Riya
[Riya, Shruti, Priyanshu]
[Riya, Shruti]
ArrayList al2 : [Riya, Shruti]
ArrayList a2 after clear() :[]

 * */
