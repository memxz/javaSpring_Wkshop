package model;

import java.util.List;

public class Club {

	private int currentNumber;
	private List<Member> members;
	public Club() {
		// TODO Auto-generated constructor stub
	}

	// public List<Member> addMember(Member mb){
	// 	return this.members.add(mb);
	
	// }
	
	public int getCurrentNumber() {
		return currentNumber;
	}

	public void setCurrentNumber(int currentNumber) {
		this.currentNumber = currentNumber;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public void showMemers() {
		
	}
	
	public boolean removeMember(Member mb){
		return  this.members.remove(mb);
	}
}
