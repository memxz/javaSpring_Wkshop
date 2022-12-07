package excercise.day3;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal("Elephant");
		Animal b=new Bird("xiao Niao","Yellow");
		Bird c=new Bird("hui xi que","gray");
		
		a.baseMethod();
		a.baseMove();
		
		b.baseMethod();
		b.baseMove();
		
		c.baseMethod();
		c.baseMove();
		c.fly();
		System.out.println(a.name+" "+a.baseAttri+"\n"+b.name+b.baseAttri+" \n"+c.name+" "+c.baseAttri+" "+c.deriveAttri);
	}

}
