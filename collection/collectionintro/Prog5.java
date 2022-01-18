/*Here we dont get an error because Object class is parent of all classes
 * */

class Demo{

	public static void main(String[] args){

	String s1 = "Riya";
	String s2 = "Chinu";
	
	Object arr[] = new Object []{s1,s2};

	for(int i=0;i<arr.length;i++){
	System.out.println(arr[i]);
	
	}
	
	
	}


}
