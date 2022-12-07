package excercise.day2;

public class Practise {

	public Practise() {
		// TODO Auto-generated constructor stub
	}
	public <T> boolean isContain(T[] arr,T ele) {
		for(T e : arr) {
			if(e.equals(ele))
				return true;
		}
		return false;
	}

}
