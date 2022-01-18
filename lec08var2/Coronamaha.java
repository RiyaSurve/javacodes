public class Coronamaha{

	int count = 1000;
	void precaution(){
		System.out.println("Take care!!");
		System.out.println("Count = "+count);


	}

	static void impDecision(){
		System.out.println("CM'S Decision!!");
	}

	public static void main(String[] args){

	Coronamaha.impDecision(); // or impDecision(); gives same result.
	Coronamaha June28 = new Coronamaha();
	June28.precaution();
	June28.impDecision();

	System.out.println("JUne29");

	Coronamaha June29 = new Coronamaha();
	June29.count = 2000;
	June29.precaution();
	June29.impDecision();




	}
}
