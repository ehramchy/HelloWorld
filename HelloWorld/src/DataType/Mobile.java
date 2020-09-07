package DataType;


public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

		//Syntax of create an object of Mobile class
		//Syntax: ClassName object =new Mobile();
		
		Mobile first = new Mobile();
		
		first.call();
		first.sms();
		first.recharge();
		first.battery();
		first.transport();
	}

	public void call() {
		System.out.println("I am going to call rumman");}
		
	
	private void sms() {
		System.out.println("Everyday we are contacting our classmates by sms");
	}
	protected void recharge() {
		System.out.println("I need car to recharge the motor");
	}
	
	void battery() {
		System.out.println("Battery needs to charge");
	}
	public void transport() {
		System.out.println("In london transport system is very good");
	}
	}
