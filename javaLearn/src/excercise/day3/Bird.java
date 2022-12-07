package excercise.day3;

public class Bird extends Animal{
	
	private String birdColor;
	public String deriveAttri="this is derived attribute";
	public Bird(String name,String color) {
		// TODO Auto-generated constructor stub
		super(name);
		this.birdColor=color;
	}
	public void fly() {
		System.out.println("THis is derived fly method");
	}
	@Override
	public void baseMethod() {
		System.out.println("this is override method");
	}
}
