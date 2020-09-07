package DataType;

public class Ehram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Syntax of create an object of Ehram class
		//Syntax: ClassName object =new Ehram();
		
		Ehram obj = new Ehram();
		obj.brake();
		obj.wheel();
		obj.please();
		obj.steering();
		obj.horn();
		obj.headlight();
		obj.oil();
		obj.eccelarate();
	}
	
	public void brake() {
		System.out.println("I need to change my brakes as soon as possible");
	}
	private void wheel() {
		System.out.println("I am changing car wheels");
		
	}
	protected void please() {
		System.out.println("Please protect your personal belongings");
		}
	
    void steering() {
    	System.out.println("If your Steering wheel is making clicking noise that means you need to change the coil");
    }

    public void horn() {
	System.out.println("My horn is not working,I have to fix it");
    }
    
	private void headlight() {
		System.out.println("All new cars headlights are LED");
	}
	
	protected void oil() {
		System.out.println("check engine oil before you do any long journey");
	}

	void eccelarate() {
		System.out.println("Harsh eccelaration is bad");
	}
	
}
