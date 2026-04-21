package abstraction;

public class Test {
	public static void main(String[] args) {
//		CentralBank c = new CentralBank(); // can not create object of abstract class 
		CentralBank n = new NabilBank();
		n.getBankName();
		n.getInterestRate();
		UserService user = new UserServiceImpl() ;
		user.addUser();
		user.deleteUser();
		CommonService us = new UserServiceImpl();
		us.print();
		user.print();
	}

}
