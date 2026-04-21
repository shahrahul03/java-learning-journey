package overriding;

public class PrabhuBank extends CentralBank{
	@Override
	void getBankName() {
		System.out.println("prabhu bank");
	}
	
	@Override
	void getInterestRate() {
		System.out.println("20%");
	}
	

}
