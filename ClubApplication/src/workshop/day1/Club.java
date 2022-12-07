package workshop.day1;


public class Club {
	private int currentNumber;
	private Member[] member;
	public int getCurrentNumber() {
		return currentNumber;
	}
	public void setCurrentNumber(int currentNumber) {
		this.currentNumber = currentNumber;
	}
	public Member[] getMember() {
		return member;
	}
	public void setMember(Member[] member) {
		this.member = member;
	}
	public void addMember(Person p) {
		int num=0;
		Member m=new Member(num++,p.getFirstName(),p.getSecondName(),p.getSurname());
		member[this.member.length]=m;
	}
	
}
