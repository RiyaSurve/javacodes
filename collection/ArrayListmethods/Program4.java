/*ArrayList methods
 *
 * 1.add(index,object):Adding element in between to ArrayList
 * 2.indexOf(object) : gives index of object present at begining
 * 3.lastIndexOf(object) : gives index of object present at last
 * 4.size : gives the size of elements in ArrayList
 * 5. remove(int): Removes the element by index.
 * 6. remove(object):Removes the element
 * If there are duplicate elements then remove(object) removes only the element from start.
 * 
 * 7.clone
 *Creating a cpy of our ArrayList
 * ArrayList al2 = al.clone();
 * But this will give error as incompatible type  because return type of clone is Object and
 * Object class cannot be converted to ArrayList.So we need to typecast it.
 *
 * 8.clear :clears the array list completely.
 * 9.set(index,obj) :Replace a value with that particular index and object
 * */


import java.util.*;

class ArrayListMethods{


	public static void main(String[] args){
	
	ArrayList<String> al = new ArrayList<String>();
	al.add("Microsoft");
	al.add("Google");
	al.add("Tesla");
	al.add("Amazon");
	al.add("Apple");
	al.add("Google");

	System.out.println(al);  //MGTAAG

	//add(index,obj)
	
	al.add(2,"Oracle");
	System.out.println(al); //MGOTAAG
	
	//indexOf(object)
	
	System.out.println(al.indexOf("Google")); //2

	//lastIndexOf(object)
	
	System.out.println(al.lastIndexOf("Google")); //6

	//size()
	
	System.out.println("Size of ArrayList: "+al.size());  //7

	//remove(int)
	System.out.println("Removed element :" +al.remove(2));
	System.out.println(al);

	//remove(Object)
	al.remove("Google"); 
	System.out.println(al); 
	
	//clone
	ArrayList al2 =(ArrayList) al.clone();
	System.out.println(al2);

	//clear
	al2.clear();
	System.out.println(al2);

	
	al.set(3,"IBM"); //replaces the value at index 3

	

	System.out.println("ArrayList al = " + al);  //It will print as it is
	}

	
}
/*Output:
 *[Microsoft, Google, Tesla, Amazon, Apple, Google]
[Microsoft, Google, Oracle, Tesla, Amazon, Apple, Google]
1
6
Size of ArrayList: 7
Removed element :Oracle
[Microsoft, Google, Tesla, Amazon, Apple, Google]
[Microsoft, Tesla, Amazon, Apple, Google]
[Microsoft, Tesla, Amazon, Apple, Google]
[]
ArrayList al = [Microsoft, Tesla, Amazon, IBM, Google]


 *
 * */
