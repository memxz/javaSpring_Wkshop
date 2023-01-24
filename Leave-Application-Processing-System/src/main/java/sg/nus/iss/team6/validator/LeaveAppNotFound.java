package sg.nus.iss.team6.validator;

public class LeaveAppNotFound extends Exception {

	 private static final long serialVersionUID = 1L;
	  
	  public LeaveAppNotFound() {}
	  
	  public LeaveAppNotFound(String msg) {
	    super(msg);
	  }
}
