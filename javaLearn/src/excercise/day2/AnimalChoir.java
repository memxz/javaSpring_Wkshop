package excercise.day2;

public class AnimalChoir {

	public AnimalChoir() {
		// TODO Auto-generated constructor stub
	}
	public static void sing(Animal am) {
		am.makeSound();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1=new Dog();
		Animal a2=new Cat();
		Animal a3=new Cow();
		sing(a1);
		sing(a2);
		sing(a3);
	}

}
