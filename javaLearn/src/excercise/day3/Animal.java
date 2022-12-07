package excercise.day3;

public class Animal {

	public String name;
	public String baseAttri="This is base attribute";
	public Animal(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	public void baseMethod() {
		System.out.println("This is base method");
	}
    public void baseMove() {
    	System.out.println("This is a move from Base ");
    }
}
