package abstraction;

public class Abstractio {
	/*
	 * process of hiding implementation details.
	 * to achieve abstraction:
	 * 1. Abstract class;
	 * class which contains abstract methods and non-abstract methods.
	 * abstract methods;
	 * method which does not have body /implementation.
	 * syntax
	 * abstract return_type method_name()arg1,.....agr2;
	 * e.g 
	 * abstract void add()
	 * abstract int getArea(int 1,int b)
	 * 
	 * every abstract must have child class and child class must override abstract methods.
	 * we can't create object of abstract class.
	 * level of abstraction 0-100%
	 * syntax
	 * abstract class Class_name{
	 * abstract methods
	 * non-abstract methods 

	 * }
	 * 2. Interface;
	 *  same as class which contains public abstract methods and public static final variable only
	 *  every interface must have at least one implementation and impl.class must override abstract methods. 
	 *  we can't create object of interface. 
	 *  100% abstraction 
	 *  we can inherit multiple interfaces at a time . (multiple inheritance support only in interface not in class (java)
	 *  syntax
	 *  interface interface_name{
	 *  public abstract methods 
	 *  }
	 * 
	 * */

}
