package sg.nus.iss.validator.workshop.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import sg.nus.iss.validator.workshop.model.Customer;

@Controller
public class CustomerController { 
  @GetMapping("customer/create")
  public String createCustomer(Model model) {
    model.addAttribute("customer", new Customer());
    
    return "create-customer";
  }

  @PostMapping("customer/create")
  public String saveCustomerAction(@ModelAttribute @Valid Customer customer, BindingResult results,
                 Model model) {    
	  
	if(!results.hasErrors())
	{
		  model.addAttribute("customer", customer);
		    return "create-customer-success";	
	}
	
	else return "create-customer";
  
  }

}

