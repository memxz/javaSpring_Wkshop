package workshop.day1;

public class Member extends Person {
	private int memberNumber;
	

	public Member(int memberNumber,String surname, String firstName, String secondName) {
		super(surname, firstName, secondName);
		this.memberNumber=memberNumber;
		// TODO Auto-generated constructor stub
	}

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	
	public void show() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Member [memberNumber=" + memberNumber + "]";
	}

}
