package overriding;

public class NMBBank extends CentralBank{
	@Override
	void getBankName() {
		// TODO Auto-generated method stub
		System.out.println("NMB Bank");
	}
	@Override
	void getInterestRate() {
		// TODO Auto-generated method stub
		System.out.println("8%");
	}

}
