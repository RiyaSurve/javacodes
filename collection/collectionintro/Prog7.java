/*Here we  dont get an error because Object class is parent of all classes
 * 
 * */

class Demo{

	public static void main(String[] args){

	String s1 = new String ("Riya");
	String s2 = new String ("Chinu"); //creating obj of String using String class

	StringBuffer s3 = new StringBuffer("Core2Web");
	StringBuffer s4 = new StringBuffer ("Biencaps");//creating obj of String using 
							//StringBuffer
	
	Object arr[] = new Object []{s1,s2,s3,s4};

	for(int i=0;i<arr.length;i++){
	System.out.println(arr[i]);
	
	}
	
	
	}


}
