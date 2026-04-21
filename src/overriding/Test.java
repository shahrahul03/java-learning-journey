package overriding;

public class Test {
	public static void main(String[] args) {
		PrabhuBank pb = new PrabhuBank();
		pb.getBankName();
		pb.getInterestRate();
//		up-casting 
		CentralBank bank = new NMBBank();
		bank.getBankName();
		bank.getInterestRate();
	}
//	dynamic or late binding of object
//	runtime polymorphism 
	void printBAnkInfo (CentralBank bank) {
		bank.getBankName();
		bank.getInterestRate();
	}
	

}
