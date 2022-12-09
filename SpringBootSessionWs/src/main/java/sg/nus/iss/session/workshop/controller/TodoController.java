package sg.nus.iss.session.workshop.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {
  @PostMapping("/add")
  public String add(@RequestParam("todo") String todo, HttpSession sessionObj) {
    // Provide the implementation
	List<String> todoList = (List<String>) sessionObj.getAttribute("todos");
	
	todoList.add(todo);
	sessionObj.setAttribute("todos", todoList);
    return "redirect:/list";
  }

  @GetMapping("/list")
  public String list(Model model,HttpSession sessionObj) {
    List<String> todoList = (List<String>) sessionObj.getAttribute("todos");
    		if (todoList == null) {
    			todoList=new ArrayList<>();    	
    			sessionObj.setAttribute("todos", todoList);
    		}
    model.addAttribute("todoList", todoList);

    return "todos";
  }

  @PostMapping("/clear-session")
  public String destroySession(HttpSession sessionObj) {
    // Provide the implementation
    sessionObj.invalidate();
    return "redirect:/list";
  }
}
