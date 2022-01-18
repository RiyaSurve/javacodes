/*Here we  get an error because StringBuffer cannot be converted to String as they both are
 * different classes.
 * */

class Demo{

	public static void main(String[] args){

	String s1 = new String ("Riya");
	String s2 = new String ("Chinu"); //creating obj of String using String class

	StringBuffer s3 = new StringBuffer("Core2Web");
	StringBuffer s4 = new StringBuffer ("Biencaps");//creating obj of String using 
							//StringBuffer
	
	String arr[] = new String []{s1,s2,s3,s4};

	for(int i=0;i<arr.length;i++){
	System.out.println(arr[i]);
	
	}
	
	
	}


}
