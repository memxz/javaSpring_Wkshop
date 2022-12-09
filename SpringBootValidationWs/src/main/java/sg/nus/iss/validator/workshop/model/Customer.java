package sg.nus.iss.validator.workshop.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Customer {
	@NotBlank(message = "Name is required")
	@Size(min=3, max=20, 
			message = "username must be 3-20 characters")
	  private String name;
	@NotBlank(message = "Email is required")
	@Email(message=" Email must be validate email address")
	  private String email;
	  private String gender;
	  private String creditCardNumber;
	  private String creditCardExpiration;
	  private String creditCardCVV;

	  public Customer() {
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getEmail() {
	    return email;
	  }

	  public void setEmail(String email) {
	    this.email = email;
	  }

	  public String getGender() {
	    return gender;
	  }

	  public void setGender(String gender) {
	    this.gender = gender;
	  }

	  public String getCreditCardNumber() {
	    return creditCardNumber;
	  }

	  public void setCreditCardNumber(String creditCardNumber) {
	    this.creditCardNumber = creditCardNumber;
	  }

	  public String getCreditCardExpiration() {
	    return creditCardExpiration;
	  }

	  public void setCreditCardExpiration(String creditCardExpiration) {
	    this.creditCardExpiration = creditCardExpiration;
	  }

	  public String getCreditCardCVV() {
	    return creditCardCVV;
	  }

	  public void setCreditCardCVV(String creditCardCVV) {
	    this.creditCardCVV = creditCardCVV;
	  }

	}
