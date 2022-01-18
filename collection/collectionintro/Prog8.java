class StateCapital{

	String state = null;
	String capital = null;

StateCapital(String state,String capital){

	this.state = state;
	this.capital = capital;
}

}



class Demo{

	public static void main(String[] args){
	
	StateCapital s1 = new StateCapital("Maharashtra","Mumbai");
	StateCapital s2 = new StateCapital("Karnataka","Banglore");
	StateCapital s3 = new StateCapital("Jharkhand","Ranchi");
	StateCapital s4 = new StateCapital("Goa","Panji");
	
	StateCapital arr[] = new StateCapital[]{s1,s2,s3,s4};

	for(int i=0;i<arr.length;i++){
	
		System.out.println(arr[i].state +" capital  = " + arr[i].capital);
	}
	
	}


}
