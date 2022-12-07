package workshop.day1;

public class Person {
	private String surname;
	private String firstName;
	private String secondName;
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public Person(String surname, String firstName, String secondName) {
		//super();
		this.surname = surname;
		this.firstName = firstName;
		this.secondName = secondName;
	}
	
	public void show() {
		System.out.println(this.toString());
	}
	@Override
	public String toString() {
		return "Person [surname=" + surname + ", firstName=" + firstName + ", secondName=" + (secondName!=null?secondName:"") + "]";
	}
	
	
}
