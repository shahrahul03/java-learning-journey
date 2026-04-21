package overriding;

public class LaxmiBank extends CentralBank{
	@Override
	void getBankName() {
		System.out.println("Laxmi bank");
	}
	@Override
	void getInterestRate() {
		System.out.println("3%");
	}


}
